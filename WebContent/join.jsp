<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <h2>홈쇼핑 회원 등록</h2>
    <form id="join" action="<c:url value="/join.do"/>" method="post">
	    <table border="1">
	        <tr>
	            <td>회원번호(자동발생)</td>
	            <td><input type="text" name="num" value="${nextNum }" readonly="readonly"></td>
	        </tr>
	        <tr>
	            <td>회원성명</td>
	            <td><input type="text" name="name" id="name"></td>
	        </tr>
	        <tr>
	            <td>회원전화</td>
	            <td><input type="text" name="tel" id="tel"></td>
	        </tr>
	        <tr>
	            <td>회원주소</td>
	            <td><input type="text" name="address" id="address"></td>
	        </tr>
	        <tr>
	            <td>가입일자</td>
	            <td><input type="text" id="joinDate" name="joinDate" value="<fmt:formatDate value="<%=new Date()%>" pattern="yyyy-MM-dd"/>" readonly="readonly"></td>
	        </tr>
	        <tr>
	            <td>고객등급(A:VIP, B:일반, C:직원)</td>
	            <td><input type="text" name="grade" id="grade"></td>
	        </tr>
	        <tr>
	            <td>도시코드</td>
	            <td><input type="text" name="city" id="city"></td>
	        </tr>
	    </table>
	    <div class="btn_group">
	        <button type="submit" onclick="reg();return false">등록</button>
	        <button type="button" onclick="location='list.do'">조회</button>
	    </div>
    </form>
