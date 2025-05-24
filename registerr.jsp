<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <form action="/eNotes/RegisterrUser" method ="post">
            Name : <input type="text" name="name"><br>
            Email : <input type="email" name="mail"><br>
            Password : <input type="password" name="pass"><br>
            <input type="submit" value="Register">
            </form>  
        <br><br>
        <a href="/eNotes/myjsp/login.jsp">Sign In</a>
    </body>
</html>
