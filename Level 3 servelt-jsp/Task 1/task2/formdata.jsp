<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information Form</title>

<style>
    * {
        box-sizing: border-box;
    }

    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
        margin: 0;
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 20px;
    }

    .form-container {
        background-color: white;
        width: 100%;
        max-width: 450px;
        padding: 30px;
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.2);
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 25px;
    }

    .form-group {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 8px;
        font-weight: bold;
        color: #444;
    }

    input[type="text"],
    select {
        width: 100%;
        padding: 12px;
        border: 1px solid #ccc;
        border-radius: 7px;
        font-size: 15px;
        outline: none;
        transition: border-color 0.3s;
    }

    input[type="text"]:focus,
    select:focus {
        border-color: #667eea;
    }

    .radio-group {
        display: flex;
        gap: 15px;
        flex-wrap: wrap;
    }

    .radio-option {
        display: flex;
        align-items: center;
        gap: 5px;
        font-weight: normal;
        cursor: pointer;
    }

    input[type="radio"] {
        accent-color: #667eea;
        cursor: pointer;
    }

    input[type="submit"] {
        width: 100%;
        padding: 13px;
        background-color: #667eea;
        color: white;
        border: none;
        border-radius: 7px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #5145cd;
    }

    @media (max-width: 480px) {
        .form-container {
            padding: 20px;
        }
    }
</style>

</head>
<body>

    <div class="form-container">

        <h2>User Information Form</h2>

        <form action="/servlet_jsp_912/forms/recievedata.jsp" method="post">

            <div class="form-group">
                <label for="fullName">Full Name</label>
                <input type="text" id="fullName"
                       name="fullName" placeholder="Enter your full name"
                       required>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="text" id="password"
                       name="password" placeholder="Enter your password"
                       required>
            </div>

            <div class="form-group">
                <label for="age">Age</label>
                <input type="text" id="age"
                       name="age" placeholder="Enter your age"
                       required>
            </div>

            <div class="form-group">
                <label>Address (Radio Buttons)</label>

                <div class="radio-group">

                    <label class="radio-option">
                        <input type="radio" name="radioAddress"
                               value="Cairo" required>
                        Cairo
                    </label>

                    <label class="radio-option">
                        <input type="radio" name="radioAddress"
                               value="Alex">
                        Alex
                    </label>

                    <label class="radio-option">
                        <input type="radio" name="radioAddress"
                               value="Menofia">
                        Menofia
                    </label>

                </div>
            </div>

            <div class="form-group">
                <label for="selectAddress">Address (Select)</label>

                <select id="selectAddress" name="selectAddress">
                    <option value="Cairo">Cairo</option>
                    <option value="Alex">Alex</option>
                    <option value="Menofia">Menofia</option>
                </select>
            </div>

            <input type="submit" value="Submit">

        </form>

    </div>

</body>
</html>

