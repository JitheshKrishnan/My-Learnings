import Greeting from "./Components/3.Props/Greeting";
import DonationButton from "./Components/3.Props/DonationButton";

const App = () => {
  const donateFn = ()=>{
      alert("Thank you for donating!");
  }
  return (
    <div>
      <Greeting name="Jithesh" message="Good Morning" age="20 years"/>
      <Greeting name="Naren" message="Good Afternoon" age="22 years"/>
      <Greeting name="Aslam" message="Good Evening" age="24 years"/>
      <DonationButton onDonate={donateFn}/>
    </div>
  );
};

export default App;