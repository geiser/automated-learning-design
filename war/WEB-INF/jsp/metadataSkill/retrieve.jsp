<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Skill <c:out value="${object.title}" /></title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link type="text/css" rel="stylesheet" href="<c:url value="/AutomatedLD.css"/>" />
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/gxt-all.css" />" />
    
    <!-- JQuery Validator -->
<!--    <link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/js/screen.css"/>" />-->
	<script src="<c:url value="/js/jquery.js"/>" type="text/javascript" language="javascript" ></script>
	<script src="<c:url value="/js/jquery.validate.js"/>" type="text/javascript" language="javascript" ></script>
	<script type="text/javascript" language="javascript" >
	$(document).ready(function() {
		$("#form").validate({
			rules: {
				"object.identifier": {
					required: false,
					minlength: 5,
					url: true
				},
				"object.title": {
					required: true,
					minlength: 5
				},
				"object.learningContext": {
					required: true
				}
			}
		});
	});
	</script>
</head>
<body>

    <h1>Skill : <c:out value="${object.title}" /></h1>
    
    <form id="form" name="dados" method="POST" action="<c:url value="/rest/skills" />" accept-charset="UTF-8">
    	<c:if test="${not empty (object.id)}" >
			<input type="hidden" id="id" name="id" value="<c:out value="${object.id}" />" /> <br/>
    	</c:if>
    	
    	<label for="identifier">URL (resource):</label>
    	<input type="text" id="object.identifier" name="object.identifier" value="<c:out value="${object.identifier}" />" /><br/>
    	
    	<label for="object.title">Title:</label>
    	<input type="text" id="object.title" name="object.title" value="<c:out value="${object.title}" />" />*<br/>
    	
    	<label for="object.learningContext">Learning Context:</label>
    	<select id="object.learningContext" name="object.learningContext">
            <option value="">Choose Level:</option>
            <option value="school" <c:if test="${object.learningContext == 'school'}">selected="selected"</c:if>>School</option>
            <option value="higherEducation" <c:if test="${object.learningContext == 'higherEducation'}">selected="selected"</c:if>>Higher Education</option>
            <option value="training" <c:if test="${object.learningContext == 'training'}">selected="selected"</c:if>>Training</option>
            <option value="other" <c:if test="${object.learningContext == 'other'}">selected="selected"</c:if>>Other</option>
		</select>*<br/>
    	
    	<button type="submit" name="Submit" value="Ok" >Send</button>
    </form>
    
    <c:if test="${not empty (object.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/rest/skills/${object.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
    <table align="center">
      <tr>
        <td id="skillContainer"></td>
      </tr>
    </table>
    
</body>
</html>