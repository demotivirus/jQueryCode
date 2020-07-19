$(document).ready(function() {
    $('#button_server_time').click(function () {
        $.ajax({
            url : 'get_time',
            success : function (data) {
                $('#p_server_time').html(data);
            }
        });
    });
});