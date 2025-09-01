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
        <label> <b><i> Add two numbers</b></i></label>
        <label for="num1">Number 1:</label>
        <input type="number" id="num1" name="num1" required><br>

        <label for="num2">Number 2:</label>
        <input type="number" id="num2" name="num2" required><br>

        <button type="submit">Calculate</button><br><br>

        <label for="result">Result:</label>
        <input type="text" id="result" readonly>
    </form>


</body>
</html>
