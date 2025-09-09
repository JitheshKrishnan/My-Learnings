// ! Select the elements

const btn1Element = document.querySelector(".btn1");
const btn2Element = document.querySelector(".btn2");
const resetBtn = document.querySelector(".btn3");
const title = document.querySelector(".title");
const bodyElement = document.querySelector("body");

console.log(btn1Element, btn2Element, resetBtn, title);

// ! Add event listeners

btn1Element.addEventListener("click", ()=>{bodyElement.style.backgroundColor="yellow";});
btn2Element.addEventListener("click", ()=>{title.style.fontSize="80px";});
resetBtn.addEventListener("click", ()=>{
    bodyElement.style.backgroundColor="";
    title.style.fontSize="";
});