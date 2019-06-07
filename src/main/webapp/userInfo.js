function getPersonInfo(){
    var name = document.getElementById('username').value;

    var ajaxRequest = new XMLHttpRequest();
    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4){
            if(ajaxRequest.status == 200){
                var person = JSON.parse(ajaxRequest.responseText);
                document.getElementById('firstName').value = person.firstname;
                document.getElementById('ini').value = person.initials;
                document.getElementById('cpr').value = person.CPR;
                document.getElementById('password').value = person.password;
            }
        }
    }
    ajaxRequest.open('GET', 'http://localhost:8080/people/' + name);
    ajaxRequest.send();
}

function setPersonInfo(){
    var username = document.getElementById('username').value;
    var firstname = document.getElementById('firstname').value;
    var ini = document.getElementById('ini').value;
    var cpr = document.getElementById('cpr').value;
    var password = document.getElementById('password').value;

    var postData = 'username=' + username;
    postData += '&firstname='+firstname;
    postData += '&ini=' + encodeURIComponent(ini);
    postData += '&CPR=' + cpr;
    postData += '&password' + password;

    var ajaxRequest = new XMLHttpRequest();
    ajaxRequest.open('POST', 'http://localhost:8080/people/' + name);
    ajaxRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    ajaxRequest.send(postData);
}
