<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<jsp:include page="head.jsp"></jsp:include>
<body>
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		
		<div class="row">
			<c:forEach items="${books}" var="book">
					<div class="col-md-3 col-xs-3">
						<img src="http://placehold.it/150x200">
						<h5><a href="#">${book.name}</a></h5>
						<p>Genre:  ${book.genre.name}</p>
						<p>Author: ${book.author.firstName} ${book.author.lastName}</p>
						<p>Publishing date:  ${book.publishingDate}</p>
						<a class="btn btn-info btn-sm" href = "#order" data-toggle="modal">Order</a>
						<h3></h3>
					</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>