$(function (){
    $('p, ul').css('color', 'red');

    $('div ol').css('color', 'green');

    $('div:has(table)').css('background', 'yellow');

    $('p#newParagraph').css('color', 'green');

    $('input[type=text]').val('admin');
})