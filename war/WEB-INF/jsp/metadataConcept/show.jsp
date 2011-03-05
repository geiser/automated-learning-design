<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Concept : <c:out value="${metadata.identifier}" /></title>
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
                        "<br/>" +
                        "<label for='relations[" + relationCount + "].value.id'>Concept</label>" +                
                        "<select class='required' id='relations[" + relationCount + "].value.id' name='relations[" + relationCount + "].value.id'>" +
                            "<option value=''>-- choose value --</option>" +
                            <c:forEach varStatus="conceptStatus" var="concept" items="${concepts}">
                            "<option value='<c:out value="${concept.id}" />'><c:out value="${concept.propertyMap['title'][0].value}" /></option>" +
                            </c:forEach>
                        "</select>*" +
                        "<br/>" +
                    "</div>");
                relationCount++;
            }
        });
	    
        // the rest of java script is used by properties
        
		var hasObjectiveCount = 0<c:if test="${not empty metadata.propertyMap['hasObjective']}"> + <c:out value="${fn:length(metadata.propertyMap['hasObjective'])}" /></c:if>;       
        $("#removeHasObjective").click(function() {
            if (hasObjectiveCount > 0) {
            	hasObjectiveCount--;
                var hasObjectiveID = "hasObjective" + hasObjectiveCount;
                $("#" + hasObjectiveID).remove();
            }
        });
        
        $("#addHasObjective").click(function() {
            if (hasObjectiveCount < 10) {
            	var hasObjectiveID = "hasObjective" + hasObjectiveCount;
            	var count = hasObjectiveCount + 10;
            	$("#hasObjectiveContainer").append("" +
                        "<div id='" + hasObjectiveID + "'>" +
                        "<label for='properties[" + count + "].resource.id'>Competence</label>" +
                        "<select class='required' id='properties[" + count + "].resource.id' name='properties[" + count + "].resource.id'>" +
                            "<option value=''>-- choose value --</option>" +
                            <c:forEach varStatus="competenceStatus" var="competence" items="${competences}">
                            "<option value='<c:out value="${competence.id}" />' ><c:out value="${competence.propertyMap['skill'][0].resource.propertyMap['title'][0].value}" /> <c:out value="${competence.propertyMap['knowledge'][0].resource.propertyMap['title'][0].value}" /></option>" +
                            </c:forEach>
                        "</select>*" +
                        "<br/>" +
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
                        "<input id='properties[" + count  + "].name' type='hidden' name='properties[" + count  + "].name' value='hasObjective' />" +
                        "<br/>" +
                    "</div>");
                hasObjectiveCount++;
            }
        });
		
		// jquery validator
		$("#form").validate();
	});
	</script>
