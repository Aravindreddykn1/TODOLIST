<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
body{
   background-image: url("back1.avif");
   background-repeat: no-repeat;
   background-size: cover;

}
#a{
    display: flex;
 margin-top: 300px;
 justify-content: center;
 justify-content: space-evenly;
    
    
}
button{
     height: 20px;
     width: 10%;
     border-radius: 10px;
     font-family: Verdana, Geneva, Tahoma, sans-serif;
     font-weight: 700;
    color:maroon;


}
button:hover{
    height: 40px;
    width: 20%;
    background-color: orange;
    color: ;
    transition: 5s;
}
    </style>
</head>
<body>
    <h1 style="color:olivedrab;">TODOLIST APP</h1>
    <div></div>
    <div id="a"> <button ><a href="task">view all task</a></button>
        <button ><a href="insert.jsp">ADD TASK</a></button></div>
   

</body>
</html>