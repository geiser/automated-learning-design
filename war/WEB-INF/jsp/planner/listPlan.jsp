<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of plans</title>
</head>
<body>

<h1>List of plans</h1>

<ul>
	<c:forEach varStatus="planStatus" var="plan" items="${planList}">
	<li>
		${plan.name} -
		<a href="<c:url value="/planner/${plan.id}/imsld" />">show imsmanifest.xml</a>
		<a href="<c:url value="/planner/${plan.id}/ims-cp.zip" />">get content package</a>
		<a href="<c:url value="/planner/${plan.id}/publish" />">publish package</a>
<!--		<a href="<c:url value="/planner/${plan.id}/xslt" />">show with xslt</a>-->
	</li>
	</c:forEach>
</ul>
</body>
</html>