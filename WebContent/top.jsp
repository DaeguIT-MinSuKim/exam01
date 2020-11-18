<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<title>쇼핑몰 회원관리</title>
<!-- <link href="css/common.css" rel="stylesheet"> -->
<style type="text/css">
h1 {
    text-align: center;
}
h2{
    text-align: center;
}
table {
    width:80%;
    margin:0 auto;
    text-align: center;
}

a {
    text-decoration: none;
}

footer div#copy {
    text-align: center;
    margin-top: 20px;
}

div {
    width:80%;
    margin:0 auto;
}

table#menu {
    width:50%;
    margin: 0 auto;
}

table#menu a{
    text-decoration:none;
    text-align: center;
}

</style>

<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>

<script type="text/javascript">
function go_save() {
    if ($('#name').val().length == 0) {
        alert("이름을 입력해 주세요.");
        $('#name').focus();
    } else if ($('#tel').val().length == 0) {
        alert("연락처를 입력해 주세요.");
        $('#tel').focus();
    } else if ($('#address').val().length == 0) {
        alert("주소를 입력해 주세요.");
        $('#address').val().focus();
    } else if ($('#grade').val().length == 0) {
        alert("고객등급을 입력해 주세요.");
        $('#grade').val().focus();
    } else if ($('#city').val().length == 0) {
        alert("도시코드를 입력해 주세요.");
        $('#city').val().focus();
    } else {
        $('#join').submit();
    }
}
  
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
