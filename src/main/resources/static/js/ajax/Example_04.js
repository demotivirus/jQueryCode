$(function () {
    //var data = $('form').serialize();
    //alert(data);
    var data = $('form').serializeArray();
    alert(data[0].value + " " + data[1].value);
})