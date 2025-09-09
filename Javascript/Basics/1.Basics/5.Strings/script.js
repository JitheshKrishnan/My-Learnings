// ! Ways of creating strings

// Single quotes
let a = "Hello, this is a string with single quotes";

// Double quotes
let b = "Hello, this is a string with double quotes";

// * Template - Can be multiline string
let c = `Hello, this is string with template literals`;

// Length
let bLength = b.length;
console.log(bLength);

// Accessing Characters
let first = a[0];
console.log(first);

// Uppercase and Lowercase
console.log(a.toLowerCase());
console.log(a.toUpperCase());

// index of
console.log(b.indexOf("o"));

// Slice
console.log(a.slice(7, 11));

// Replace
console.log(a.replace("Hello", "Welcome"));

// Concat
let x = "J";
let y = "K";
console.log(x.concat(" ", y));

let fullName = x + " " + y;
console.log(fullName);

// Template Literals
let name = "John";
let age = 20;
let greeting = `Hello ${name}, your age is ${age} years, good morning`;
console.log(greeting);
