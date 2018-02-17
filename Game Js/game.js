
var arr = [];
var myNumber;
var arrLength;



function Game(){
	var found = false;
    constructArray();
    cheater();
    
    var stepsCounter = 0;
    while (arr.length>2){
        

        computerGuess = arr[(Math.round(arr.length/2)) - 1];

    
        if (computerGuess == myNumber){
            alert("I always knew it!! Your number is: " + computerGuess);
            document.getElementById("h1").innerHTML="I have guessed your number in " + stepsCounter + "step(s). Thanks for playing!";
            return false;
            break;
        } 
        stepsCounter++;
        
        var answer = prompt("Is it higher or lower than " + computerGuess + "? (higher/lower)");
        if (answer === "higher"){
            arr.splice(0, arr.indexOf(computerGuess) + 1);
            alert("Your array is: " + arr);
        }else if (answer === "lower"){
    	   arr.splice(arr.indexOf(computerGuess), computerGuess + 1);
           alert("Your array is: " + arr);
        }else {
    	   alert("Wrong answer!");
            return false;
            break;
        }
        
        cheater();
        
        }

        if (arr.length == 2){
            if (arr[0] == myNumber) {
                stepsCounter++;
                alert("I always knew it!! Your number is: " + myNumber);
                document.getElementById("h1").innerHTML="I have guessed your number in " + stepsCounter + "step(s). Thanks for playing!";
                return false;
            }else{
                var lastAnswer = prompt("Is it higher or lower than " + arr[0] + "? (higher/lower)");
                stepsCounter++
            }
        }
        if (lastAnswer === "higher"){
            found = true;
            alert("I always knew it!! Your number is: " + arr[1]);
            document.getElementById("h1").innerHTML="I have guessed your number in " + stepsCounter + "step(s). Thanks for playing!";
            return false;
        } else if (lastAnswer === "lower"){
            alert("Your chosen number is not in the array, you cheater!");
            return false;
        } else {
            alert("Wrong answer!");
            return false;
        }
    
    if (found){
    document.getElementById("h1").innerHTML="I have guessed your number in " + stepsCounter + "step(s). Thanks for playing!";
    }

}

function cheater(){
     var cheater = true;
    for (i = 0; i<arr.length; i++){
        if (myNumber == arr[i]){
            cheater = false
        }
    }
    if (cheater == true){
        alert("Your chosen number is not in the array, you cheater!");
        return false;
        
    }
}

function constructArray(){
    
    var x = 1;
    arr = [];
    while (x == 1){
        arrLength = prompt("Give me the length of the array you would like to choose from!");
        if (isNaN(arrLength) == true || arrLength < 1){
            alert("That's not a positive number! Retry!");
            x = 1;
        }else{
            x = 2;
        }
    }

    if (arrLength)
    for (i = 0; i<arrLength; i++){
        arr.push(i+1);
    }
    document.getElementById("array").innerHTML="Your array was: " + arr;
    x = 1;
    while (x == 1){
        myNumber = prompt("So...this is your array. Choose a number from the given array and I will try to guess it! "+ arr);
            if (isNaN(myNumber) == true){
                alert("That's not a number!");
                x = 1;
            }else{
                x = 2;
            }
    }



}
