<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Form</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
        flex-direction: column; /* Center content vertically */
      }

      form {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
      }

      label {
        display: block;
        margin-bottom: 8px;
      }

      input {
        width: 100%;
        padding: 8px;
        margin-bottom: 16px;
        box-sizing: border-box;
      }

      button {
        background-color: #4caf50;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
      }

      button:hover {
        background-color: #45a049;
      }
      h1 {
        margin-top: 20px; /* Adjust the margin to your preference */
      }
    </style>
  </head>
  <body>
    <h1 id="message"></h1>
    <form id="loginForm" action="#">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" required />

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required />

      <button type="button" onclick="submitForm()">Login</button>
    </form>
    <h1>${msg}</h1>

    <script>
      function submitForm() {
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        var messageElement = document.getElementById("message");

        // Replace this with your actual login logic
        if (username === "example" && password === "password") {
          messageElement.innerText = "Login successful!";
        } else {
          messageElement.innerText = "Invalid username or password.";
        }
      }
    </script>
  </body>
</html>
