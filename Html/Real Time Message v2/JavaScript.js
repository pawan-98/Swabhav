function displayText(){
  text = document.getElementById("textBox").value;
  newText = text.replace(/[^a-zA-Z]/g, '');
  document.getElementById("displayTag").textContent=newText.toUpperCase();
}
