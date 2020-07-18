function changeColour(){
  optionElement = document.getElementById('colors');
  if(optionElement.value ==="red"){
    document.body.style.backgroundColor = "#ff4d4d";
  }
  else if (optionElement.value ==="green") {
    document.body.style.backgroundColor = "#72fc4c";
  }
  else if (optionElement.value ==="blue") {
    document.body.style.backgroundColor = "#48f0d9";
  }
}
