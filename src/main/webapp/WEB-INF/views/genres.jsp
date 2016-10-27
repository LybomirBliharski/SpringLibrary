<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
	<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class = "container">
	<jsp:include page="header.jsp"></jsp:include>
  <c:forEach items="${genres}" var="genres">
   <table class="table table-condensed">
    <div class="navbar-default">
     <div class="navbar-nav">
      <li><a href="/books/genres/${genres.name}">${genres.name}</a>
      </li>
     </div>
    </div>
   </table>
  </c:forEach>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>