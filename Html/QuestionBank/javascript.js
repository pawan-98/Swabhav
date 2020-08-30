var QuestionBankService = (function () {
  questionBankServiceObj = {};
  questionBankServiceObj.score;
  questionBankServiceObj.currentQuestionId = 0;
  questionBankServiceObj.myData;
  questionBankServiceObj.selectedAnswersMap = new Map();
  document.getElementById('startQuiz').addEventListener("click", questionBankServiceObj.start);
  var url = "./data.json";
  $.ajax
    ({
      url: url,
      type: 'GET',
      dataType: 'json',
      success: function (data) {
        questionBankServiceObj.myData = data;
      }
    });

  questionBankServiceObj.start = function () {
    questionBankServiceObj.dataLength = Object.keys(questionBankServiceObj.myData.data).length;
    var startButton = document.getElementById('startQuiz');
    startButton.parentNode.removeChild(startButton);
    questionBankServiceObj.displayQuestion();
  }
  questionBankServiceObj.displayQuestion = function () {
    while (document.getElementById('headDiv').hasChildNodes()) {
      document.getElementById('headDiv').removeChild(document.getElementById('headDiv').firstChild);
    }
    if (questionBankServiceObj.currentQuestionId < questionBankServiceObj.dataLength) {
      var question = document.createTextNode(questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].text);
      document.getElementById('headDiv').appendChild(question);
      for (var i = 0; i < questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options.length; i++) {
        var divElement = document.createElement("DIV");
        var radioButton = document.createElement("INPUT");
        radioButton.setAttribute("type", "radio");
        radioButton.setAttribute("name", "options");
        radioButton.setAttribute("id", questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options[i]);
        var radioText = document.createTextNode(questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options[i]);
        divElement.appendChild(radioButton);
        divElement.appendChild(radioText);
        document.getElementById('headDiv').appendChild(divElement);
      }
      if (questionBankServiceObj.currentQuestionId !== 0) {
        var previousButton = document.createElement("BUTTON");
        var previousText = document.createTextNode("Previous");
        previousButton.appendChild(previousText);
        document.getElementById('headDiv').appendChild(previousButton);
        previousButton.onclick = function () {
          questionBankServiceObj.switchToPreviousQuestion();
        }
      }

      var nextButton = document.createElement("BUTTON");
      var text = document.createTextNode("Next");
      nextButton.appendChild(text);
      document.getElementById('headDiv').appendChild(nextButton);
      nextButton.onclick = function () {
        questionBankServiceObj.checkCorrectAnswer();
      }
    }
    else {
      var divElementTwo = document.createElement("DIV");
      questionBankServiceObj.score = questionBankServiceObj.selectedAnswersMap.size;
      if (questionBankServiceObj.score / 3 > 0.5) {
        var finalMessage = document.createTextNode("You have scored :-" + (questionBankServiceObj.score / 3) * 100 + "%. Which means you passed");
        divElementTwo.style.color = "green";
      }
      else {
        var finalMessage = document.createTextNode("You have scored :-" + (questionBankServiceObj.score / 3) * 100 + "%. Which means you failed");
        divElementTwo.style.color = "red";
      }

      var canavasChart = document.createElement("canvas");
      var ctx = canavasChart.getContext('2d');
      canavasChart.width = "800";
      canavasChart.height = "800";
      var total = questionBankServiceObj.dataLength;
      var startAngle = 0;
      var radius = 100;
      var cx = canavasChart.width / 2;
      var cy = canavasChart.height / 2;
      for (var index = 0; index < 2; index++) {
        if (index == 0) {
          ctx.fillStyle = "green";
          var endAngle = ((questionBankServiceObj.score / total) * Math.PI * 2) + startAngle;
        }
        else {
          ctx.fillStyle = "red";
          var endAngle = (((total-questionBankServiceObj.score) / total) * Math.PI * 2) + startAngle;
        }
        ctx.lineWidth = 1;
        ctx.strokeStyle = '#333';
        ctx.beginPath();
        ctx.moveTo(cx, cy);
        ctx.arc(cx, cy, radius, startAngle, endAngle, false);
        ctx.lineTo(cx, cy);
        ctx.fill();
        ctx.stroke();
        ctx.closePath();
        ctx.beginPath();
        ctx.font = '20px Helvetica, Calibri';
        ctx.textAlign = 'center';
        ctx.fillStyle = 'rebeccapurple';
        var theta = (startAngle + endAngle) / 2;
        var deltaY = Math.sin(theta) * 1.5 * radius;
        var deltaX = Math.cos(theta) * 1.5 * radius;
        if(index==0){
        ctx.fillText("correct answers", deltaX + cx, deltaY + cy);
        }
        else{
          ctx.fillText("wrong answers", deltaX + cx, deltaY + cy);
        }
        ctx.closePath();

        startAngle = endAngle;

      }

      divElementTwo.appendChild(finalMessage);
      document.getElementById('headDiv').appendChild(divElementTwo)
      var retakeButton = document.createElement("BUTTON");
      var text = document.createTextNode("Retak Test");
      retakeButton.appendChild(text);
      document.getElementById('headDiv').appendChild(retakeButton);
      document.getElementById('headDiv').appendChild(canavasChart)
      retakeButton.onclick = function () {
        location.reload();
      }

    }
  }
  questionBankServiceObj.checkCorrectAnswer = function () {
    var temp = 0;
    for (var i = 0; i < questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options.length; i++) {

      if (document.getElementById(questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options[i]).checked == true && questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].answer == questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options[i]) {
        temp = 1;
        questionBankServiceObj.selectedAnswersMap.set(questionBankServiceObj.currentQuestionId, 'right');
      }
      else if (document.getElementById(questionBankServiceObj.myData.data[questionBankServiceObj.currentQuestionId].options[i]).checked == true) {
        temp = 1;
      }
    }
    if (temp == 0) {
      alert("please select something");
      return;
    }
    questionBankServiceObj.currentQuestionId = questionBankServiceObj.currentQuestionId + 1;
    questionBankServiceObj.displayQuestion();
  }
  questionBankServiceObj.switchToPreviousQuestion = function () {
    questionBankServiceObj.currentQuestionId = questionBankServiceObj.currentQuestionId - 1;
    questionBankServiceObj.selectedAnswersMap.delete(questionBankServiceObj.currentQuestionId);
    questionBankServiceObj.displayQuestion();
  }
  return questionBankServiceObj;
})();
document.getElementById('startQuiz').addEventListener("click", QuestionBankService.start);