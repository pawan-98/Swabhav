let questions =[];
var score=0;
let currentQuestionId=0;
var headDiv= document.getElementById('headDiv');
questions[0]={
  "id":1,
  "text":"Who is current prime minister of India?",
  "answer":"Narendra Modi",
  "options":["Rahul Gandhi","Manmohan Sing","Narendra Modi"]
}
questions[1]={
  "id":1,
  "text":"Who is current Home minister of India?",
  "answer":"Amit Shah",
  "options":["Rahul Gandhi","Amit Shah","Narendra Modi"]
}
questions[2]={
  "id":1,
  "text":"Who is current Finance minister of India?",
  "answer":"Nirmala Sitharaman",
  "options":["Nirmala Sitharaman","Manmohan Sing","Narendra Modi"]
}
function start(){
  var startButton=document.getElementById('startQuiz');
  startButton.parentNode.removeChild(startButton);
displayQuestion();
}
 function displayQuestion(){

 while (headDiv.hasChildNodes()) {
   headDiv.removeChild(headDiv.firstChild);
 }
   if(currentQuestionId<questions.length){
     var question =document.createTextNode(questions[currentQuestionId].text);
     headDiv.appendChild(question);
     for (var i = 0; i < questions[currentQuestionId].options.length; i++) {
       var divElement = document.createElement("DIV");
       var radioButton = document.createElement("INPUT");
       radioButton.setAttribute("type", "radio");
       radioButton.setAttribute("name","options");
       radioButton.setAttribute("id",questions[currentQuestionId].options[i]);
       var radioText = document.createTextNode(questions[currentQuestionId].options[i]);
       divElement.appendChild(radioButton);
       divElement.appendChild(radioText);
       headDiv.appendChild(divElement);
     }
     var nextButton = document.createElement("BUTTON");
     var text = document.createTextNode("Next");
     nextButton.appendChild(text);
     headDiv.appendChild(nextButton);
     nextButton.onclick = function(){
     	checkCorrectAnswer();

     }
   }
   else{
     var divElementTwo = document.createElement("DIV");
     if(score/3>0.5){
        var finalMessage= document.createTextNode("You have scored :-"+(score/3)*100+"%. Which means you passed" );
        divElementTwo.style.color = "green";
     }
     else {
       var finalMessage= document.createTextNode("You have scored :-"+(score/3)*100+"%. Which means you failed" );
       divElementTwo.style.color = "red";
     }
     divElementTwo.appendChild(finalMessage);
     headDiv.appendChild(divElementTwo)
      var retakeButton = document.createElement("BUTTON");
      var text = document.createTextNode("Retak Test");
      retakeButton.appendChild(text);
      headDiv.appendChild(retakeButton);
      retakeButton.onclick = function(){
        location.reload();
      }

   }
 }
function checkCorrectAnswer(){
  var temp=0;
  for (var i = 0; i < questions[currentQuestionId].options.length; i++) {
    if(document.getElementById(questions[currentQuestionId].options[i]).checked ==true){
      temp=1;
    }
    if(document.getElementById(questions[currentQuestionId].options[i]).checked ==true && questions[currentQuestionId].answer==questions[currentQuestionId].options[i]){
      score++;
    }
  }
  if(temp==0){
    alert("please select something");
    return;
  }
  currentQuestionId=currentQuestionId+1;
  displayQuestion();
}
