<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String fullName = request.getParameter("fullName");
    String password = request.getParameter("password");
    String ageValue = request.getParameter("age");
    String radioAddress = request.getParameter("radioAddress");
    String selectAddress = request.getParameter("selectAddress");

    int age = 0;

    if (ageValue != null && ageValue.matches("\\d+")) {
        age = Integer.parseInt(ageValue);
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>User Information</title>

<style>
    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }

    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 15px;
    }

    .container {
        background: #ffffff;
        width: 100%;
        max-width: 400px;
        border-radius: 15px;
        overflow: hidden;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);
    }

    .header {
        background: linear-gradient(135deg, #667eea, #764ba2);
        color: white;
        text-align: center;
        padding: 22px 15px;
    }

    .icon {
        width: 55px;
        height: 55px;
        background: rgba(255, 255, 255, 0.2);
        border: 2px solid rgba(255, 255, 255, 0.5);
        border-radius: 50%;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 27px;
        margin: 0 auto 10px;
    }

    .header h1 {
        font-size: 22px;
        margin-bottom: 7px;
    }

    .header p {
        font-size: 12px;
        opacity: 0.9;
    }

    .content {
        padding: 18px;
    }

    .info-item {
        display: flex;
        justify-content: space-between;
        align-items: center;
        gap: 12px;
        padding: 12px;
        margin-bottom: 8px;
        background: #f8f9ff;
        border: 1px solid #eaecf8;
        border-radius: 9px;
        transition: 0.3s;
    }

    .info-item:hover {
        background: #eef0ff;
        transform: translateY(-2px);
    }

    .label {
        color: #666;
        font-size: 13px;
        font-weight: bold;
    }

    .value {
        color: #333;
        font-size: 13px;
        font-weight: bold;
        text-align: right;
        overflow-wrap: anywhere;
    }

    .badge {
        background: #e8eaff;
        color: #5145cd;
        padding: 6px 10px;
        border-radius: 20px;
        font-size: 12px;
    }

    .footer {
        text-align: center;
        padding: 0 18px 20px;
    }

    .back-button {
        display: inline-block;
        width: 100%;
        padding: 11px;
        background: #667eea;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-size: 14px;
        font-weight: bold;
        transition: 0.3s;
    }

    .back-button:hover {
        background: #5145cd;
        transform: translateY(-2px);
    }

    .note {
        margin-top: 12px;
        color: #999;
        font-size: 11px;
    }

    @media (max-width: 400px) {
        .content {
            padding: 12px;
        }

        .info-item {
            padding: 10px;
            gap: 8px;
        }

        .label,
        .value {
            font-size: 12px;
        }
    }
</style>

</head>
<body>

    <div class="container">

        <div class="header">
            <div class="icon">&#10003;</div>
            <h1>User Information</h1>
            <p>Your submitted information</p>
        </div>

        <div class="content">

            <div class="info-item">
                <span class="label">Full Name</span>
                <span class="value">
                    <%= fullName != null ? fullName : "Not provided" %>
                </span>
            </div>

            <div class="info-item">
                <span class="label">Password</span>
                <span class="value">Hidden for privacy</span>
            </div>

            <div class="info-item">
                <span class="label">Age</span>
                <span class="value">
                    <%= ageValue != null && ageValue.matches("\\d+") ? age : "Not provided" %>
                </span>
            </div>

            <div class="info-item">
                <span class="label">Radio Address</span>
                <span class="value badge">
                    <%= radioAddress != null ? radioAddress : "Not selected" %>
                </span>
            </div>

            <div class="info-item">
                <span class="label">Selected Address</span>
                <span class="value badge">
                    <%= selectAddress != null ? selectAddress : "Not selected" %>
                </span>
            </div>

        </div>

        <div class="footer">
            <a href="form.jsp" class="back-button">
                &#8592; Back to Form
            </a>

            <p class="note">
                Thank you for submitting your information!
            </p>
        </div>

    </div>

</body>
</html>
