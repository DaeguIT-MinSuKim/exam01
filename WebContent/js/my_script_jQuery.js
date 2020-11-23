function go_save() {
    if ($('#name').val().length == 0) {
        alert("이름을 입력해 주세요.");
        $('#name').focus();
        return false;
    } else if ($('#tel').val().length == 0) {
        alert("연락처를 입력해 주세요.");
        $('#tel').focus();
        return false;
    } else if ($('#address').val().length == 0) {
        alert("주소를 입력해 주세요.");
        $('#address').val().focus();
        return false;
    } else if ($('#grade').val().length == 0) {
        alert("고객등급을 입력해 주세요.");
        $('#grade').val().focus();
        return false;
    } else if ($('#city').val().length == 0) {
        alert("도시코드를 입력해 주세요.");
        $('#city').val().focus();
        return false;
    } else {
        $('#join').submit();
        return true;
    }
}

$(function(){
        
    $('#update').on("click", function(e){
        e.preventDefault();
        var res = go_save();
        if (res) {
            alert("회원 수정 완료");
        }
    });
    
    $('#register').on("click", function(e){
        e.preventDefault();
        var res = go_save();
        if (res) {
            alert("회원 등록 완료");
        }
    });
});

/*
    var contextPath = "<%= request.getContextPath()%>";
    
    var newMember = {
        num  :  document.getElementById("num").value,
        name : document.getElementById("name").value,
        tel  : document.getElementById("tel").value,
        address :  document.getElementById("address").value,
        joinDate:  document.getElementById("joinDate").value,
        grade: document.getElementById("grade").value,
        city:  document.getElementById("city").value,
    };
    
    $.ajax({
        type  : "post",
        url   : contextPath+"/join.do",
        cache : false,
        data  : newMember,
        complete : function(data) {
            alert("추가되었습니다." + data);
            window.location.href = contextPath + "/list.do";
        }
    });
    
*/