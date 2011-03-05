<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Learner : <c:out value="${metadata.identifier}" /></title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/AutomatedLD.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/gxt-all.css"/>" type="text/css" rel="stylesheet"/>
	<!-- JQuery Validator -->
	<!--<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/js/screen.css"/>" />-->
	<script src="<c:url value="/js/jquery.js"/>" type="text/javascript" language="javascript"></script>
	<script src="<c:url value="/js/jquery.validate.js"/>" type="text/javascript" language="javascript"></script>
	<script type="text/javascript" language="javascript" >
	$(document).ready(function() {
		
		var hasCompetenceLevelCount = 0<c:if test="${not empty metadata.propertyMap['hasCompetenceLevel']}"> + <c:out value="${fn:length(metadata.propertyMap['hasCompetenceLevel'])}" /></c:if>;       
        $("#removeHasCompetenceLevel").click(function() {
            if (hasCompetenceLevelCount > 0) {
            	hasCompetenceLevelCount--;
                var hasCompetenceLevelID = "hasCompetenceLevel" + hasCompetenceLevelCount;
                $("#" + hasCompetenceLevelID).remove();
            }
        });
        
        $("#addHasCompetenceLevel").click(function() {
            if (hasCompetenceLevelCount < 10) {
            	var hasCompetenceLevelID = "hasCompetenceLevel" + hasCompetenceLevelCount;
            	var count = hasCompetenceLevelCount + 10;
            	$("#hasCompetenceLevelContainer").append("" +
                        "<div id='" + hasCompetenceLevelID + "'>" +
                        "<label for='properties[" + count + "].resource.id'>Competence</label>" +
                        "<select class='required' id='properties[" + count + "].resource.id' name='properties[" + count + "].resource.id'>" +
                            "<option value=''>-- choose value --</option>" +
                            <c:forEach varStatus="competenceStatus" var="competence" items="${competences}">
                            "<option value='<c:out value="${competence.id}" />' ><c:out value="${competence.propertyMap['skill'][0].resource.propertyMap['title'][0].value}" /> <c:out value="${competence.propertyMap['knowledge'][0].resource.propertyMap['title'][0].value}" /></option>" +
                            </c:forEach>
                        "</select>*" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;" +
                        "<label for='properties[" + count + "].value'>Level (skill - knowledge)</label>" +
                        "<select class='required' id='properties[" + count + "].value' name='properties[" + count + "].value'>" +
	                        "<option value=''>-- choose value --</option>"  +
	                        "<option value='nothing-nothing'>nothing - nothing</option>" +
	                        "<option value='nothing-accretion'>nothing - accretion</option>" +
	                        "<option value='nothing-tuning'>nothing - tuning</option>" +
	                        "<option value='nothing-restructuring'>nothing - restructuring</option>" +
	                        "<option value='rough-nothing'>rough - nothing</option>" +
	                        "<option value='rough-accretion'>rough - accretion</option>" +
	                        "<option value='rough-tuning'>rough - tuning</option>" +
	                        "<option value='rough-restructuring'>rough - restructuring</option>" +
	                        "<option value='explanatory-nothing'>explanatory - nothing</option>" +
	                        "<option value='explanatory-accretion'>explanatory - accretion</option>" +
	                        "<option value='explanatory-tuning'>explanatory - tuning</option>" +
	                        "<option value='explanatory-restructuring'>explanatory - restructuring</option>" +
	                        "<option value='associative-nothing'>associative - nothing</option>" +
	                        "<option value='associative-accretion'>associative - accretion</option>" +
	                        "<option value='associative-tuning'>associative - tuning</option>" +
	                        "<option value='associative-restructuring'>associative - restructuring</option>" +
	                        "<option value='autonomous-nothing'>autonomous - nothing</option>" +
	                        "<option value='autonomous-accretion'>autonomous - accretion</option>" +
	                        "<option value='autonomous-tuning'>autonomous - tuning</option>" +
	                        "<option value='autonomous-restructuring'>autonomous - restructuring</option>" +
                        "</select>*" +
                        "<input id='properties[" + count  + "].name' type='hidden' name='properties[" + count  + "].name' value='hasCompetenceLevel' />" +
                    "</div>");
            	hasCompetenceLevelCount++;
            }
        });
		
		// jquery validator
		$("#form").validate();
	});
	</script>
