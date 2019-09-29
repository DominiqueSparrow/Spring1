<%@page import="app.data.Employee"%>
<%@ page import="java.util.List"%>

<html>
<head>
<title>SpringTest1 Customer list</title>

<style type="text/css">
body {
	font-family: sans-serif, arial;
}

table {
	
}

td {
	border: solid 1px gray;
	border-radius: 5px;
}
</style>

</head>

<body>
	<table>
		<%
			List<Employee> l = (List<Employee>) request.getAttribute("employeeList");
			for (int i = 0; i < l.size(); i++) {
		%>
		<tr>
			<td><%=l.get(i).getEmployeeId() %></td>
			<td><%=l.get(i).getFirstName() %></td>
			<td><%=l.get(i).getLastName() %></td>
			<td><%=l.get(i).getPhone() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>