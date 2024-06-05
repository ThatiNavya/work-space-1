<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Book List</title>
  </head>
  <body>
    <h1>Book List</h1>
    <table border="1">
      <tr>
        <th>Book ID</th>
        <th>Book Name</th>
        <th>Book Price</th>
      </tr>
      <c:forEach items="${booksMsg}" var="book">
        <tr>
          <td>${book.bookId}</td>
          <td>${book.bookName}</td>
          <td>${book.bookPrice}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
