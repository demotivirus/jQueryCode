$(function () {
    $.ajaxSetup({
        url: 'greeting',
        type: 'GET',
    })

    $.ajax({
        success: function (msg) {
            $('p').text(msg);
        }
    })
})