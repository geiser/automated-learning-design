<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Resources</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="<c:url value="/AutomatedLD.css" />">
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/gxt-all.css" />" />
    <!-- GWT Javascript -->
    <script type="text/javascript" language="javascript" >
    	var injectorsHolder = new Object();
    	function executeInjections() {
    		for (var i in injectorsHolder) {
    			injectorsHolder[i]();
    		}
    	}
    </script>
	<script type="text/javascript" language="javascript" src="<c:url value="/automatedld/automatedld.nocache.js" />"></script>
	<script type="text/javascript" language="javascript" src="<c:url value="/resources/flash/swfobject.js" />"></script>
</head>
<body>
	<br/>
    <h1>Resources (<a href="<c:url value="/resources/add" />" >Add</a>)</h1>
    <table align="center">
      <tr>
        <td id="resourceContainer">
        
        <script type="text/javascript" language="javascript" >
            //var fields = new Array("identifier","properties/property[@name='title']/value");
            //var titles = new Array("URL","Title");
            //injectorsHolder['skillContainer'] = function() {
            //    addMetadataListView('skillContainer', 'skill', fields, titles, '<c:url value="/" />');
            //};
        </script>
 		
	    <!-- if your web app will not function without JavaScript enabled -->
		<!--<noscript>-->
	    <div style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif">
	        <div>
	        <ul>
	            <li>Id - Title - Options ( <a href="<c:url value="/resources/add" />" >Add</a> )</li>
	                <c:forEach varStatus="resourceStatus" var="resource" items="${resources}">
	                <li><c:out value="${resource.id}" /> -
	                    <c:out value="${resource.title}" /> -
	                    <a href="<c:url value="/resources/${resource.id}/edit" />" >Edit / Delete</a>
	                    <a href="<c:url value="/resources/${resource.id}" />" >Show</a>
	                    </li>
	                </c:forEach>
	        </ul>
	        </div>
	    </div>
		<!--</noscript>-->
 		
        </td>
      </tr>
    </table>
</body>
</html>