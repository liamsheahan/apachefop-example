<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
  <xsl:template match="/">
    <fo:root>
      <fo:layout-master-set>
        <fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="2cm" margin-left="2.5cm" margin-right="2.5cm">
          <fo:region-body margin-top="3cm"/>
          <fo:region-before extent="3cm"/>
          <fo:region-after extent="1.5cm"/>
        </fo:simple-page-master>
      </fo:layout-master-set>
<fo:page-sequence master-reference="simple" initial-page-number="{$start-page}">
  <fo:static-content flow-name="xsl-region-before">
    <fo:block text-align="center">
      <fo:external-graphic src="logo.jpg"/>
    </fo:block>
  </fo:static-content>
  <fo:static-content flow-name="xsl-region-after">
    <fo:block text-align="center">
      Page <fo:page-number/>
    </fo:block>
  </fo:static-content>
  <fo:flow flow-name="xsl-region-body">
    <!-- Page content goes here -->
  </fo:flow>
</fo:page-sequence>
    </fo:root>
  </xsl:template>
</xsl:stylesheet>
