var one = 'Hello world';
var two = 'Wow';
//alert(one);
//console.log(one);
window.onload = function what(){
    document.getElementById('message').innerHTML = one;
    document.getElementsByClassName('myClass')[0].innerHTML = one;
    document.getElementsByClassName('myClass')[1].innerHTML = two;
};
