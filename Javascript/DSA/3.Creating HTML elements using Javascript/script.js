// ! 1. Select the target element
const appContainer = document.getElementById("app");
const generateBtn = document.getElementById("generateBtn");

// ! 2. Create new HTML elements (document.createElement)
// * create profile card container
function createProfileCard() {
    // ! 3. Add content to the element created (innerHTML/textContent)
    // ! 4. Add classes ot ids if needed / add any attribute
    // * create profile card container
    const profileCard = document.createElement("div");
    // add class
    profileCard.className="profile-card";
    // * create an image element for the profile card
    const profileCardImage = document.createElement("img");
    // * add image to created image element
    profileCardImage.src="image.png";
    // * create heading element
    const profileHeading = document.createElement("h3");
    profileHeading.textContent = "Jithesh";
    // * create a paragraph element for the description
    const profileDescription = document.createElement("p");
    profileDescription.textContent = "A passionate developer with experience in java springboot and reactjs";
    // ! 5. Append the elements to build the structure
    // * Append all elements to profileCard
    profileCard.appendChild(profileCardImage);
    profileCard.appendChild(profileHeading);
    profileCard.appendChild(profileDescription);
    // ! 6. Append to DOM
    // * Append the profileCard to the appContainer
    appContainer.appendChild(profileCard);
}

// * Add eventListener
generateBtn.addEventListener("click", createProfileCard);