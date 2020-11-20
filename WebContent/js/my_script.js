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

function reg(){
    if (checkValid()){
           document.getElementById("join").submit();
           alert("회원정보가 등록되었습니다.");
    }
}

function update(){
    if (checkValid()){
           document.getElementById("join").submit();
           alert("회원정보수정이 완료되었습니다.");
    }
}

