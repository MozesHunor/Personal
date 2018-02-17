function encrypt () {
	var x=document.getElementById("texta1").value;
	var s="";
	for (var i=0; i<x.length; i++) {
		var m=x.charCodeAt(i)+10
		s=s+String.fromCharCode(m)
		}
	document.getElementById("texta2").innerHTML=s;
	}
function decrypt () {
	var y=document.getElementById("texta3").value;
	var p="";
	for (var j=0; j<y.length; j++) {
		var n=y.charCodeAt(j)-10
		p=p+String.fromCharCode(n)
		}
	document.getElementById("texta4").innerHTML=p;
}
function alertme() {
	alert("Hey you! Please complete the following survey!")
}
function clickme() {
	var x=document.getElementById("name").value;
	if (x.length<1) {
		alert("Tell me your name!")
	}
	else {
	    alert("Hello "+ x +"!!!");
	}
}
function submit() {
	var b=true;
	if (document.getElementById("thanks").value.length<1) {
		alert("Please leave a review!");
		b=false;
	}
	if (document.getElementById("name").value.length<1) {
		alert ("Tell me your name!");
		b=false;
	}
	if (b==true) {
	var x=document.getElementById("thanks").value;
	document.getElementById("review").innerHTML=document.getElementById("name").value+" says: " +x;
	}

}