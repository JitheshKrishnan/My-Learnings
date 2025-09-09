const person = {
    name: "Jithesh",
    age: 22,
    city: "New York"
};

// ! Adding properties to person object
// * dot notation

person.isMarried = false;
person.country = "USA";

// * Bracket notation

person["hobby"] = "Coding";
person["Courses"] = ["Java Spring Boot", "MERN Stack", "MySQL"];

// console.log(person);

// ! Accessing properties
// * Dot and Bracket notation same as in adding new propertis
// console.log(person.name);

// ! Object.keys

const keys = Object.keys(person);
console.log(keys);
console.log(keys.length);

// ! Object.values

const values = Object.values(person);
console.log(values);

// ! hasOwnProperty
console.log(person.hasOwnProperty("name"));

// ! Assign()
const targetObj = {name: "Jk", age: 25};
const sourceObj = {country: "Russia"};
const result = Object.assign(targetObj, sourceObj);
console.log(result);

// ! Delete operator
delete person.country;
console.log(person);

// ! freeze (makes the object immutable)
Object.freeze(person);

// ! Nesting objects
const user = {
    name: "Jithesh",
    age: 22,
    address: {
        street: "123 street",
        city: "New York",
        country: {
            name: "USA",
            code: "US"
        }
    }
}

console.log(user);
console.log(user.address.country.code);
console.log(user["address"]["country"]["name"]);

// ! Objects inn an array
const userObj = [
    {
        name: "Jithesh",
        age: 22,
        city: "New York"
    },
    {
        name: "Naren",
        age: 19,
        city: "Russia"
    },
    {
        name: "Aslam",
        age: 13,
        city: "UAE"
    }
];

console.log(userObj);

// ! forEach()
userObj.forEach((obj) => {
    console.log(obj);
});

// ! Map() (Creates a new array)

const nums = [1,2,3,4];
const double = nums.map((num) => {
    return num*2;
});
console.log(double);

// ! reduce() returns a single value
const totalSum = nums.reduce((accumulator, currentValue) => {
    return accumulator+currentValue;
}, 0);
console.log(totalSum);

// ! find() returns the first found element that matches the criteria
const foundNum = nums.find((num) => {
    return num>3;
});
console.log(foundNum);

// ! filter() returns a list of values that matches the criteria
const filtered = nums.filter((num) => {
    return num>2;
});
console.log(filtered);