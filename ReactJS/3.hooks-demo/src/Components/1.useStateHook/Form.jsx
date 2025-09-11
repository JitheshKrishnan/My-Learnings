import React, {useState} from 'react'

const Form = () => {
    const [name, setName] = useState("");
    function handleSubmit(e){
        e.preventDefault();
        console.log(name);
    }
  return (
    <div>
        <h1>Form</h1>
        <h3>You typed: {name}</h3>
        <form onSubmit={handleSubmit}>
            <label>Name</label>
            <input onChange={(e)=>setName(e.target.value)} value={name} type="text"/>
            <button>Submit</button>
        </form>
    </div>
  )
}

export default Form