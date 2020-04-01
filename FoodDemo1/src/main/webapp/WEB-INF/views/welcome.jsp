 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Foodie</title>
<link href="<c:url value="/resources/style/style1.css" />"
 rel="stylesheet">
</head>
<body background="<c:url value="/resources/images/bac.jpg"/>"/>
<!--  <img class="img1" src="<c:url value="/resources/images/niitLogo.png"/>"/>-->
<h1 align="center">WELCOME</h1>
			<hr color="Black" size="3" />


<div style="color: white" align="center">
Hello Foodie:  ${usr.phone} </div>

</body>
</html>