import { Card } from "./Components/3.Props/Card";
import Layout from "./Components/4.Children-PageLayout/Layout";

const App = () => {
  return (
    <div>
      {/* Homepage Layout */}
      <Layout title="Welcome Page">
        <h1>Welcome to React</h1>
        <p>This is a basic react layout using reusable components.</p>
        <p>You can use this layout for any kind of web application.</p>
      </Layout>
      {/* Services */}
      <Layout>
        <h2>Our Services</h2>
        <hr />
        <ul>
          <li>Web Development</li>
          <li>UI/UX Design</li>
          <li>Mobile App Solutions</li>
        </ul>
      </Layout>
      {/* Footer */}
      <footer>&copy; All rights reserved</footer>
    </div>
  );
};

export default App;

//! Children - 1
// import { Card } from "./Components/3.Props/Card";

// const App = () => {
//   return (
//     <div>
//       <Card>
//         <h1>Hello JK</h1>
//         <p>Welcome to react</p>
//       </Card>
//       <Card>
//         <h1>Hello NK</h1>
//         <p>Welcome to Node</p>
//       </Card>
//     </div>
//   );
// };

// export default App;

//! Props
// import Greeting from "./Components/3.Props/Greeting";
// import DonationButton from "./Components/3.Props/DonationButton";

// const App = () => {
//   const donateFn = ()=>{
//       alert("Thank you for donating!");
//   }
//   return (
//     <div>
//       <Greeting name="Jithesh" message="Good Morning" age="20 years"/>
//       <Greeting name="Naren" message="Good Afternoon" age="22 years"/>
//       <Greeting name="Aslam" message="Good Evening" age="24 years"/>
//       <DonationButton onDonate={donateFn}/>
//     </div>
//   );
// };

// export default App;