//Sync === blocking code
// console.log("Step 4: Drain the pasta and serve");
// console.log("Step 1: Start boiling");
// console.log("Step 2: Add pasta to the pot");
// console.log("Step 3: Stir and wait for 10 minutes");

// function blockingTasks() {
//   console.log("Step 1: Start a long-running task");
//   //simulate a blocking task
//   const startTime = Date.now();
//   while (Date.now() - startTime < 5000) {}

//   console.log("Step 2: Long-running task finished");
// }
// console.log("Before calling the blocking task");

// blockingTasks();
// console.log("After the blocking task");

//! Async code
// console.log("Task 1");

// setTimeout(() => {
//   console.log("Task 2 (delay)");
// }, 2000);

// console.log("Task 3");

//Weather Application
//API (Mimic)
//Our frontend app

function fetchData(callback){
  console.log("Fetching data from server....");
  setTimeout(()=>{
    console.log("Data fetched from server successfully!");
    callback();
  },3000);
}

function processData(){
  console.log("Processing the data fetched from the server...");  
}

// fetchData(processData);

//! Components of HTTP Request
//HTTP: Hypertext Transfer protocol
//?.Method(HTTP Verb)
//GET- Retrieve data
//POST- sending data to server
//PUT-Update
//DELETE-Deleting
//?URL-Uniform Resource Locator - https:///example.com //API
//?Headers
//? Body

//HTTP client
//fetch - default
//axios - third party

//Making http request
// fetch("https://jsonplaceholder.typicode.com/posts")
//   .then((response)=>{
//     return response.json().then((posts)=>{
//       console.log("Posts fetched successfully: ", posts);    
//     });
//   }).catch((error)=>{
//       console.log("Error fetching data: ", error);
// });

//Fetch user details - API / https://jsonplaceholder.typicode.com/users/2

function fetchUserDetails(callback){
  fetch("https://jsonplaceholder.typicode.com/users/10")
  .then((response)=>{
    return response.json()
    .then((userDetails)=>{
      console.log(userDetails);
      callback(userDetails.id);
    });
  })
  .catch((error)=>{
    console.log("Error fetching user details: ", error);
  });
}

function userPosts(userId){
  fetch(`https://jsonplaceholder.typicode.com/posts?userId=${userId}`)
  .then((response)=>{
    return response.json()
    .then((userPosts)=>{
      console.log("User posts fetched successfully: ", userPosts);
    });
  })
  .catch((error)=>{
    console.log("Error fetching user posts: ", error);
  });
}

// fetchUserDetails(userPosts);

//!1.Create the promise
// const myPromise = new Promise((resolve, reject)=>{
//   let success = false;
//   if(success) resolve("Operation Successful!");
//   else reject("Operation Failed!");
// });

// //!2. Consume the promise
// myPromise.then((data)=>{
//   console.log(data);
// }).catch((error)=>{
//   console.log(error);
// }).finally(()=>{
//   console.log("Operation Executed!");
// });

//! Promise example

//!Create promise
//!2.consume promise
// const fetchDataPromise = fetch("https://jsonplaceholder.typicode.com/albums");
// const fetchDataPromise = fetch("https://jsonplaceholder.typicode.com/albums");
// fetchDataPromise.then((response)=>{
//   const resJson = response.json();
//   console.log(resJson);
//   return resJson
//   .then((data)=>{
//     console.log(data);
//   });
// })
// .catch((error)=>{
//   console.log(error);
// }).finally(()=>{
//   console.log("Promise Executed!");
// });

//! Async Await
async function fetchAlbums() {
  try {
    const albumsResponse = await fetch("https://jsonplaceholder.typicode.com/albums");
    console.log(albumsResponse);
    const albums = await albumsResponse.json();
    console.log(albums);
  } catch (error) {
    console.log(error);
  }
}

// fetchAlbums();
