// ! Accessing parent element

const parentElement = document.getElementById("parent");
// console.log(parentElement);

// ! Accessing grandparent element

const grandparentElement = parentElement.parentNode;
// console.log(grandparentElement);

// ! Accessing child element
const firstChild = grandparentElement.firstChild;
const lastChild = parentElement.lastChild;
// console.log(lastChild);  

// ! Accessing element children only
const firstChildElement = parentElement.firstElementChild;
const lastChildElement = parentElement.lastElementChild;

console.log(lastChildElement);