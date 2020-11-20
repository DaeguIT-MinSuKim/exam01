<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<h2>홈쇼핑 회원 정보 수정</h2>
	<form action="<c:url value="/update.do" />" method="post" id="join">
		<table border="1">
		    <tr>
		        <td>회원번호(자동발생)</td>
		        <td><input type="text" name="num" value="${member.num }" readonly="readonly"></td>
		    </tr>
		    <tr>
		        <td>회원성명</td>
		        <td><input type="text" name="name" id="name" value="${member.name}"></td>
		    </tr>
		    <tr>
		        <td>회원전화</td>
		        <td><input type="text" name="tel" id="tel" value="${member.tel }"></td>
		    </tr>
		    <tr>
		        <td>회원주소</td>
		        <td><input type="text" name="address" id="address" value="${member.address }"></td>
		    </tr>
		    <tr>
		        <td>가입일자</td>
		        <td><input type="text" name="joinDate" id="joinDate" value="${member.joinDate }" readonly="readonly"></td>
		    </tr>
		    <tr>
		        <td>고객등급</td>
		        <td><input type="text" name="grade" id="grade" value="${member.grade }"></td>
		    </tr>
		    <tr>
		        <td>도시코드</td>
		        <td><input type="text" name="city" id="city" value="${member.city }"></td>
		    </tr>
		</table>
		<div class="btn_group">
		    <button type="submit" onclick="update();return false">수정</button>
		    <button type="button" onclick="history.back();">목록</button>
		</div>
	</form>