</head>    
<body>

    <h1>Concept : <c:out value="${metadata.identifier}" /></h1>
    
    <form class="cmxform" id="form" name="dados" method="POST" action="<c:url value="/metadatas/concepts" />" accept-charset="UTF-8">
    <fieldset id="concept">
    	<legend>Concept</legend>
    	<p>
    		<label for="metadata.identifier">URL (resume)</label>
    		<c:if test="${not empty (metadata.id)}" >
    			<input id="metadata.id" type="hidden" name="metadata.id" value="${metadata.id}" />
    		</c:if>
    		<input id="metadata.type" type="hidden" name="metadata.type" value="concept" />
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
        <fieldset id="hasObjective">
            <legend>Objectives</legend>
            <div><span>Options :
                <a id="addHasObjective" href="#">[+]</a> <a id="removeHasObjective" href="#">[-]</a></span>
                <div id="hasObjectiveContainer">
                    <c:forEach varStatus="hasObjectiveStatus" var="hasObjective" items="${metadata.propertyMap['hasObjective']}">
                        <div id='hasObjective<c:out value="${hasObjectiveStatus.count-1}" />'>
                            <label for='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].resource.id'>Competence</label>
                            <select class='required' id='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].resource.id' name='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].resource.id'>
                                <option value=''>-- choose value --</option>
                                <c:forEach varStatus='competenceStatus' var='competence' items='${competences}'>
                                <option value='<c:out value="${competence.id}" />' <c:if test = "${competence.id eq hasObjective.resource.id}">selected='selected'</c:if>><c:out value="${competence.propertyMap['skill'][0].resource.propertyMap['title'][0].value}" /> <c:out value="${competence.propertyMap['knowledge'][0].resource.propertyMap['title'][0].value}" /></option>
                                </c:forEach>
                            </select>*
                            <br/>
                            <label for='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].value'>Level (skill - knowledge)</label>
                            <select class='required' id='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].value' name='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].value'>
                                <option value=''>-- choose value --</option>
                                <option value='nothing-nothing'				<c:if test = "${hasObjective.value eq 'nothing-nothing'}">selected="selected"</c:if>>nothing - nothing</option>
                                <option value='nothing-accretion'			<c:if test = "${hasObjective.value eq 'nothing-accretion'}">selected="selected"</c:if>>nothing - accretion</option>
                                <option value='nothing-tuning'				<c:if test = "${hasObjective.value eq 'nothing-tuning'}">selected="selected"</c:if>>nothing - tuning</option>
                                <option value='nothing-restructuring' 		<c:if test = "${hasObjective.value eq 'nothing-restructuring'}">selected="selected"</c:if>>nothing - restructuring</option>
                                <option value='rough-nothing' 				<c:if test = "${hasObjective.value eq 'rough-nothing'}">selected="selected"</c:if>>rough - nothing</option>
                                <option value='rough-accretion'				<c:if test = "${hasObjective.value eq 'rough-accretion'}">selected="selected"</c:if>>rough - accretion</option>
                                <option value='rough-tuning'				<c:if test = "${hasObjective.value eq 'rough-tuning'}">selected="selected"</c:if>>rough - tuning</option>
                                <option value='rough-restructuring'			<c:if test = "${hasObjective.value eq 'rough-restructuring'}">selected="selected"</c:if>>rough - restructuring</option>
                                <option value='explanatory-nothing'			<c:if test = "${hasObjective.value eq 'explanatory-nothing'}">selected="selected"</c:if>>explanatory - nothing</option>
                                <option value='explanatory-accretion'		<c:if test = "${hasObjective.value eq 'explanatory-accretion'}">selected="selected"</c:if>>explanatory - accretion</option>
                                <option value='explanatory-tuning'			<c:if test = "${hasObjective.value eq 'explanatory-tuning'}">selected="selected"</c:if>>explanatory - tuning</option>
                                <option value='explanatory-restructuring'	<c:if test = "${hasObjective.value eq 'explanatory-restructuring'}">selected="selected"</c:if>>explanatory - restructuring</option>
                                <option value='associative-nothing'			<c:if test = "${hasObjective.value eq 'associative-nothing'}">selected="selected"</c:if>>associative - nothing</option>
                                <option value='associative-accretion'		<c:if test = "${hasObjective.value eq 'associative-accretion'}">selected="selected"</c:if>>associative - accretion</option>
                                <option value='associative-tuning'			<c:if test = "${hasObjective.value eq 'associative-tuning'}">selected="selected"</c:if>>associative - tuning</option>
                                <option value='associative-restructuring'	<c:if test = "${hasObjective.value eq 'associative-restructuring'}">selected="selected"</c:if>>associative - restructuring</option>
                                <option value='autonomous-nothing'			<c:if test = "${hasObjective.value eq 'autonomous-nothing'}">selected="selected"</c:if>>autonomous - nothing</option>
                                <option value='autonomous-accretion'		<c:if test = "${hasObjective.value eq 'autonomous-accretion'}">selected="selected"</c:if>>autonomous - accretion</option>
                                <option value='autonomous-tuning'			<c:if test = "${hasObjective.value eq 'autonomous-tuning'}">selected="selected"</c:if>>autonomous - tuning</option>
                                <option value='autonomous-restructuring'	<c:if test = "${hasObjective.value eq 'autonomous-restructuring'}">selected="selected"</c:if>>autonomous - restructuring</option>
                            </select>*
                            <input id='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].name' type='hidden' name='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].name' value='hasObjective' />
                            <input id='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].id'  type='hidden' name='properties[<c:out value="${hasObjectiveStatus.count-1+10}" />].id' value='${hasObjective.id}' />
                            <br/>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </fieldset>
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
<!--                                <option value="isA" <c:if test = "${relation.name eq 'isA'}">selected="selected"</c:if>>isA</option>-->
<!--                                <option value="isVariantOf" <c:if test = "${relation.name eq 'isVariantOf'}">selected="selected"</c:if>>isVariantOf</option>-->
                            </select>*
                            <br/>
                            <label for="relations[<c:out value="${relationStatus.count-1}" />].value.id">Concept</label>
                            <select class='required' id='relations[<c:out value="${relationStatus.count-1}" />].value.id' name='relations[<c:out value="${relationStatus.count-1}" />].value.id'>
                                <option value=''>-- choose value --</option>
                                <c:forEach varStatus="conceptStatus" var="concept" items="${concepts}">
                                <option value="<c:out value="${concept.id}" />" <c:if test = "${concept.id eq relation.value.id}">selected="selected"</c:if>><c:out value="${concept.propertyMap['title'][0].value}" /></option>
                                </c:forEach>
                            </select>*
                            <input id='relations[<c:out value="${relationStatus.count-1}" />].id'  type='hidden' name='relations[<c:out value="${relationStatus.count-1}" />].id' value='${relation.id}' />
                            <br/>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </fieldset>
    	<button type="submit" name="Submit" value="Ok" >Send</button>
	</fieldset>
    </form>
        
    <c:if test="${not empty (metadata.id)}" >
    <form id="formRemove" name="dados" method="POST" action="<c:url value="/metadatas/concepts/${metadata.id}" />" accept-charset="UTF-8">
    	<input type="hidden" name="_method"  value="DELETE" />
    	<button type="submit" name="Submit" value="Ok" >Remove</button>
    </form>
    </c:if>
    
</body>
</html>
