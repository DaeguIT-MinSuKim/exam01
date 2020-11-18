<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<h2>회원 목록 조회/수정</h2>
	<table border="1">
		 <colgroup>
			<col width="10%">
			<col width="10%">
			<col width="15%">
			<col width="30%">
			<col width="15%">
			<col width="10%">
			<col width="10%">
		</colgroup>
		<thead>
			<tr>
			    <td>회원번호</td>
			    <td>회원성명</td>
			    <td>회원전화</td>
			    <td>회원주소</td>
			    <td>가입일자</td>
			    <td>고객등급</td>
			    <td>도시코드</td>
			</tr>
		</thead>
		<tbody>
	    <c:forEach var="member" items="${list }">
			<tr>
				<td><a href="update.do?custno=${member.num }" >${member.num }</a></td>
				<td>${member.name }</td>
				<td>${member.tel }</td>
				<td>${member.address }</td>
				<td>${member.joinDate }</td>
				<td>
				<c:choose>
					<c:when test="${member.grade eq 'A'}"> VIP </c:when>
					<c:when test="${member.grade eq 'B'}"> 일반 </c:when>
					<c:otherwise> 직원 </c:otherwise>
				</c:choose>
				</td>
				<td><fmt:formatNumber value="${member.city }" pattern="00"/> </td>
			</tr>
	    </c:forEach>
	    </tbody>
	</table>