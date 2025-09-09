// ! =====Methods=====
// * toFixed

let amount = 12.996;

let result = amount.toFixed(2);
console.log(result);

// * isNaN
let qty = "50";
console.log(isNaN(qty));

// * ParseFloat / ParseInt

let convertedNum = parseFloat(qty);
// console.log(typeof convertedNum);
// console.log(convertedNum);

// ! =====Arithmetic Operators=====

// * Addition
let apples = 10;
let oranges = 5;
let totalFruits = apples + oranges;
console.log(totalFruits);

// * Subtraction
let initialBalance = 1000;
let withdrawal = 200;
let remainingBalance = initialBalance - withdrawal;

// * Multiplication
let CostPerItem = 20;
let qty1 = 4;
let totalCost = CostPerItem * qty1;

// * Division
let distance = 120;
let time = 2;
let speed = distance / time;
console.log("Average speed is", speed);

// * Modulus
let totalStudents = 53;
let groupSize = 5;
let remainingStudents = totalStudents % groupSize;

// * Exponential
let a = 5;
let b = 3;
let c = a ** b;

// * Increment
let currentAge = 25;
currentAge++;

// * Decrement
let currentOld = 23;
currentOld--;

// ! --Case Study: Budget Management for a Monthly Expense Tracker--
//A user wants to track their monthly expenses and savings using a simple JavaScript program. The user has an income and several expenses like rent, groceries, utilities, and entertainment. The program needs to calculate how much is spent, how much is saved, and what percentage of the income has been spent.
/*
Scenario:
 * Monthly income: $3000
 * Monthly expenses:
 * Rent: $1200
 * Groceries: $600
 * Utilities: $300
 * Entertainment: $200

! Operations to be performed:

1. Calculate the total expenses.
2. Calculate the remaining savings after expenses.
3. Calculate the percentage of income spent.
*/
let income = 3000;

let rent = 1200;
let Groceries = 600;
let Utilities = 300;
let Entertainment = 200;

let totalExpenses = Groceries + Utilities + Entertainment + rent;

let savings = income - totalExpenses;

let percentageSpent = ((totalExpenses / income) * 100).toFixed(2);
