const App = ()=>{
  //! Basic jsx with variables 
  const name = "React Learner";
  const greeting = "Welcome to JSX";
  //! jsx with expressions
  const num1 = 10;
  const num2 = 5;
  //! jsx with conditional rendering
  const isLoggedIn = false;
  //! jsx with lists
  const fruits = ["Apple", "Banana", "Cherry", "Date"];
  return (
    <div>
      <h1>JSX Examples</h1>
      {/* ! Basic jsx with variables*/}
      <section>
        <h2>1. Basic jsx with variables</h2>
        {greeting}, {name}
        <p>JSX lets you insert javascript expressions inside curly braces {"{}"}</p>
      </section>
      <section>
        {/* ! jsx with expressions*/}
        <h2>jsx with expressions</h2>
        {num1} + {num2} = {num1+num2}
      </section>
      <section>
        {/* ! jsx with conditional rendering*/}
        <h2>jsx with conditional rendering</h2> 
        <p>{isLoggedIn ? (<span>Welcome back!</span>) : (<span>Please login again!</span>)}</p>
      </section>
      <section>
        {/* ! jsx with lists*/}
        <h2>jsx with lists</h2> 
        {fruits.map((fruit, index)=>{
          return (<li key={index}>{fruit}</li>)
        })}
      </section>
    </div>
  )
}

export default App;