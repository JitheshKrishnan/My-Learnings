const nums = [1,2,3];
const [first, second, third] = nums;

//! Swap variables
let a = 1;
let b = 2;
[a,b] = [b,a];

//! Object destructuring
const {name, age, email} = {name: "Jithesh", age: 22, email: "user@example.com"};

//! Destructuring in function parameters
const myUser = {name: "Jithesh", age: 22};
function greet({name, age}){
    console.log(`Hello ${name}, your age is ${age}`);
}
greet(myUser);

//! Nested destructuring
const {id, info: {Name, Age}} = {
    id: 1,
    info: {
        Name: "Jithesh",
        Age: 22
    }
};
console.log(Name);