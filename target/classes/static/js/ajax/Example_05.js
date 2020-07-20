$(function () {
    var student = {
        name: 'Jhon',
        surname: 'Doe',
        age: 34,
        language: 'Java'
    };

    var data = JSON.stringify(student); //PARSE TO JSON
    alert(data);

    var obj = JSON.parse(data);
    alert(obj.name + "\n" + obj.surname + "\n" + obj.age + "\n" + obj.language);
})