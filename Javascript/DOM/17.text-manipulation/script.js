//! Using text content to update the blog title
const blogTitleEl = document.getElementById("title");
// blogTitleEl.textContent = "New Blog Title";

// //! Change the background color
// blogTitleEl.style.background = "red";
// blogTitleEl.style.color = "white";

//! Using innerHTML to add another paragraph with some HTML content
const paraEl = document.getElementById("paragraph");
paraEl.innerHTML = "<h2>I have changed the paragraph</h2>";

paraEl.innerHTML += "<strong>This is a new paragraph with strong tag</strong>";

//! Using inner text to modify the comment section (assume the original comment is visible)
const firstCommentEl = document.getElementById("comment1").querySelector(".commentText");
firstCommentEl.innerText = "Updated first comment. This is important!";