<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
          <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
      <h1>Add New Student</h1>     
      </div>      
      <div>
      <form:form class ="form-horizontal" modelAttribute="student" action ="saveStudent" method="POST">
          <form:hidden path="id"/>         
          <div class="form-group">
          
           <label for="adi" class="col-sm-10 control-label">First Name:</label>
           <div>
           <form:input type="text" class="form-control" id="firstname" placeholder="First Name" path="firstName"></form:input>
           </div>
           
          </div>
          <div class="form-group">
           <label for="soyadi" class="col-sm-10 control-label">Last Name:</label>
           <div>
           <form:input type="text" class="form-control" id="lastname" placeholder="Last Name" path="lastName"></form:input>>
           </div>
           
          </div>
          <div class="form-group">
           <label for="email" class="col-sm10 control-label">Student Email:</label>
           <div>
           <form:input type="text" class="form-control" id="email" placeholder="Email" path="email"></form:input>
           </div>
           
          </div>
          <div class="form-group">
           <div class="col-sm-10">
           <button type="submit" class="btn btn-primary"></button>
           </div>
           </div>
          
      </form:form>
      </div>
      <br>
      <p>
      <a href="${pageContext.request.contextPath}/">Go Back to Student List</a>
      </p>
   </div>

</body>
</html>