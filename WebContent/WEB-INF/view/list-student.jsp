 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" 
     integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="jumbotron">
  <h1 class="display-4">Welcome to Student Administration System!(Developed by Timuçin Çiçek)</h1> 
 <p> <a class="btn btn-primary btn-lg" onclick="window.location.href='showStudentForm' ; return false;" type="button" role="button">Add Student</a><p>

     <div>
     <h2>Student List</h2>
     </div>
      <div>
     <table class="table table-hover table-dark">
     <tr>
       <th>First Name</th>
              <th>Last Name</th>
              <th>Email Address</th>
              <th>Update/Delete</th>
     </tr>
     <c:forEach var="tempStudent" items="${student}">
     <tr>
     <td>${tempStudent.firstName}</td>
      <td>${tempStudent.lastName}</td>
       <td>${tempStudent.email}</td>
       <td>
       <a class="btn btn-warning" href="${pageContext.request.contextPath}/showFormForUpdate?studentID=${tempStudent.id}">Update</a> <!-- main domain -->
       <a class="btn btn-danger" href="${pageContext.request.contextPath}/deleteStudent?studentID=${tempStudent.id}" 
       onclick="if(!(confirm('Are you sure you want to delete?'))) return false;">Delete</a>
       </td>
     </tr>
     </c:forEach>    
     </table>
     </div>
      </div>
      </div>
</body>
</html>