<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="model.FileModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@page import="model.FileModel" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>

<title>Insert title here</title>
</head>
<body>
 <%
                 
                    if (request.getParameter("div") == (null)) {
        %>
<div>
<form action="Uploader" method="post" enctype="multipart/form-data">
	
	<input type="file" name="file" multiple/>
	<input type="submit">
	
	</form>
 
</div>
	<%                            } else {

        %>
        
        <div>
<form action="Uploader" method="post" enctype="multipart/form-data">
	<a>some link</a>
	
	<c:forEach var="line" items="${filenames}">
   <select>
   <option>${line}</option>
   <option>test</option>
   </select>
   </c:forEach>
   
  
	<label for="filename">Choose a file to display:</label>

<select id="filename">
  <%-- <option value="volvo"><%=fm.getFilename()%></option> --%>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
	<input type="file" name="file" multiple/>
	<input type="submit">
	
	</form>
 
</div>

 <%

                }
    %>
    
  
</body>
</html>