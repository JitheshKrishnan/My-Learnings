//! For this example, let's consider a gallery of images where each 
//! image has an associated data attribute called `data-author` that 
//! stores the author's name. You want to filter the images by author.
const imageEls = document.getElementById("imageGallery").querySelectorAll("img");

//! Create aan array to store images bu Alice
let imgsByAlice = [];

//! Use getAttribute to filter images by author Alice
imageEls.forEach((img) => {
  const author = img.getAttribute("data-author");
  if(author === "Alice")
    imgsByAlice.push(img);
});

imgsByAlice.forEach((img) => console.log(img));

//! Hide images that are not by Alice
imageEls.forEach((img) => {
  if(!imgsByAlice.includes(img)) img.style.display = "none";
});