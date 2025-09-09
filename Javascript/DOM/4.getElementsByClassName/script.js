// ! Select all elements with class name fiction

const fictionElement = document.getElementsByClassName("fiction");
console.log(fictionElement);

// ! Select all elements with class name non-fiction within the section nonFictionSection

const nonFictionSectionElement = document.getElementById("nonFictionSection");
const nonFictionBooksInSectionElement = nonFictionSectionElement.getElementsByClassName("non-fiction");

console.log(nonFictionBooksInSectionElement[0].innerHTML);

// ! To loop through each element we have to first convert the collection into an array

const fictionElementArray = Array.from(fictionElement);
console.log(fictionElementArray);

const fictionElementTitle = fictionElementArray.map((el) => el.innerHTML);
console.log(fictionElementTitle);
