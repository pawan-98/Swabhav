function blueButton(){
  document.body.style.backgroundColor = "blue";
}
function redButton(){
  document.body.style.backgroundColor = "red" ;
}
document.getElementById("redButton").addEventListener("click", redButton);
document.getElementById("blueButton").addEventListener("click", blueButton);
