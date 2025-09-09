//! Get the container
const containerEl = document.getElementById("container");

//! Get all buttons within the container
const buttonEl = document.querySelectorAll("button");

//! Loop through each button and change the text of the next sibling
buttonEl.forEach((button) => {
  const nextEl = button.nextSibling;
  console.log(nextEl);
  //! Check if the next sibling is an element node
  if(nextEl && nextEl.nodeType === 3){
    nextEl.textContent = "Changed text";
  }
});