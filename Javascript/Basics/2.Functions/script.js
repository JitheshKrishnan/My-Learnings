// ! Steps of using a function

// ? Define the function (Declaration)
// ? Write our code in the function
// ? Call/Use the function (Function invocation)

a = 10;
b = 20;

// ! Normal FUnction
// function addNumbers(a, b) {
//   let result = a + b;
//   console.log(result);
//   alert(result);
//   return result;
// }

// ! Expression Function
// const addNumbers = function (a, b) {
//   let result = a + b;
//   console.log(result);
//   alert(result);
//   return result;
// }

// ! Arrow Function

// const addNumbers = (a, b) => {
//   let result = a+b;
//   return result;
// };

// const addNumbers = (a, b) => a+b;

// console.log(addNumbers(10, 20));

// ! Anonymous Function

// (function (){console.log("hello");
// })();

// (function (a, b){console.log(a+b);
// })(5, 6);

// ((a, b) => {console.log(a-b);
// })(8,   5);

// ! Default parameters

const multiply = function(a=1, b=2){console.log(a*b);
};
multiply(5);