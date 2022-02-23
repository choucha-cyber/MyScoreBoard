'use strict'

function verifChamp(event){
	event.preventDefault();
	
	
	//verif nickname
	let myRegex = /^[a-zA-Z-\s]+$/;

	if(document.querySelector('#nickname').value == ""){
    	document.querySelector('#nickname').style.border= '4px solid red ';
    	document.querySelector('#nickname').focus();
    	alert('entrer un nom ');
    	return false;
   	 }else if (myRegex.test(document.querySelector('#nickname').value) == false){
   	 alert('saisir uniquement des lettres et des espaces dans le nom ');
    	document.querySelector('#nickname').style.border= '4px solid red ';
    	document.querySelector('#nickname').focus();
    	return false;
    }else{
    document.querySelector('#nickname').style.border= '4px solid green ';
    }
    
    //verif email /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
    let myRegexEmail = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;

	if(document.querySelector('#email').value == ""){
    	document.querySelector('#email').style.border= '4px solid red ';
    	document.querySelector('#email').focus();
    	alert('entrer un email valide ');
    	return false;
   	 }else if (myRegexEmail.test(document.querySelector('#email').value) == false){
   	 alert('saisir email valide ');
    	document.querySelector('#email').style.border= '4px solid red ';
    	document.querySelector('#email').focus();
    	return false;
    }else{
    document.querySelector('#email').style.border= '4px solid green ';
    }
}

console.log("test");


$(document).ready(function () {

    $('form').submit(function () {
        console.log('form submited !');

        getData();
    })
})