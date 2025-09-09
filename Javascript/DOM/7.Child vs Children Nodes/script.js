const parentElement = document.querySelector("#parent");
// console.log(parentElement.childNodes);
// parentElement.childNodes.forEach((node) => console.log(node.nodeType));

console.log(parentElement.children);
const convertedHTMLCollection = Array.from(parentElement.children);
convertedHTMLCollection.forEach((el) => console.log(el));