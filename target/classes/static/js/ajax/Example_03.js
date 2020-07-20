//NOT WORK

// $(function () {
//     $('#btn').onclick = function () {
//         var xhr = new XMLHttpRequest();
//         xhr.open('GET', 'index', true);
//         // xhr.send();
//         // $('#output').innerHTML += xhr.responseText;
//         xhr.onreadystatechange = function () {
//             if (xhr.readyState == 4)
//                 if (xhr.status == 200)
//                     $('#output').innerHTML += xhr.responseText;
//         }
//     }
// })
$(function () {
    $('#click').click(function () {
        $.ajax({
            type: 'GET',
            url: 'index',
            success: function (data) {
                $('#output').append(data);
            }
        })
    })
})