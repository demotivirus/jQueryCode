$(function () {
    $('p:even').css('background-color', 'red');
    $('p:odd').css('background-color', 'green');

    $('li:first').css('color', 'red');
    $('li:last').css('color', 'green');

    //DOM THREE
    $('.table1 tr:nth-child(3)').css('background-color', 'lightblue');
    $('.table1 tr:nth-child(even)').css('color', 'red');
})