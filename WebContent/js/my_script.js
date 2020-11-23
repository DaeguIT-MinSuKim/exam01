function checkValid(){
    if (document.getElementById("name").value == 0){
        alert("회원성명이 입력되지 않았습니다.");
        return false;
    }else if (document.getElementById("tel").value == 0){
        alert("회언 전화가 입력되지 않았습니다.");
        return false;
    }else if (document.getElementById("address").value == 0){
        alert("회원 주소가 입력되지 않았습니다.");
        return false;
    }else if (document.getElementById("joinDate").value == 0){
        alert("가입일자가 입력되지 않았습니다.");
        return false;
    }else if (document.getElementById("grade").value == 0){
        alert("고객 등급이 입력되지 않았습니다.");
        return false;
    }else if (document.getElementById("city").value == 0){
        alert("도시코드가 입력되지 않았습니다.");
        return false;
    }else{
       return true;
    }
}

function add(msg){
    var contextPath = "/exam01";
    
    var newMember = {
        num  :  document.getElementById("num").value,
        name : document.getElementById("name").value,
        tel  : document.getElementById("tel").value,
        address :  document.getElementById("address").value,
        joinDate:  document.getElementById("joinDate").value,
        grade: document.getElementById("grade").value,
        city:  document.getElementById("city").value,
    };

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(res) {
          if (this.readyState == 1 ) {
                alert("회원정보가 " + msg + "되었습니다.");
                window.location.href = contextPath + "/list.do";
          } 
    };
    
    xhttp.open("POST", contextPath+"/join.do", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(newMember);
}

function reg(){
    if (checkValid()){
        add("등록");
        document.getElementById("join").submit();
    }
}

function update(){
    if (checkValid()){
        add("수정");
        document.getElementById("join").submit();
    }
}

