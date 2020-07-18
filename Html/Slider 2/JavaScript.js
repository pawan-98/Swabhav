var parent =  document.getElementById("displayTag");

function updateTextInput(value){
  removePreviousButtons();
  for (var i = 1; i <=value; i++) {
    var button=document.createElement("button");
    button.textContent=i;
    button.id=i;
    parent.appendChild(button);
    button.addEventListener ("click", function() {
      alert("Button no "+this.textContent+" clicked!!");
    });
  }
  function removePreviousButtons(){
    while (parent.hasChildNodes()) {
			parent.removeChild(parent.firstChild);
		}
  }
}
