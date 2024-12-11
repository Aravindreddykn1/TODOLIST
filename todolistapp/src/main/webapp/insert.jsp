<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add task</title>
<style>

    form{

    margin-top: 100px;
    margin-left: 250px;

    

    }
    div{
        background-color: orange;
        width: 50%;
        margin-left: 400px;
        border-radius: 10px;
        
    
        
    }
    h3{
        background-color: brown;
        height: 20px;
        width: 10%;
        text-align: center;
    }
</style>
</head>
<body>
    <h3>ADD TASK</h3>
    <div>
  <form action="insert">
    <br><br><br><br>
  <input type="text" placeholder="id" name="id">
  <br><br><br>
        <input type="text" placeholder="name" name="name">
        <br><br><br>
        <input type="text" placeholder="task" name="task">
        <br><br><br>
        <input type="text" placeholder="starttime" name="starttime">
        <br><br><br>
        <input type="text"  placeholder="endtime" name="endtime">
        <br><br><br>
        <input type="date"  placeholder="date"  name="date">
        <br><br><br>
        <button type="submit">ADD TASK</button>
    </form>
</div>
</body>
</html>