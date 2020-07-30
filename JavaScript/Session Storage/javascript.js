function incrementCounter() {
  if (typeof(Storage) !== "undefined") {
    if (sessionStorage.clickCount) {
      sessionStorage.clickCount = Number(sessionStorage.clickCount)+1;
    } else {
      sessionStorage.clickCount = 1;
    }
    document.getElementById("result").innerHTML = "You have clicked the button " + sessionStorage.clickCount + " times";
  } else {
    document.getElementById("result").innerHTML = "Sorry your browser does not support web storage";
  }
}
