import java.io.File;
import java.io.OutputStream;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class FOPExample {
  public static void main(String[] args) throws Exception {
    // Set up the FOP factory and user agent
    FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
    FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

    // Set up the output stream for the PDF file
    OutputStream out = new java.io.FileOutputStream("output.pdf");

    try {
      // Create a FOP object and set the output format to PDF
      Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

      // Set up the transformer to transform the XML input into XSL-FO
      TransformerFactory factory = TransformerFactory.newInstance();
      Transformer transformer = factory.newTransformer(new StreamSource("template.xsl"));

      // Set the value of the "start-page" parameter used in the XSLT
      transformer.setParameter("start-page", 5);

      // Transform the XML input into XSL-FO and generate the PDF file
      transformer.transform(new StreamSource("input.xml"), new SAXResult(fop.getDefaultHandler()));
    } finally {
      out.close();
    }
  }
}
