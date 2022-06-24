<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include> --%>
	<!-- <div id="content"> -->
		<h3>[사원 정보 목록]</h3>
		<div id="list-top">
			<form action="list.hr" method="post">
			<div>
				<ul>
					<li><span>부서명</span></li>
					<li>
						<select name="dept_name" class='w-px160' onchange="$('form').submit()">
							<option value="all" ${dept_id eq 'all' ? 'selected':''}>전체</option>
							<c:forEach items="${depts}" var="vo">
							<option value="${vo.department_id}" ${dept_id ne 'all' and dept_id eq vo.department_id ? 'selected':'' }>
							${vo.department_name }</option>
							</c:forEach>
						</select>
					
				</ul> 
			</div>
		
		</form>
		</div>
		<table>
			<thead>
			<tr class='w-px120'>
				<th>사번</th>
				<th>성명</th>
				<th>부서코드</th>
				<th>부서명</th>
				<th>업무코드</th>
				<th>업무명</th>
				<th>급여</th>
			</tr>
			</thead>
			<tbody>
				
			<c:forEach items="${list}" var="i">
				<tr>
					<td>${i.employee_id }</td>
					<td><a href="detail.hr?id=${i.employee_id}">${i.last_name} ${i.first_name}</a></td>
					<td>${i.department_id}</td>
					<td>${i.department_name}</td>
					<td>${i.job_id }</td>
					<td>${i.job_title }</td>
					<td>${i.salary }</td>
				</tr>
			</c:forEach>
				
			
			</tbody>
		
		</table>
<!-- 	</div> -->
<%-- <jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>	 --%>

</body>
</html>