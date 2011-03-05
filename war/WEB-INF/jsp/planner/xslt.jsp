<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript" src="http://www.jongma.org/webtools/jquery/jquery.1.1.3.js" language="javascript"></script>
<script type="text/javascript" src="http://www.jongma.org/webtools/jquery/jquery.xslt.js"  language="javascript"></script>
<script type="text/javascript" language="javascript">
$(function() {
//	$.ajax({
//		url: '<c:url value="/planner/${id}/imsld" />',
//		dataType: 'html',
//		success: function(data) {
//			$('#xmldata').text(data);
//		}
//	});
//	$.ajax({
//		url: '<c:url value="/imsld.xsl" />',
//		dataType: 'html',
//		success: function(data) {
//			$('#xsldata').text(data);
//		}
//	});

	// The magic
	$('#output').xslt({xmlUrl: '<c:url value="/planner/${id}/imsld" />', xslUrl: '<c:url value="/imsld.xsl" />'});
});
</script>
</head>
<body>
	<div id="output" style="padding: 2px;">
	</div>
	
<!--	<hr/>-->
<!--	XML:<br />-->
<!--	<div style="height: 150px; border: 1px solid #000000; overflow: scroll;">-->
<!--		<pre id="xmldata">-->
<!--		</pre>-->
<!--	</div><br />-->
<!--	XSLT:<br />-->
<!--	<div style="height: 150px; border: 1px solid #000000; overflow: scroll;">-->
<!--		<pre id="xsldata">-->
<!--		</pre>-->
<!--	</div><br />-->
	
</body>
</html>

