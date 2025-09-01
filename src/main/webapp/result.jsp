<%@page language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
   <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


    <form id="calcForm" action="add">

         <label for="num1">Number 1:</label>


                   <%--  <input type="number" id="num1" name="num1" value=<%=session.getAttribute("num1")%>><br> --%>

                <input type="number" id="num1" name="num1" value=${num1}><br>

                <label for="num2">Number 2:</label>
                <input type="number" id="num2" name="num2" value=${num2}><br>

        <label for="result"><b>Result:</b></label>
        <input type="text" id="result" value=${result}></input>
    </form>


</body>
</html>
