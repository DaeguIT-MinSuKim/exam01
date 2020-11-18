<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
	<title>쇼핑몰 회원관리</title>
	<link href="css/common.css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="js/myjs.js"></script>
	<script type="text/javascript">
		$(function(){
		    $('#update').on("click", function(e){
		        e.preventDefault();
		        go_save();
		        alert("회원 수정 완료");
		    });
		    
		    $('#register').on("click", function(e){
		        e.preventDefault();
		        go_save();
		        alert("회원 등록 완료");
		    });
		});
	</script>
</head>
<body>
    <h1>쇼핑몰 회원관리 ver1.0</h1>