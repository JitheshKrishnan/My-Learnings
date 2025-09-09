//! get the outerDiv using Id
const outerDivEl = document.getElementById("outerDiv");
console.log(outerDivEl);

//! Navigate to the first child - text node
const firstChildEl = outerDivEl.childNodes[0];
console.log(firstChildEl);

//! Navigate to second child - innerDiv
const innerDivEl = outerDivEl.childNodes[1];
console.log(innerDivEl);

//! Navigate to the nested list
const nestedListEl = innerDivEl.childNodes[1];
console.log(nestedListEl);