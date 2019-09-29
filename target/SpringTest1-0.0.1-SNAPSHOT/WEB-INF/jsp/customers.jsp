<%@ page import="java.util.List"%>
<%@ page import="app.data.Customer"%>

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
		<%  List<Customer> l = (List<Customer>) request.getAttribute("customerList");
			for (int i = 0; i < l.size(); i++) { %>
		<tr>
			<td><%=  l.get(i).getCustomerId() %></td>
			<td><%=  l.get(i).getName() %></td>
			<td><%=  l.get(i).getAddress() %></td>
			</tr>
		<% } %>
	</table>
</body>
</html>