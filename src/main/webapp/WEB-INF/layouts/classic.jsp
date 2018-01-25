<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<title>
	<tiles:getAsString name="title"></tiles:getAsString>
</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2">
				<tiles:insertAttribute name="header"></tiles:insertAttribute>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="menu"></tiles:insertAttribute>
			</td>
			<td>
				<tiles:insertAttribute name="body"></tiles:insertAttribute>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<tiles:insertAttribute name="footer"></tiles:insertAttribute>
			</td>
		</tr>
	</table>
</body>
</html>