<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>My Profile</title>

<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #141e30, #243b55);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background-color: #ffffff;
        padding: 40px;
        border-radius: 16px;
        text-align: center;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
        width: 90%;
        max-width: 450px;
        transition: transform 0.3s ease;
    }

    .card:hover {
        transform: translateY(-5px);
    }

    h1 {
        color: #243b55;
        margin-bottom: 20px;
        font-size: 28px;
    }

    h2 {
        color: #555555;
        font-size: 20px;
        line-height: 1.6;
    }

    .highlight {
        color: #007bff;
        font-weight: bold;
    }
</style>


</head>

<body>

<%!
	String getNameAndId(String name, int id) {
		return "My name is " + name + ", my ID is " + id;
	}
%>

<%
	String name = "zakaria reda";
	int id = 1612;
	String output = getNameAndId(name, id);
%>

<div class="card">
    <h1>My Profile</h1>
    <h2><%= output %></h2>
</div>

</body>
</html>
