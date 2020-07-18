var colours = new Map();
colours.set("red","#ff4d4d");
colours.set("green","#72fc4c");
colours.set("blue","#48f0d9")
function changeColour(){
  optionElement = document.getElementById('colors');
  if(optionElement.value !=="none"){
        document.body.style.backgroundColor = colours.get(optionElement.value);
  }
}
