<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<footer>
   <div class="container">
    <hr>
    <p class="pull-right">Design by SoftServe Lv - 205 Java <span id="year"></span></p>
   </div>
</footer>
<script>
  document.getElementById("year").innerHTML = new Date().getFullYear();
</script>