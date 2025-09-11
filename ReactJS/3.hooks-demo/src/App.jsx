import Counter from "./Components/1.useStateHook/Counter";
import ToggleText from "./Components/1.useStateHook/ToggleText";
import ToggleTheme from "./Components/1.useStateHook/ToggleTheme";
import Form from "./Components/1.useStateHook/Form";
import Posts from "./Components/2.useEffectHook/Posts";

const App = () => {
  return (
    <div>
      {/* useState Hook */}
      {/* <Counter></Counter>
      <ToggleText></ToggleText>
      <ToggleTheme></ToggleTheme>
      <Form></Form> */}

      {/* useEffect Hook */}
      <Posts></Posts>
    </div>
  );
};

export default App;