</head>    
<body>

    <h1>Learner : <c:out value="${metadata.identifier}" /></h1>
    
    <form class="cmxform" id="form" name="dados" method="POST" action="<c:url value="/metadatas/learners" />" accept-charset="UTF-8">
    <fieldset id="learner">
    	<legend>Skill</legend>
    	<p>
    		<label for="metadata.identifier">Email</label>
    		<c:if test="${not empty (metadata.id)}" >
    			<input id="metadata.id" type="hidden" name="metadata.id" value="${metadata.id}" />
    		</c:if>
    		<input id="metadata.type" type="hidden" name="metadata.type" value="learner" />
    		<input class="required email" minlength="3" id="metadata.identifier" type="text" name="metadata.identifier" value='<c:out value="${metadata.identifier}" />'/>*
    	</p>
    	<p>
    		<label for="properties[0].value">Educational Level</label>
    		<c:if test="${not empty (metadata.propertyMap['hasEducationalLevel'][0].id)}" >
    			<input id="properties[0].id" type="hidden" name="properties[0].id" value="${metadata.propertyMap['hasEducationalLevel'][0].id}" />
    		</c:if>
    		<input id="properties[0].name" type="hidden" name="properties[0].name" value="hasEducationalLevel" />
    		<select class='required' id='properties[0].value' name='properties[0].value'>
            	<option value=''>-- choose value --</option>
            	<option value="school"			<c:if test = "${metadata.propertyMap['hasEducationalLevel'][0].value eq 'school'}">selected="selected"</c:if>>School</option>
            	<option value="higherEducation" <c:if test = "${metadata.propertyMap['hasEducationalLevel'][0].value eq 'higherEducation'}">selected="selected"</c:if>>Higher Education</option>
            	<option value="training"		<c:if test = "${metadata.propertyMap['hasEducationalLevel'][0].value eq 'training'}">selected="selected"</c:if>>Training</option>
            	<option value="other"		<c:if test = "${metadata.propertyMap['hasEducationalLevel'][0].value eq 'other'}">selected="selected"</c:if>>Other</option>
			</select>*
    	</p>
    	<p>
    	<input id="properties[1].name" type="hidden" name="properties[1].name" value="hasAllowedEducationalLevel" />
    	</p>
        <fieldset id="hasCompetenceLevel">
            <legend>Competence Level</legend>
            <div><span>Options :
                <a id="addHasCompetenceLevel" href="#">[+]</a> <a id="removeHasCompetenceLevel" href="#">[-]</a></span>
                <div id="hasCompetenceLevelContainer">
                    <c:forEach varStatus="hasCompetenceLevelStatus" var="hasCompetenceLevel" items="${metadata.propertyMap['hasCompetenceLevel']}">
                        <div id='hasCompetenceLevel<c:out value="${hasCompetenceLevelStatus.count-1}" />'>
                            <label for='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].resource.id'>Competence</label>
                            <select class='required' id='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].resource.id' name='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].resource.id'>
                                <option value=''>-- choose value --</option>
                                <c:forEach varStatus='competenceStatus' var='competence' items='${competences}'>
                                <option value='<c:out value="${competence.id}" />' <c:if test = "${competence.id eq hasCompetenceLevel.resource.id}">selected='selected'</c:if>><c:out value="${competence.propertyMap['skill'][0].resource.propertyMap['title'][0].value}" /> <c:out value="${competence.propertyMap['knowledge'][0].resource.propertyMap['title'][0].value}" /></option>
                                </c:forEach>
                            </select>*
                            &nbsp;&nbsp;&nbsp;&nbsp;<br/>
                            <label for='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].value'>Level (skill - knowledge)</label>
                            <select class='required' id='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].value' name='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].value'>
                                <option value=''>-- choose value --</option>
                                <option value='nothing-nothing'				<c:if test = "${hasCompetenceLevel.value eq 'nothing-nothing'}">selected="selected"</c:if>>nothing - nothing</option>
                                <option value='nothing-accretion'			<c:if test = "${hasCompetenceLevel.value eq 'nothing-accretion'}">selected="selected"</c:if>>nothing - accretion</option>
                                <option value='nothing-tuning'				<c:if test = "${hasCompetenceLevel.value eq 'nothing-tuning'}">selected="selected"</c:if>>nothing - tuning</option>
                                <option value='nothing-restructuring' 		<c:if test = "${hasCompetenceLevel.value eq 'nothing-restructuring'}">selected="selected"</c:if>>nothing - restructuring</option>
                                <option value='rough-nothing' 				<c:if test = "${hasCompetenceLevel.value eq 'rough-nothing'}">selected="selected"</c:if>>rough - nothing</option>
                                <option value='rough-accretion'				<c:if test = "${hasCompetenceLevel.value eq 'rough-accretion'}">selected="selected"</c:if>>rough - accretion</option>
                                <option value='rough-tuning'				<c:if test = "${hasCompetenceLevel.value eq 'rough-tuning'}">selected="selected"</c:if>>rough - tuning</option>
                                <option value='rough-restructuring'			<c:if test = "${hasCompetenceLevel.value eq 'rough-restructuring'}">selected="selected"</c:if>>rough - restructuring</option>
                                <option value='explanatory-nothing'			<c:if test = "${hasCompetenceLevel.value eq 'explanatory-nothing'}">selected="selected"</c:if>>explanatory - nothing</option>
                                <option value='explanatory-accretion'		<c:if test = "${hasCompetenceLevel.value eq 'explanatory-accretion'}">selected="selected"</c:if>>explanatory - accretion</option>
                                <option value='explanatory-tuning'			<c:if test = "${hasCompetenceLevel.value eq 'explanatory-tuning'}">selected="selected"</c:if>>explanatory - tuning</option>
                                <option value='explanatory-restructuring'	<c:if test = "${hasCompetenceLevel.value eq 'explanatory-restructuring'}">selected="selected"</c:if>>explanatory - restructuring</option>
                                <option value='associative-nothing'			<c:if test = "${hasCompetenceLevel.value eq 'associative-nothing'}">selected="selected"</c:if>>associative - nothing</option>
                                <option value='associative-accretion'		<c:if test = "${hasCompetenceLevel.value eq 'associative-accretion'}">selected="selected"</c:if>>associative - accretion</option>
                                <option value='associative-tuning'			<c:if test = "${hasCompetenceLevel.value eq 'associative-tuning'}">selected="selected"</c:if>>associative - tuning</option>
                                <option value='associative-restructuring'	<c:if test = "${hasCompetenceLevel.value eq 'associative-restructuring'}">selected="selected"</c:if>>associative - restructuring</option>
                                <option value='autonomous-nothing'			<c:if test = "${hasCompetenceLevel.value eq 'autonomous-nothing'}">selected="selected"</c:if>>autonomous - nothing</option>
                                <option value='autonomous-accretion'		<c:if test = "${hasCompetenceLevel.value eq 'autonomous-accretion'}">selected="selected"</c:if>>autonomous - accretion</option>
                                <option value='autonomous-tuning'			<c:if test = "${hasCompetenceLevel.value eq 'autonomous-tuning'}">selected="selected"</c:if>>autonomous - tuning</option>
                                <option value='autonomous-restructuring'	<c:if test = "${hasCompetenceLevel.value eq 'autonomous-restructuring'}">selected="selected"</c:if>>autonomous - restructuring</option>
                            </select>*
                            <input id='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].name' type='hidden' name='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].name' value='hasCompetenceLevel' />
                            <input id='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].id'  type='hidden' name='properties[<c:out value="${hasCompetenceLevelStatus.count-1+10}" />].id' value='${hasCompetenceLevel.id}' />
                        </div><br/>
                    </c:forEach>
                </div>
            </div>
        </fieldset>
        
		<fieldset id="relations">
	    </fieldset>
    	<button type="submit" name="Submit" value="Ok" >Send</button>
	</fieldset>
    </form>
    
    <c:if test="${not empty (metadata.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/metadatas/learners/${metadata.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
</body>
</html>
