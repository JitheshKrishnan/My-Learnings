// const Greeting = (props)=>{
//     return <h2>Hello, {props.name} {props.message}, you are {props.age} old</h2>;
// };

//! DRY -Don't Repeat Yourself Principle: Destructuring technique
const Greeting = ({name, message, age})=>{
    return <h2>Hello, {name} {message}, you are {age} old</h2>;
};

export default Greeting;