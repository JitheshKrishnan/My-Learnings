let fruits = ["apple", "banana", "orange"];

// ! add element at end
fruits.push("pineapple");
console.log(fruits);

// ! remove element from end
fruits.pop();
console.log(fruits);

// ! remove element from start
fruits.shift();
console.log(fruits);

// ! add element at start
fruits.unshift("kiwi");
console.log(fruits);

// ! merge two arrays
const colors = ["green", "red", "blue"];
const concatinatedArray = fruits.concat(colors);
console.log(concatinatedArray);

// ! slice
const selected = concatinatedArray.slice(2,4);
console.log(selected);

// ! length of aray
const len = concatinatedArray.length;
console.log(len); 