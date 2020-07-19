$(function(){
    mySumShow(15, 15);
});

function mySumShow(a, b) {
    document.getElementsByClassName('myClass')[0].innerHTML = sum(a, b);
}

function sum(a, b){
    return a + b;
};