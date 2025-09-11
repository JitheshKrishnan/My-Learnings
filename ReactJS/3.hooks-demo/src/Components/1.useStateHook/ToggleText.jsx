import React, {useState} from 'react'

const ToggleText = () => {
    const [show, toggleShow] = useState(true);
  return (
    <div>
        <h1>Toggling Text</h1>
        <button onClick={()=>toggleShow(!show)}>Toggle</button>
        {show && <p>This is visible text</p>}
    </div>
  )
}

export default ToggleText