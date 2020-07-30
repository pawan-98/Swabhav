var items=[];
let itemsObjectArray=[];
var close = document.getElementsByClassName("close");
var checkBox = document.getElementsByClassName("checkBox");
var completedTaskElement = document.getElementById("completedTask");
var notCompletedTaskElement = document.getElementById("notCompletedTask");

  itemsObjectArray=JSON.parse(localStorage.itemsArray);
  refresh();
//view
function display()	{
    addItem(document.getElementById("myInput").value);
    refresh();
}
function refresh(){
  var listCompleted = document.getElementById("CompletedTaskUl");
  while (listCompleted.hasChildNodes()) {
    listCompleted.removeChild(listCompleted.firstChild);
  }
  var listNotCompleted = document.getElementById("notCompletedTaskUl");
  while (listNotCompleted.hasChildNodes()) {
    listNotCompleted.removeChild(listNotCompleted.firstChild);
  }

for (var i = 0; i < itemsObjectArray.length; i++) {
  var li = document.createElement("li");
  var checkbox = document.createElement('input');
  checkbox.type = "checkbox";
  checkbox.className="checkBox"
  checkbox.checked=itemsObjectArray[i].checkedStatus;
  li.appendChild(checkbox);
  var inputValue = itemsObjectArray[i].itemName;
  var t = document.createTextNode(inputValue);
  var itemSpan = document.createElement("SPAN");
  itemSpan.id=itemsObjectArray[i].id;
  itemSpan.appendChild(t);
  li.appendChild(itemSpan);
  var span = document.createElement("SPAN");
  var txt = document.createTextNode("X");
  span.className = "close";
  span.appendChild(txt);
  li.appendChild(span);
  if(itemsObjectArray[i].checkedStatus==true){
    itemSpan.className="checked";
    listCompleted.appendChild(li);
  }
  else{
    listNotCompleted.appendChild(li);
  }
}
notCompletedTaskElement.textContent=getTotalNotCompletedTask();
completedTaskElement.textContent=getTotalCompletedTask();
setCheckBoxAndRemoveButtonFuntionality();

}

//model
function addItem(item){
  if(item!==undefined && item !== null && item!==""){
    items.push(item)
    document.getElementById("myInput").value="";
    let itemObject={
      "id":itemsObjectArray.length,
      "itemName":item,
      "checkedStatus":false
    }
    itemsObjectArray.push(itemObject);
    updateLocalStorage();
  }
  else{
    alert("Please enter something first!!");
  }
}


function setCheckBoxAndRemoveButtonFuntionality(){
  for (i = 0; i < close.length; i++) {
    close[i].onclick = function() {
    var div = this.parentElement;
    if(confirm("Are you sure yo want to delete this item?")){
      deleteItem(div.children[1].id);
      div.style.display = "none";
      completedTaskElement.textContent=getTotalCompletedTask();
    }
    }
  }
  for (i = 0; i < checkBox.length; i++) {
    checkBox[i].onclick = function() {
    currentCheckBoxParent=this.parentElement;
    if(currentCheckBoxParent.children[0].checked){
      itemsObjectArray[currentCheckBoxParent.children[1].id].checkedStatus=true;
      //completedTaskElement.textContent=parseInt(completedTaskElement.textContent)+1;
      updateLocalStorage();
      refresh();
    }else{
      itemsObjectArray[currentCheckBoxParent.children[1].id].checkedStatus=false;
      //completedTaskElement.textContent=parseInt(completedTaskElement.textContent)-1;
      updateLocalStorage();
      refresh();
    }
    }
  }

}

function deleteItem(id){
  itemsObjectArray.splice(id,1);
  for (var i = 0; i < itemsObjectArray.length; i++) {
    itemsObjectArray[i].id=i;
  }
  updateLocalStorage();
  refresh();
}
function getTotalCompletedTask(){
  var count =0;
  for (var i = 0; i < itemsObjectArray.length; i++) {
    if(itemsObjectArray[i].checkedStatus == true){
      count=count+1;
    }
  }
  return count;
}
function getTotalNotCompletedTask(){
  var count =0;
  for (var i = 0; i < itemsObjectArray.length; i++) {
    if(itemsObjectArray[i].checkedStatus == false){
      count=count+1;
    }
  }
  return count;
}

function updateLocalStorage(){
  localStorage.itemsArray=JSON.stringify(itemsObjectArray);
}
