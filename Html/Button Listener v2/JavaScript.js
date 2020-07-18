redButtonClicked=false;
blueButtonClicked=false;

function changeColour(){
  if(this.value==="blue"){
    document.body.style.backgroundColor = "blue";
  }
  else if(this.value==="red"){
    document.body.style.backgroundColor = "red";
  }
}
document.getElementById("redButton").addEventListener("click", changeColour);
document.getElementById("blueButton").addEventListener("click", changeColour);
