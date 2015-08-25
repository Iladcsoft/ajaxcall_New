<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/main.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Home Page</title>
</head>
<body>
<center>
<div id="main">
<div id="header"><tiles:insertAttribute name="header" /></div>
<div id="menu"><tiles:insertAttribute name="menu" /></div>
<div id="mainarea"><tiles:insertAttribute name="body" />


</div>
<div id="footer"><tiles:insertAttribute name="footer" /></div>
</div>
</center>
</body>
</html>