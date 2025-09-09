document.addEventListener("DOMContentLoaded", ()=>{
    const APTUrl = "https://jsonplaceholder.typicode.com/posts";
    async function fetchPosts() {
        try {
            const postsContainer = document.querySelector(".posts-container");
            //* Make HTTP request
            const response = await fetch(APTUrl);
            const posts = await response.json();
            //* Clear the loading message
            postsContainer.innerHTML = "";
            //* Display posts
            posts.forEach((post) => {
                const postElement = createPostElement(post);
                postsContainer.appendChild(postElement);
            });
        } catch (error) {
            postsContainer.innerHTML = "<p style='color: red; text-align: center;'>Error loading posts. Please try again later</p>";
        }
    }

    //! Create Post HTML Element
    function createPostElement(post){
        const article = document.createElement("article");
        article.className = "post-card";

        const title = document.createElement("h2");
        title.className = "post-title";
        title.textContent = post.title;

        const body = document.createElement("p");
        body.className = "post-body";
        body.textContent = post.body;

        article.appendChild(title);
        article.appendChild(body);

        return article;
    }
    fetchPosts();
});