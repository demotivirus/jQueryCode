var text = "Hello ajax";
$(function () {
    $('#test').text(text)
    $('#test').fadeOut('slow');
});

$(function () {
    $('.myClass').text(text);
})