function incrementCounter() {
  if (typeof(Storage) !== "undefined") {
    if (localStorage.clickCount) {
      localStorage.clickCount = Number(localStorage.clickCount)+1;
    } else {
      localStorage.clickCount = 1;
    }
    document.getElementById("result").innerHTML = "You have clicked the button " + localStorage.clickCount + " times";
  } else {
    document.getElementById("result").innerHTML = "Sorry your browser does not support web storage";
  }
}
