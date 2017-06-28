<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 在解析el表达式是一定要加上这一句话，否则不能解析 -->
<%@ page isELIgnored="false" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table style="border: 1px;">
			<tr>
				<th>用户名</th>
				<th>性别</th>
				<th>地址</th>
			</tr>
			
			<c:forEach items="${requestScope.listUser }" var="user">
				<tr>
					<td>${user.username }</td>
					<td>${user.sex }</td>
					<td>${user.address }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>