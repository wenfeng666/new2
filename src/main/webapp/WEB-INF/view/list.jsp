<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
	<table	class="table">
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>价格</td>
			<td>百分百</td>
		</tr>
			<c:forEach items="${info.list }" var="c">
				<tr>
					<td>${c.id }</td>
					<td>${c.name }</td>
					<td>${c.jia }</td>
					<td>${c.bai }</td>
				</tr>
			</c:forEach>
				<tr>
					<td colspan="10">
					<a>
					<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
					</a>
					</td>
				</tr>
	</table>
</body>
		<script type="text/javascript">
			function goPage(pageNum) {
				location.href="/list?pageNum="+pageNum
			}
		
		
		
		
		
		
		
		
		
		</script>

</html>