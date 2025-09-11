import React, {useState} from 'react'

const ToggleTheme = () => {
    //! State Setup
    const [isDark, setIsDark] = useState(false);
    //! Handle Toggle Function
    const toggleTheme = ()=>{
        setIsDark(!isDark)
    }
    //! Define Styles
    const lightStyle = {
        backgroundColor: "#f9f9f9",
        color: "#333",
        padding: "50px",
        textAlign: "center",
        minHeight: "100vh"
    }
    const darkStyle = {
        backgroundColor: "#1a1a1a",
        color: "#f9f9f9",
        padding: "50px",
        textAlign: "center",
        minHeight: "100vh"
    }
  return (
    <div style={isDark?darkStyle:lightStyle}>
        <h1>{isDark?"Light":"Dark"} Mode</h1>
        <h3>ToggleTheme</h3>
        <button onClick={()=>toggleTheme()}>Switch to {isDark?"Light":"Dark"} Theme</button>
    </div>
  )
}

export default ToggleTheme