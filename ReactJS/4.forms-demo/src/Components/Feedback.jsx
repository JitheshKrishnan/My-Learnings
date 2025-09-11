import React, {useState} from 'react'

const Feedback = () => {
    //! Set useStates
    const [name, setName] = useState("");
    const [message, setMessage] = useState("");
    const [submittedFeedback, setSubmittedFeedback] = useState(null);

    //! Set Handlers
    const handleNameChange = (e)=>{
        setName(e.target.value);
    }
    const handleMessageChange = (e)=>{
        setMessage(e.target.value);
    }

    //! Handle Submit
    const handleSubmit = (e)=>{
        e.preventDefault();
        if(!name || !message){
            alert("Please fill out both fields!")
            return;
        }
        // Save the feedback to the state
        setSubmittedFeedback({name, message})
        //Clear the form fields
        setName("");
        setMessage("");
    }

  return (
    <div style={{maxWidth: "500px", margin: "auto", padding: "20px"}}>
        <h1>Feedback Project</h1>
        <form onSubmit={handleSubmit}>
            <div>
                <label>Name</label>
                <input type="text" value={name} onChange={handleNameChange}/>
            </div>
            <br />
            <div>
                <label>Message</label>
                <textarea rows="4" value={message} onChange={handleMessageChange}/>
            </div>
            <button type='submit'>Submit Feedback</button>
        </form>
        {/* Show Submitted Feedback if Available*/}
        {submittedFeedback && (
            <div style={{marginTop: "30px", padding: "10px", backgroundColor: "#f0f0f0", borderRadius: "6px"}}>
                <h3>Feedback Received:</h3>
                <p>Name: {submittedFeedback.name}</p>
                <p>Message: {submittedFeedback.message}
                </p>
            </div>
        )}
    </div>
  )
}

export default Feedback