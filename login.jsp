<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="/eNotes/checkUser" method="post">
            Email: <input type="email" name="mail"><br>
            Password: <input type="password" name="pass"><br>
            <input type="submit" value="Login">
        </form>
        <% if(request.getAttribute("error")!=null){ %>
        <p style="color: red;"><%= request.getAttribute("error") %> </p>
        <% } %>
    </body>
</html>
