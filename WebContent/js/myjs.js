/**
 * 
 */
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