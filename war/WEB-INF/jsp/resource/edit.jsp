<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Resource : <c:out value="${resource.id}" /></title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/AutomatedLD.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/gxt-all.css"/>" type="text/css" rel="stylesheet"/>
	<link href="<c:url value="/js/jquery.cleditor.css" />" type="text/css" rel="stylesheet"/>
	<!-- JQuery Validator -->
	<!--<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/js/screen.css"/>" />-->
	<script src="<c:url value="/js/jquery.js"/>" type="text/javascript" language="javascript"></script>
	<script src="<c:url value="/js/jquery.validate.js"/>" type="text/javascript" language="javascript"></script>
    <script src="<c:url value="/js/jquery.cleditor.min.js"/>" type="text/javascript" language="javascript"></script>
	<script type="text/javascript" language="javascript" >
	$(document).ready(function() {
		// jquery validator
        $("#resourcebody").cleditor();
		$("#form").validate();
	});
	</script>
</head>    
<body>
	<br/>
    <h1>Resource : <c:out value="${resource.id}" /></h1>
    <form class="cmxform" id="form" name="dados" method="POST" action="<c:url value="/resources/save" />" accept-charset="UTF-8">
    <fieldset id="resource">
    	<legend>Resource</legend>
    	<p>
    		<c:if test="${not empty (resource.id)}" >
    			<input id="resource.id" type="hidden" name="resource.id" value="${resource.id}" />
    		</c:if>
    		<label for="resource.title">Title</label>
    		<input size="55" class="required" minlength="3" id="resource.title" type="text" name="resource.title" value='<c:out value="${resource.title}" />'/>*
    	</p>
    	<p>
    		<label for="resourcebody">Body</label>
    		<textarea class="required" id="resourcebody" rows="10" cols="40" name="resource.body" >
    			<c:out value="${resource.body}" />
    		</textarea>*
    	</p>
    	<button type="submit" name="Submit" value="Ok" >Send</button>
	</fieldset>
    </form>
    
    <c:if test="${not empty (resource.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/resources/${resource.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
</body>
</html>
