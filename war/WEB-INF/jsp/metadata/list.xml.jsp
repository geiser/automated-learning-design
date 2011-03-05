<%@page isELIgnored="false" %>
<%@page language="java" contentType="text/xml" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<list size="${fn:length(metadatas)}">
<c:forEach varStatus="metadataStatus" var="metadata" items="${metadatas}">
	<metadata name="<c:choose><c:when test="${not empty metadata.propertyMap['title']}"><c:out value="${metadata.propertyMap['title'][0].value}" /></c:when><c:otherwise><c:out value="${metadata.identifier}" /></c:otherwise></c:choose>" >
		<id><c:out value="${metadata.id}" /></id>
		<type><c:out value="${metadata.type}" /></type>
		<identifier><c:out value="${metadata.identifier}" /></identifier>
		
		<properties size="${fn:length(metadata.properties)}">
		<c:forEach varStatus="propertyStatus" var="property" items="${metadata.properties}">
	       <property id="${property.id}" name="${property.name}">
	           <id><c:out value="${property.id}" /></id>
	           <name><c:out value="${property.name}" /></name>
	           <value><c:out value="${property.value}" /></value>
	           <c:if test="${not empty property.resource}">
	           <resource>
	               <id><c:out value="${property.resource.id}" /></id>
	               <type><c:out value="${property.resource.type}" /></type>
	               <identifier><c:out value="${property.resource.type}" /></identifier>
	           </resource>
	           </c:if>
	       </property>
	   </c:forEach>
	   </properties>
	   
	   <relations size="${fn:length(metadata.relations)}">
	   <c:forEach varStatus="relationStatus" var="relation" items="${metadata.relations}">
	       <relation>
	           <id><c:out value="${relation.id}" /></id>
	           <name><c:out value="${relation.name}" /></name>
	           <c:if test="${not empty relation.value}">
	           <value>
	               <id><c:out value="${relation.value.id}" /></id>
	               <type><c:out value="${relation.value.type}" /></type>
	               <identifier><c:out value="${relation.value.identifier}" /></identifier>
	           </value>
	           </c:if>
	       </relation>
	   </c:forEach>
	   </relations>
	</metadata>
</c:forEach>
</list>