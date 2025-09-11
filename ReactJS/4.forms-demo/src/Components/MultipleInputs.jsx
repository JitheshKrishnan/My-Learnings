import React, {useState} from 'react'

//* Without using DRY Principle
// const MultipleInputs = () => {

//     //! useStates
//     const [name, setName] = useState("");
//     const [email, setEmail] = useState("");
//     const [password, setPassword] = useState("");
//     const [age, setAge] = useState("");
//     const [fruit, setFruit] = useState("");
//     const [comment, setComment] = useState("");
//     const [gender, setGender] = useState("");
//     const [isAccepted, setIsAccepted] = useState(false);

//     //! Separate Handlers
//     const handleNameChange = (e)=>{
//         setName(e.target.value)
//     }
//     const handleEmailChange = (e)=>{
//         setEmail(e.target.value)
//     }
//     const handlePasswordChange = (e)=>{
//         setPassword(e.target.value)
//     }
//     const handleAgeChange = (e)=>{
//         setAge(e.target.value)
//     }
//     const handleFruitChange = (e)=>{
//         setFruit(e.target.value)
//     }
//     const handleCommentChange = (e)=>{
//         setComment(e.target.value)
//     }
//     const handleGenderChange = (e)=>{
//         setGender(e.target.value)
//     }
//     const handleIsAcceptedChange = (e)=>{
//         setIsAccepted(e.target.checked)
//     }

//     //! Handle Submit
//     const handleSubmit = (e)=>{
//         e.preventDefault();
//         console.log({name, email, password, age, fruit, comment, gender, isAccepted});
//     }

//   return (
//     <form onSubmit={handleSubmit}>
//         <h2>React form with multiple input types</h2>
//         <div>
//             <label>Name</label>
//             <input value={name} onChange={handleNameChange} type="text" />
//         </div>
//         <br />
//         <div>
//             <label>Email</label>
//             <input value={email} onChange={handleEmailChange} type="email" />
//         </div>
//         <br />
//         <div>
//             <label>Password</label>
//             <input value={password} onChange={handlePasswordChange} type="password" />
//         </div>
//         <br />
//         <div>
//             <label>Age</label>
//             <input value={age} onChange={handleAgeChange} type="number" />
//         </div>
//         <br />
//         <div>
//             <label>Favorite Fruit: </label>
//             <select value={fruit} onChange={handleFruitChange}>
//                 <option value="">--Choose--</option>
//                 <option value="apple">Apple</option>
//                 <option value="banana">Banana</option>
//                 <option value="orange">Orange</option>
//                 <option value="kiwi">Kiwi</option>
//             </select>
//         </div>
//         <br />
//         <div>
//             <label>Comment: </label>
//             <textarea value={comment} onChange={handleCommentChange} rows="4"/>
//         </div>
//         <br />
//         <div>
//             <label>Gender: </label>
//             <input value="male" onChange={handleGenderChange} checked={gender === "male"} type="radio" /> Male
//             <input value="female" onChange={handleGenderChange} checked={gender === "female"} type="radio" /> Female
//         </div>
//         <br />
//         <div>
//             <input required checked={isAccepted} onChange={handleIsAcceptedChange} type="checkbox" />I accept the terms and conditions
//         </div>
//         <button type='submit'>Submit</button>
//     </form>
//   )
// }

//* Using DRY Principle
const MultipleInputs = () => {

    //! useStates
    const [formData, setFormData] = useState({
        name: "",
        email: "",
        password: "",
        age: "",
        fruit: "",
        comment: "",
        gender: "",
        isAccepted: false
    })

    //! Generate Change Handler
    const handleChange = (e)=>{
        //Get the name, type, value and checked from the input types
        const {name, type, value, checked} = e.target
        //Update the state
        setFormData((prevData)=>{
            return {
                ...prevData,
                [name]: type === "checkbox" ? checked : value
            }
        })
    }

    //! Handle Submit
    const handleSubmit = (e)=>{
        e.preventDefault();
        console.log(formData);
    }

  return (
    <form onSubmit={handleSubmit}>
        <h2>React form with multiple input types</h2>
        <div>
            <label>Name</label>
            <input name="name" value={formData.name} onChange={handleChange} type="text" />
        </div>
        <br />
        <div>
            <label>Email</label>
            <input name="email" value={formData.email} onChange={handleChange} type="email" />
        </div>
        <br />
        <div>
            <label>Password</label>
            <input name="password" value={formData.password} onChange={handleChange} type="password" />
        </div>
        <br />
        <div>
            <label>Age</label>
            <input name="age" value={formData.age} onChange={handleChange} type="number" />
        </div>
        <br />
        <div>
            <label>Favorite Fruit: </label>
            <select name="fruit" value={formData.fruit} onChange={handleChange}>
                <option value="">--Choose--</option>
                <option value="apple">Apple</option>
                <option value="banana">Banana</option>
                <option value="orange">Orange</option>
                <option value="kiwi">Kiwi</option>
            </select>
        </div>
        <br />
        <div>
            <label>Comment: </label>
            <textarea name="comment" value={formData.comment} onChange={handleChange} rows="4"/>
        </div>
        <br />
        <div>
            <label>Gender: </label>
            <input name="gender" value="male" onChange={handleChange} checked={formData.gender === "male"} type="radio" /> Male
            <input name="gender" value="female" onChange={handleChange} checked={formData.gender === "female"} type="radio" /> Female
        </div>
        <br />
        <div>
            <input required name="isAccepted" checked={formData.isAccepted} onChange={handleChange} type="checkbox" />I accept the terms and conditions
        </div>
        <button type='submit'>Submit</button>
    </form>
  )
}

export default MultipleInputs