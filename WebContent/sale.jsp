<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h2>회원 매출 조회</h2>
	<table border="1">
		 <colgroup>
	        <col width="25%">
	        <col width="25%">
	        <col width="25%">
	        <col width="25%">
	    </colgroup>
	    <thead>
	    <tr>
	        <td>회원번호</td>
	        <td>회원성명</td>
	        <td>고객등급</td>
	        <td>매출</td>
	    </tr>
	    </thead>
	    <tbody>
	       <c:forEach var="sale" items="${list }">
	       <tr>
	       <td>${sale.custno }</td>
	       <td>${sale.name }</td>
	       <td>
	          <c:choose>
	               <c:when test="${sale.grade eq 'A'}"> VIP </c:when>
	               <c:when test="${sale.grade eq 'B'}"> 일반 </c:when>
	               <c:otherwise> 직원 </c:otherwise>
	          </c:choose>
	          </td>
	       <td>${sale.total }</td>
	       </tr>
	       </c:forEach>
	    </tbody>
	</table>