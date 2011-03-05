<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:imscp="http://www.imsglobal.org/xsd/imscp_v1p1"
	xmlns:imsld="http://www.imsglobal.org/xsd/imsld_v1p0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
<xsl:output method="html"/>
<xsl:template match="/imscp:manifest">
<html>
<head>
	<title><xsl:value-of select="@identifier" /></title>
</head>
<body>
	<h1><xsl:value-of select="@identifier" /></h1>
	<h2><xsl:value-of select="imscp:organizations/imsld:learning-design/@identifier" /></h2>
	<h3><xsl:value-of select="imscp:organizations/imsld:learning-design/imsld:title" /></h3>
	<hr/>
	
	<xsl:for-each select="imscp:organizations/imsld:learning-design/imsld:method/imsld:play">
	<div>
		<table border="1" >
		<thead>
			<tr>
				<th><xsl:value-of select="imsld:title" /></th>
			</tr>
			<tr>
				<th>Pap&#233;is</th>
				<xsl:for-each select="imsld:act">
				<th>Ato: <xsl:value-of select="imsld:title" /></th>
				</xsl:for-each>
			</tr>
		</thead>
		<tbody>
		    <xsl:for-each select="imsld:act[1]">
		        <xsl:for-each select="imsld:role-part">
		        <tr>
		            <td>
		                identifier: <xsl:value-of select="imsld:role-ref/@ref" /><br/>
		                title:
		            </td>
				    <td>
				        Role-part: <xsl:value-of select="imsld:title" /><br/>
				        learning-activity: <xsl:value-of select="imsld:learning-activity-ref/@ref" />
				    </td>
				    <td></td>
		        </tr>
		        </xsl:for-each>
		    </xsl:for-each>
		    <xsl:for-each select="imsld:act[2]">
		        <xsl:for-each select="imsld:role-part">
		        <tr>
		            <td>
		                identifier: <xsl:value-of select="imsld:role-ref/@ref" /><br/>
		                title:
		            </td>
				    <td></td>
				    <td>
				        Role-part: <xsl:value-of select="imsld:title" /><br/>
				        learning-activity: <xsl:value-of select="imsld:learning-activity-ref/@ref" />
				    </td>
		        </tr>
		        </xsl:for-each>
		    </xsl:for-each>
		</tbody>	
		</table>
	</div><br/>
	</xsl:for-each>
	
</body>
</html>
</xsl:template>
</xsl:stylesheet>
















