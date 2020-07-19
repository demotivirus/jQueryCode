window.addEventListener('load', function () {
    div = document.getElementById('textDiv');
    document.getElementById('first').onclick = first();
    document.getElementById('second').onclick = second();
});

function first() {
    div.className = 'class1';
};

function second() {
    div.className = 'class2';
};