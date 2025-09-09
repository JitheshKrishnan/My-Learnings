const productCardElements = document.querySelectorAll(".product-card");
// console.log(productCardElements);

const productNameElements = document.querySelectorAll(".product-name");
productNameElements.forEach((el) => {
    // console.log(el.innerHTML);
});

const laptopPriceElement = document.querySelectorAll("[data-category='laptop'] .product-price");
laptopPriceElement.forEach((el) => {
    // console.log(el);
});

const highestRatingElements = document.querySelectorAll("[data-rating='4.7'], [data-rating='4.8']");
highestRatingElements.forEach((el) => console.log(el.innerHTML));
