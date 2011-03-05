<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Resource : <c:out value="${metadata.identifier}" /></title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/AutomatedLD.css"/>" type="text/css" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/gxt-all.css"/>" type="text/css" rel="stylesheet"/>
	<!-- JQuery Validator -->
	<!--<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/js/screen.css"/>" />-->
	<script src="<c:url value="/js/jquery.js"/>" type="text/javascript" language="javascript"></script>
	<script src="<c:url value="/js/jquery.validate.js"/>" type="text/javascript" language="javascript"></script>
	<script type="text/javascript" language="javascript" >
	$(document).ready(function() {
		
		var educationalObjectiveCount = 0<c:if test="${not empty metadata.propertyMap['hasEducationalObjective']}"> + <c:out value="${fn:length(metadata.propertyMap['hasEducationalObjective'])}" /></c:if>;       
        $("#removeEducationalObjective").click(function() {
            if (educationalObjectiveCount > 0) {
            	educationalObjectiveCount--;
                var educationalObjectiveID = "educationalObjective" + educationalObjectiveCount;
                $("#" + educationalObjectiveID).remove();
            }
        });
        
        $("#addEducationalObjective").click(function() {
            if (educationalObjectiveCount < 10) {
            	var educationalObjectiveID = "educationalObjective" + educationalObjectiveCount;
            	var count = educationalObjectiveCount + 10;
            	$("#educationalObjectiveContainer").append("" +
                        "<div id='" + educationalObjectiveID + "'>" +
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
                        "<input id='properties[" + count  + "].name' type='hidden' name='properties[" + count  + "].name' value='hasEducationalObjective' />" +
                    "</div>");
                educationalObjectiveCount++;
            }
        });
		
		// jquery validator
		$("#form").validate();
	});
	</script>
</head>    
<body>

    <h1>Resource : <c:out value="${metadata.identifier}" /></h1>
    
    <form class="cmxform" id="form" name="dados" method="POST" action="<c:url value="/metadatas/resources" />" accept-charset="UTF-8">
    <fieldset id="resource">
    	<legend>Resource</legend>
    	<p>
    		<label for="metadata.identifier">URL</label>
    		<c:if test="${not empty (metadata.id)}" >
    			<input id="metadata.id" type="hidden" name="metadata.id" value="${metadata.id}" />
    		</c:if>
    		<input id="metadata.type" type="hidden" name="metadata.type" value="resource" />
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
    	<p>
            <label for="properties[1].value">Learning Context</label>
            <c:if test="${not empty (metadata.propertyMap['hasLearningContext'][0].id)}" >
                <input id="properties[1].id" type="hidden" name="properties[1].id" value="${metadata.propertyMap['hasLearningContext'][0].id}" />
            </c:if>
            <input id="properties[1].name" type="hidden" name="properties[1].name" value="hasLearningContext" />
            <select class='required' id='properties[1].value' name='properties[1].value'>
                <option value=''>-- choose value --</option>
                <option value="school" <c:if test = "${'school' eq metadata.propertyMap['hasLearningContext'][0].value}">selected="selected"</c:if>>School</option>
                <option value="higherEducation" <c:if test = "${'higherEducation' eq metadata.propertyMap['hasLearningContext'][0].value}">selected="selected"</c:if>>Higher Education</option>
                <option value="training" <c:if test = "${'training' eq metadata.propertyMap['hasLearningContext'][0].value}">selected="selected"</c:if>>Training</option>
                <option value="other" <c:if test = "${'other' eq metadata.propertyMap['hasLearningContext'][0].value}">selected="selected"</c:if>>Other</option>
            </select>*
        </p>
        <p>
            <label for="properties[2].value">Difficulty</label>
            <c:if test="${not empty (metadata.propertyMap['hasDifficulty'][0].id)}" >
                <input id="properties[2].id" type="hidden" name="properties[2].id" value="${metadata.propertyMap['hasDifficulty'][0].id}" />
            </c:if>
            <input id="properties[2].name" type="hidden" name="properties[2].name" value="hasDifficult" />
            <select class='required' id='properties[2].value' name='properties[2].value'>
                <option value=''>-- choose value --</option>
                <option value="veryEasy" <c:if test = "${'veryEasy' eq metadata.propertyMap['hasDifficult'][0].value}">selected="selected"</c:if>>Very Easy</option>
                <option value="easy" <c:if test = "${'easy' eq metadata.propertyMap['hasDifficult'][0].value}">selected="selected"</c:if>>Easy</option>
                <option value="medium" <c:if test = "${'medium' eq metadata.propertyMap['hasDifficult'][0].value}">selected="selected"</c:if>>Medium</option>
                <option value="difficult" <c:if test = "${'difficult' eq metadata.propertyMap['hasDifficult'][0].value}">selected="selected"</c:if>>Difficult</option>
                <option value="veryDifficult" <c:if test = "${'veryDifficult' eq metadata.propertyMap['hasDifficult'][0].value}">selected="selected"</c:if>>Very Difficult</option>
            </select>*
        </p>
        <p>
            <label for="properties[3].value">Representation Type</label>
            <c:if test="${not empty (metadata.propertyMap['hasRepresetationType'][0].id)}" >
                <input id="properties[3].id" type="hidden" name="properties[3].id" value="${metadata.propertyMap['hasRepresetationType'][0].id}" />
            </c:if>
            <input id="properties[3].name" type="hidden" name="properties[3].name" value="hasRepresetationType" />
            <select class='required' id='properties[3].value' name='properties[3].value'>
                <option value=''>-- choose value --</option>
                <option value="text" <c:if test = "${'text' eq metadata.propertyMap['hasRepresetationType'][0].value}">selected="selected"</c:if>>Text or HTML</option>
                <option value="video" <c:if test = "${'video' eq metadata.propertyMap['hasRepresetationType'][0].value}">selected="selected"</c:if>>Video</option>
                <option value="audio" <c:if test = "${'audio' eq metadata.propertyMap['hasRepresetationType'][0].value}">selected="selected"</c:if>>Audio</option>
                <option value="image" <c:if test = "${'image' eq metadata.propertyMap['hasRepresetationType'][0].value}">selected="selected"</c:if>>Image</option>
                <option value="application" <c:if test = "${'application' eq metadata.propertyMap['hasRepresetationType'][0].value}">selected="selected"</c:if>>Application</option>
            </select>* (Format MIME-TYPE)
        </p>
        <p>
            <label for="properties[4].value">Learning Resource Type</label>
            <c:if test="${not empty (metadata.propertyMap['hasLearningResourceType'][0].id)}" >
                <input id="properties[4].id" type="hidden" name="properties[4].id" value="${metadata.propertyMap['hasLearningResourceType'][0].id}" />
            </c:if>
            <input id="properties[4].name" type="hidden" name="properties[4].name" value="hasLearningResourceType" />
            <select class='required' id='properties[4].value' name='properties[4].value'>
                <option value=''>-- choose value --</option>
                <option value="lecture" <c:if test = "${'lecture' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Lecture</option>
                <option value="exercise" <c:if test = "${'exercise' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Exercise</option>
                <option value="simulation" <c:if test = "${'simulation' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Simulation</option>
                <option value="introduction" <c:if test = "${'introduction' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Introduction</option>
                <option value="questionnaire" <c:if test = "${'questionnaire' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Questionnaire</option>
                <option value="exam" <c:if test = "${'exam' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Exam</option>
                <option value="experiment" <c:if test = "${'experiment' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Experiment</option>
                <option value="problemStament" <c:if test = "${'problemStament' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Problem Stament</option>
                <option value="selfAssesment" <c:if test = "${'selfAssesment' eq metadata.propertyMap['hasLearningResourceType'][0].value}">selected="selected"</c:if>>Self-Assesment</option>
            </select>* (Instructional Role)
        </p>
