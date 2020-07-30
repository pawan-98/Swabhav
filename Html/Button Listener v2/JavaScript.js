var theParent = document.querySelector("#parentDiv");
theParent.addEventListener("click", doSomething, false);
function doSomething(e) {
  if (e.target !== e.currentTarget) {
    colour=e.target.value;
    if(colour==="blue"){
      document.body.style.backgroundColor = "blue";
    }
    else if(colour==="red"){
      document.body.style.backgroundColor = "red";
    }
  }
  e.stopPropagation();
}
