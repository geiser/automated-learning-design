<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/xml" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<list size="${fn:length(metadatas)}">
<c:forEach varStatus="metadataStatus" var="metadata" items="${metadatas}">
	<metadata>
	    <id>${metadata.id}</id>
	    <type>${metadata.type}</type>
	    <identifier>${metadata.identifier}</identifier>
	    
        <properties size="${fn:length(metadata.properties)}">
        <c:forEach varStatus="propertyStatus" var="property" items="${metadata.properties}">
            <property id="${property.id}" name="${property.name}">
                <id>${property.id}</id>
                <name>${property.name}</name>
                <value>${property.value}</value>
                <c:if test="${not empty property.resource}">
                <resource>
                    <id>${property.resource.id}</id>
                    <type>${property.resource.type}</type>
                    <identifier>${property.resource.identifier}</identifier>
                    <title>${property.resource.propertyMap['title'][0].value}</title>
                </resource>
                </c:if>
            </property>
        </c:forEach>
        </properties>
	    
	    <relations size="${fn:length(metadata.relations)}">
	    <c:forEach varStatus="relationStatus" var="relation" items="${metadata.relations}">
	        <relation>
	            <id>${relation.id}</id>
	            <name>${relation.name}</name>
	            <c:if test="${not empty relation.value}">
	            <value>
	                <id>${relation.value.id}</id>
	                <type>${relation.value.type}</type>
	                <identifier>${relation.value.identifier}</identifier>
	            </value>
	            </c:if>
	        </relation>
	    </c:forEach>
	    </relations>
	</metadata>
</c:forEach>
</list>