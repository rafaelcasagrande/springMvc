<%-- 
    Document   : listBooks
    Created on : 06/12/2014, 22:15:19
    Author     : rafael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of Books</title>
    </head>
    <body style="background-color: white">
        <div style="background-color: blueviolet; height: 30px; font-weight: bold;">
            <h2>List of Books</h2>
        </div>
        <br>
        <table border="0" width="90%">
            <tbody>
                <tr style="background-color: blueviolet; font-weight: bold;">
                    <td> Title </td>
                    <td> ISBN </td>
                    <td> Date Edition </td>
                    <td> Edition </td>
                    <td> Editor </td>
                </tr>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td> ${book.title} </td>
                        <td> ${book.isbn} </td>
                        <td> ${book.dateEdition} </td>
                        <td> ${book.edition} </td>
                        <td> ${book.editor} </td>
                    </tr> 
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
