<%-- 
    Document   : index.jsp
    Created on : Dec 28, 2022, 9:31:20 PM
    Author     : sonlich
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        h1 {
            text-align: center;
        }
        #page {
            width: 800px;
            margin: auto;
            color: white;
            text-align: center;
            display: flex;
            justify-content: center;
            flex-direction: column;
        }
        form {
            width: 400px;
            margin: auto;
            display: flex;
            justify-content: center;
            flex-direction: column;
        
        }
        input[type=submit] {
            margin: auto;
        }
        body {
            background-image: url('https://img.freepik.com/free-vector/neon-lights-background-theme_52683-44625.jpg?w=2000');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 100% 100%;
        }
    </style>
</head>
<body>
<div id="page">
    <h1>Labka 11</h1>
    <form method="post">
        <table>
            <tbody>
            <tr>
                <td><label for="name">Name</td>
                <td><input id="name" type="text" name="name"></td>
            </tr>
            <tr>
                <td><label for="surname">Surname</td> 
                <td><input id="surname" type="text" name="surname"></td>
            </tr>
            <tr>
                <td><label for="email">Email</td>
                <td><input id="email" type="text" name="email"></td>
            </tr>
            </tbody>
        </table>
        <input type="submit" name="send" value="Send">
    </form>
    <c:if test="${not empty param.send}">
        <c:set var="id" value="${id+1}" scope="application"/>

        <c:if test="${not empty param.name}">
            <c:set var="name" value="${param.name}" scope="session"></c:set>
            <p>
                Name: ${param.name}
            </p>
        </c:if>
        <c:if test="${not empty param.surname}">
            <c:set var="surname" value="${param.surname}" scope="session"></c:set>
            <p>
                Surname: ${param.surname}
            </p>
        </c:if>
        <c:if test="${not empty param.email}">
            <c:set var="email" value="${param.email}" scope="session"></c:set>
            <p>
                Email: ${param.email}
            </p>
        </c:if>
    </c:if>
</div>
</body>
</html>
