/**
 * Metoder til at vise og gemme elementer på siden.
 */

$("#loginButton").click(function(){
    $("#loginPage").hide();
    $("#adminPage").show();
});

$("#logOut").click(function(){
    $("#adminPage").hide();
    $("#loginPage").show();
});

$("#createUser").click(function(){
    $("#adminPage").hide();
    $("#editPage").show();
});

/**
 * Metode til at hente data fra serveren.
 */

$("#loginButton").click(function () {
   $("#userTable").load("URL");
});

/**
 * Metode til at sende data til serveren når der skal oprettes bruger.
 */

$("#createUserButton").click(function () {
    $.post("URL");
});

/**
 *  Show/hide metoder til menuerne
 */

$(".logoutPageShow").click(function () {
    $("#adminPage").hide();
    $("#editPage").hide();
    $("#loginPage").show();
});

$(".adminPageShow").click(function () {
    $("#loginPage").hide();
    $("#editPage").hide();
    $("#adminPage").show();
});

$(".editPageShow").click(function () {
    $("#loginPage").hide();
    $("#adminPage").hide();
    $("#editPage").show();
});

/**
 *  Metode til at loade brugere og vise dem på brugeradministration-siden
 */
$(".adminPageShow").click(function(){
    $.get("users", function(data, status){
        alert("Data: " + data + "\nStatus: " + status);
    });
});