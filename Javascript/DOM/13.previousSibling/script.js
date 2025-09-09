//! Select buttons
const btn1El = document.getElementById("button1");
const btn2El = document.getElementById("button2");

//! use previousSibling to get preceding paragraph element
const text1El = btn1El.previousSibling;
const text2El = btn2El.previousSibling;

//! Change the text content of the preceding paragraph
if(text1El.nodeType === 3){
  text1El.textContent = "Text 1 has been updated";
}

if(text2El.nodeType === 3){
  text2El.textContent = "Text 2 has been updated";
}