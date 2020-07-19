$(function () {
    $('.search_button').on('click', search());

    function search() {
        var textSearch = $('.search_item').val();
        $('p:contains("+ textSearch +")').css('background-color', 'yellow');
    }
})