<!--        <p>-->
<!--            <label for="properties[5].value">Interactivity Type</label>-->
<!--            <c:if test="${not empty (metadata.propertyMap['hasInteractivityType'][0].id)}" >-->
<!--                <input id="properties[5].id" type="hidden" name="properties[5].id" value="${metadata.propertyMap['hasInteractivityType'][0].id}" />-->
<!--            </c:if>-->
<!--            <input id="properties[5].name" type="hidden" name="properties[5].name" value="hasInteractivityType" />-->
<!--            <select class='required' id='properties[5].value' name='properties[5].value'>-->
<!--                <option value=''>-- choose value --</option>-->
<!--                <option value="active" <c:if test = "${'active' eq metadata.propertyMap['hasInteractivityType'][0].value}">selected="selected"</c:if>>active</option>-->
<!--                <option value="expositive" <c:if test = "${'expositive' eq metadata.propertyMap['hasInteractivityType'][0].value}">selected="selected"</c:if>>expositive</option>-->
<!--                <option value="mixed" <c:if test = "${'mixed' eq metadata.propertyMap['hasInteractivityType'][0].value}">selected="selected"</c:if>>mixed</option>-->
<!--            </select>*-->
<!--        </p>-->
        
        <fieldset id="hasEducationalObjective">
            <legend>Educational Objectives</legend>
            <div><span>Options :
                <a id="addEducationalObjective" href="#">[+]</a> <a id="removeEducationalObjective" href="#">[-]</a></span>
                <div id="educationalObjectiveContainer">
                    <c:forEach varStatus="educationalObjectiveStatus" var="educationalObjective" items="${metadata.propertyMap['hasEducationalObjective']}">
                        <div id='educationalObjective<c:out value="${educationalObjectiveStatus.count-1}" />'>
                            <label for='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].resource.id'>Competence</label>
                            <select class='required' id='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].resource.id' name='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].resource.id'>
                                <option value=''>-- choose value --</option>
                                <c:forEach varStatus='competenceStatus' var='competence' items='${competences}'>
                                <option value='<c:out value="${competence.id}" />' <c:if test = "${competence.id eq educationalObjective.resource.id}">selected='selected'</c:if>><c:out value="${competence.propertyMap['skill'][0].resource.propertyMap['title'][0].value}" /> <c:out value="${competence.propertyMap['knowledge'][0].resource.propertyMap['title'][0].value}" /></option>
                                </c:forEach>
                            </select>*
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <label for='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].value'>Level (skill - knowledge)</label>
                            <select class='required' id='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].value' name='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].value'>
                                <option value=''>-- choose value --</option>
                                <option value='nothing-nothing' <c:if test = "${educationalObjective.value eq 'nothing-nothing'}">selected="selected"</c:if>>nothing - nothing</option>
                                <option value='nothing-accretion' <c:if test = "${educationalObjective.value eq 'nothing-accretion'}">selected="selected"</c:if>>nothing - accretion</option>
                                <option value='nothing-tuning' <c:if test = "${educationalObjective.value eq 'nothing-tuning'}">selected="selected"</c:if>>nothing - tuning</option>
                                <option value='nothing-restructuring' <c:if test = "${educationalObjective.value eq 'nothing-restructuring'}">selected="selected"</c:if>>nothing - restructuring</option>
                                <option value='rough-nothing' <c:if test = "${educationalObjective.value eq 'rough-nothing'}">selected="selected"</c:if>>rough - nothing</option>
                                <option value='rough-accretion' <c:if test = "${educationalObjective.value eq 'rough-accretion'}">selected="selected"</c:if>>rough - accretion</option>
                                <option value='rough-tuning' <c:if test = "${educationalObjective.value eq 'rough-tuning'}">selected="selected"</c:if>>rough - tuning</option>
                                <option value='rough-restructuring' <c:if test = "${educationalObjective.value eq 'rough-restructuring'}">selected="selected"</c:if>>rough - restructuring</option>
                                <option value='explanatory-nothing' <c:if test = "${educationalObjective.value eq 'explanatory-nothing'}">selected="selected"</c:if>>explanatory - nothing</option>
                                <option value='explanatory-accretion' <c:if test = "${educationalObjective.value eq 'explanatory-accretion'}">selected="selected"</c:if>>explanatory - accretion</option>
                                <option value='explanatory-tuning' <c:if test = "${educationalObjective.value eq 'explanatory-tuning'}">selected="selected"</c:if>>explanatory - tuning</option>
                                <option value='explanatory-restructuring' <c:if test = "${educationalObjective.value eq 'explanatory-restructuring'}">selected="selected"</c:if>>explanatory - restructuring</option>
                                <option value='associative-nothing' <c:if test = "${educationalObjective.value eq 'associative-nothing'}">selected="selected"</c:if>>associative - nothing</option>
                                <option value='associative-accretion' <c:if test = "${educationalObjective.value eq 'associative-accretion'}">selected="selected"</c:if>>associative - accretion</option>
                                <option value='associative-tuning' <c:if test = "${educationalObjective.value eq 'associative-tuning'}">selected="selected"</c:if>>associative - tuning</option>
                                <option value='associative-restructuring' <c:if test = "${educationalObjective.value eq 'associative-restructuring'}">selected="selected"</c:if>>associative - restructuring</option>
                                <option value='autonomous-nothing' <c:if test = "${educationalObjective.value eq 'autonomous-nothing'}">selected="selected"</c:if>>autonomous - nothing</option>
                                <option value='autonomous-accretion' <c:if test = "${educationalObjective.value eq 'autonomous-accretion'}">selected="selected"</c:if>>autonomous - accretion</option>
                                <option value='autonomous-tuning' <c:if test = "${educationalObjective.value eq 'autonomous-tuning'}">selected="selected"</c:if>>autonomous - tuning</option>
                                <option value='autonomous-restructuring' <c:if test = "${educationalObjective.value eq 'autonomous-restructuring'}">selected="selected"</c:if>>autonomous - restructuring</option>
                            </select>*
                            <input id='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].name' type='hidden' name='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].name' value='hasEducationalObjective' />
                            <input id='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].id'  type='hidden' name='properties[<c:out value="${educationalObjectiveStatus.count-1+10}" />].id' value='${educationalObjective.id}' />
                        </div>
                    </c:forEach>
                </div>
            </div>
        </fieldset>
<!--		<fieldset id="relations">-->
<!--	    	<legend>Relations</legend>-->
<!--	    	<div>-->
<!--	    		<span>Options : <a id="addRelation1" href="#">[+]</a> <a id="removeRelation1" href="#">[-]</a></span>-->
<!--	    		<div id="relationContainer">-->
<!--	    			<c:forEach varStatus="relationStatus" var="relation" items="${metadata.relations}">-->
<!--	    			<br/>${relation.id} - ${relation.id}-->
<!--    				</c:forEach>-->
<!--	    		</div>-->
<!--	    	</div>-->
<!--	    </fieldset>-->
    	<button type="submit" name="Submit" value="Ok" >Send</button>
	</fieldset>
    </form>
        
    <c:if test="${not empty (metadata.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/metadatas/resources/${metadata.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
</body>
</html>
