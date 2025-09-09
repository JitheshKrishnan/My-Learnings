// ! Using getAttribute() and setAttribute()

const userCard = document.getElementById("userCard");
const userId = userCard.getAttribute("data-user-id");

// console.log(userId);

// ! modifying data attributes

userCard.setAttribute("data-user-role", "user");
userCard.setAttribute("data-user-position", "Engineer");
// console.log(userCard);

// ! Using the dataset
const userRole2 = userCard.dataset.userRole;
const userId2 = userCard.dataset.userId;
console.log(userRole2);
console.log(userId2)