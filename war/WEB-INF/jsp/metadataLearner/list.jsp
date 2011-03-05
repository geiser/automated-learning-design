<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Learners</title>
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
    <h1>Learners (<a href="<c:url value="/metadatas/learners/add" />" >Add</a> )</h1>
    <table align="center">
      <tr>
        <td id="learnerContainer">
        
        <script type="text/javascript" language="javascript" >
            var fields = new Array("identifier","properties/property[@name='hasEducationalLevel']/value","properties/property[@name='hasAllowedEducationalLevel']/value");
            var titles = new Array("Email","Educational Level", "Allowed Educational Level");
            injectorsHolder['learnerContainer'] = function() {
                addMetadataListView('learnerContainer', 'learner', fields, titles, '<c:url value="/" />');
            };
 		</script>
 		
	    <!-- if your web app will not function without JavaScript enabled -->
	    <noscript>
	    <div style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif">
	        Your web browser must have JavaScript enabled
	        in order for this application to display correctly.
	        <div>
	        <ul>
	            <li>Identifier (email) - Options ( <a href="<c:url value="/metadatas/learners/add" />" >Add</a> )</li>
	                <c:forEach varStatus="metadataStatus" var="metadata" items="${metadatas}">
	                <li><c:out value="${metadata.identifier}" /> -
	                     <a href="<c:url value="/metadatas/learners/${metadata.id}" />" >Edit / Delete</a></li>
	                </c:forEach>
	        </ul>
	        </div>
	    </div>
	    </noscript>
 		
        </td>
      </tr>
    </table>
</body>
</html>
