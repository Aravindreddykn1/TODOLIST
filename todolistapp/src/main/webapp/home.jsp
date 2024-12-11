<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
<style type="text/css">
body{
   background-image: url("img4.avif");
   background-repeat: no-repeat;
]background-size:cover;
  
  
}

table th {
 color: white;
 background-color:orange ;

	
}
table td{
background-color: white;

}
table {
	margin-left: 400px;
	margin-top: 50px;
}
h1{
margin-left: 500px;
	margin-top: 150px;
	color: fuchsia;
}
#a{

height: 40px;
width: 10%;
margin-left: 550px;
margin-top: 40px;
border-radius: 30px;
background-color: orange;
color: white;
}

</style>
</head>

<body>

<h1>TODOLIST TABLE</h1>
<table border="2px">
<tr>
<th>id</th>
<th>Name</th>
<th>start time</th>
<th>end time</th>
<th>work</th>
<th>date</th>
<th colspan="3">Action</th>
</tr>
<%ResultSet rs=(ResultSet)request.getAttribute("rs1");
while(rs.next()){%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td><%=rs.getString(5) %></td>
<td><%=rs.getString(6) %></td>
<td> <a href="delete?id=<%=rs.getInt(1)%>"><button>Delete</button></a> </td>
<td> <a href="update?id=<%=rs.getInt(1)%>"><button>Update</button></a> </td>
</tr>
<%} %>


</table>
<button id="a" ><a href="insert.jsp">ADD TASK</a></button>
</body>
</html>