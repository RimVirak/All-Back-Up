function setSuccess(inputId){
    $(inputId).addClass('border-success').removeClass('border-danger');
}
function setError(inputId){
 $(inputId).addClass('border-danger').removeClass('border-sucess');   
}

$(function () {
    $('button').click(function () {
        var username = $('#username').val();
        var password = $('#password').val();

        if (username == "") {
            $.notify('username empty',"error");
            setError('#username');
        } else {
            $.notify('username',"success");
            setSuccess('#username')
        }
        if (password == "") {
            $.notify('password empty',"error");
            setError("#password");

        } else {
            $.notify('password',"success");
            setSuccess("#password");
        }
    });

});