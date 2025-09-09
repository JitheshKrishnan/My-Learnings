let count = 0;

const counterElement = document.getElementById("counter");

// counterElement.innerHTML = "<h1>100</h1>";
// counterElement.textContent = "90";

document.getElementById("increaseBtn").addEventListener("click", () => {
    counterElement.innerHTML = ++count;
});

document.getElementById("decreaseBtn").addEventListener("click", () => {
    counterElement.innerHTML = --count;
});

document.getElementById("increaseByTenBtn").addEventListener("click", () => {
    counterElement.innerHTML = count+10;
});

document.getElementById("resetBtn").addEventListener("click", () => {
    counterElement.innerHTML = 0;
});