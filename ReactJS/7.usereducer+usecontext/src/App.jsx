import { useReducer, createContext, useContext } from 'react'
import "./App.css"

//! useReducer: 
const initialState = {
  count: 0,
}

const reducer = (state, action) => {
  if(action.type == "INCREMENT"){
    return {
      ...state,
      count: state.count+1
    }
  }
  else if(action.type == "DECREMENT"){
    return {
      ...state,
      count: state.count-1
    }
  }
  else return state;
}

//! useContext:
const CounterContext = createContext();
const CounterProvider = ({children}) => {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <CounterContext.Provider value={{state, dispatch}}>
      {children}
    </CounterContext.Provider>
  )
}

const Counter = ()=>{
  const {state, dispatch} = useContext(CounterContext)
  return (
    <div className='counter-container'>
      <h1>Counter: {state.count}</h1>
      <button className='button' onClick={()=>dispatch({type: "INCREMENT"})}>+</button>
      <button className='button' onClick={()=>dispatch({type: "DECREMENT"})}>-</button>
    </div>
  )
}

const App = () => {
  return (
    <div className='app-container'>
      <h1 className='title'>React Counter</h1>
      <p className='sub-description'>A simple counter application using useReducer and Context API</p>
      <CounterProvider>
        <Counter></Counter>
        <Counter></Counter>
      </CounterProvider>
    </div>
  )
}

export default App
