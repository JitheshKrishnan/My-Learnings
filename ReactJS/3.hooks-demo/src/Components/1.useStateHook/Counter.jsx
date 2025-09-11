import React, {useState} from 'react'

const Counter = () => {
    const [count, setCount] = useState(0);
  return (
    <div>
        <h1>You Clicked {count} times</h1>
        <button onClick={()=>setCount(count+1)}>Add 1</button>
        <button onClick={()=>setCount(count-1)}>Minus 1</button>
    </div>
  );
};

export default Counter;