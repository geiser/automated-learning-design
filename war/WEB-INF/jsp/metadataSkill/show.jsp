<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Skill : <c:out value="${metadata.identifier}" /></title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/AutomatedLD.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/gxt-all.css"/>" type="text/css" rel="stylesheet"/>
	<!-- JQuery Validator -->
	<!--<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/js/screen.css"/>" />-->
	<script src="<c:url value="/js/jquery.js"/>" type="text/javascript" language="javascript"></script>
	<script src="<c:url value="/js/jquery.validate.js"/>" type="text/javascript" language="javascript"></script>
	<script type="text/javascript" language="javascript" >
	$(document).ready(function() {
		
		var relationCount = 0<c:if test="${not empty metadata.relations}"> + <c:out value="${fn:length(metadata.relations)}" /></c:if>;		
		$("#removeRelation").click(function() {
			if (relationCount > 0) {
				relationCount--;
				var relationID = "relation" + relationCount;
				$("#" + relationID).remove();
			}
		});
		
		$("#addRelation").click(function() {
			if (relationCount < 10) {
				var relationID = "relation" + relationCount;
				$("#relationContainer").append("" +
					"<div id='" + relationID + "'>" +
		    			"<label for='relations[" + relationCount + "].name'>Relation</label>" +
				    	"<select class='required' id='relations[" + relationCount + "].name' name='relations[" + relationCount + "].name'>" +
				    		"<option value=''>-- choose value --</option>" +
				    		"<option value='isRequieredBy'>isRequieredBy</option>" +
				    		//"<option value='isA'>isA</option>" +
				    		//"<option value='isVariantOf'>isVariantOf</option>" +
				    	"</select>*" +
				    	"&nbsp;&nbsp;&nbsp;&nbsp;" +
						"<label for='relations[" + relationCount + "].value.id'>Skill</label>" +				
						"<select class='required' id='relations[" + relationCount + "].value.id' name='relations[" + relationCount + "].value.id'>" +
							"<option value=''>-- choose value --</option>" +
				    		<c:forEach varStatus="skillStatus" var="skill" items="${skills}">
				    		"<option value='<c:out value="${skill.id}" />'><c:out value="${skill.propertyMap['title'][0].value}" /></option>" +
					    	</c:forEach>
				    	"</select>*" +
					"</div>");
				relationCount++;
			}
		});
		
		// jquery validator
		$("#form").validate();
	});
	</script>
</head>    
<body>

    <h1>Skill : <c:out value="${metadata.identifier}" /></h1>
    
    <form class="cmxform" id="form" name="dados" method="POST" action="<c:url value="/metadatas/skills" />" accept-charset="UTF-8">
    <fieldset id="skill">
    	<legend>Skill</legend>
    	<p>
    		<label for="metadata.identifier">URL</label>
    		<c:if test="${not empty (metadata.id)}" >
    			<input id="metadata.id" type="hidden" name="metadata.id" value="${metadata.id}" />
    		</c:if>
    		<input id="metadata.type" type="hidden" name="metadata.type" value="skill" />
    		<input size="55" class="required url" minlength="3" id="metadata.identifier" type="text" name="metadata.identifier" value='<c:out value="${metadata.identifier}" />'/>*
    	</p>
    	<p>
    		<label for="properties[0].value">Title</label>
    		<c:if test="${not empty (metadata.propertyMap['title'][0].id)}" >
    			<input id="properties[0].id" type="hidden" name="properties[0].id" value="${metadata.propertyMap['title'][0].id}" />
    		</c:if>
    		<input id="properties[0].name" type="hidden" name="properties[0].name" value="title" />
    		<input class="required" minlength="3" id="properties[0].value" type="text" name="properties[0].value" value="<c:out value="${metadata.propertyMap['title'][0].value}" />" />*
    	</p>
		<fieldset id="relations">
	    	<legend>Relations</legend>
	    	<div>
	    		<span>Options : <a id="addRelation" href="#">[+]</a> <a id="removeRelation" href="#">[-]</a></span>
	    		<div id="relationContainer">
	    			<c:forEach varStatus="relationStatus" var="relation" items="${metadata.relations}">
    					<div id='relation<c:out value="${relationStatus.count-1}" />'>
					    	<label for="relations[<c:out value="${relationStatus.count-1}" />].name">Relation</label>
					    	<select class='required' id='relations[<c:out value="${relationStatus.count-1}" />].name' name='relations[<c:out value="${relationStatus.count-1}" />].name'>
					    		<option value=''>-- choose value --</option>
					    		<option value="isRequieredBy" <c:if test = "${relation.name eq 'isRequieredBy'}">selected="selected"</c:if>>isRequieredBy</option>
<!--					    		<option value="isA" <c:if test = "${relation.name eq 'isA'}">selected="selected"</c:if>>isA</option>-->
<!--					    		<option value="isVariantOf" <c:if test = "${relation.name eq 'isVariantOf'}">selected="selected"</c:if>>isVariantOf</option>-->
					    	</select>*
					    	&nbsp;&nbsp;&nbsp;&nbsp;
							<label for="relations[<c:out value="${relationStatus.count-1}" />].value.id">Skill</label>
							<select class='required' id='relations[<c:out value="${relationStatus.count-1}" />].value.id' name='relations[<c:out value="${relationStatus.count-1}" />].value.id'>
								<option value=''>-- choose value --</option>
					    		<c:forEach varStatus="skillStatus" var="skill" items="${skills}">
					    		<option value="<c:out value="${skill.id}" />" <c:if test = "${skill.id eq relation.value.id}">selected="selected"</c:if>><c:out value="${skill.propertyMap['title'][0].value}" /></option>
						    	</c:forEach>
					    	</select>*
					    	<input id='relations[<c:out value="${relationStatus.count-1}" />].id'  type='hidden' name='relations[<c:out value="${relationStatus.count-1}" />].id' value='${relation.id}' />
						</div>
    				</c:forEach>
	    		</div>
	    	</div>
	    </fieldset>
    	<button type="submit" name="Submit" value="Ok" >Send</button>
	</fieldset>
    </form>
    
    <c:if test="${not empty (metadata.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/metadatas/skills/${metadata.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
</body>
</html>
