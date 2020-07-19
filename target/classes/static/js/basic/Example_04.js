var text = 'My class';

$(function () {
    $('.myClass').text(text);
    //document.getElementsByClassName('myClass')[0].style.color = 'red';
    $('.myClass').css('color', 'green');
    $('.myClass').css('background-color', 'yellow');
})