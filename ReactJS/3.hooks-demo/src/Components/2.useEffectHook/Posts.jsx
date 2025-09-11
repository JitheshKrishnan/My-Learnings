import React, {useEffect, useState} from 'react'
import axios from "axios"

const URL = "https://jsonplaceholder.typicode.com/posts"

const Posts = () => {
  //! useState
  const [posts, setPosts] = useState([]);
  const [loading, setIsLoading] = useState(true);
  const [error, setError] = useState(null);

  //! useEffect
    useEffect(()=>{
        // Make HTTP Request
        axios
        .get(URL)
        .then((post)=>{
          setIsLoading(false);
          // Update the posts state
          setPosts(post.data);
        })
        .catch((error)=>{
          setError(error);
          setIsLoading(false);
        });
    },[loading, error])

    //! Loading
    if(loading) return <div style={{textAlign: "center", color: "green", fontWeight: "bolder"}}>Loading...</div>
    if(error) return <div style={{textAlign: "center", color: "red", fontWeight: "bolder"}}>{error.message}</div>
  return (
    <div>
        <h2>Network Request</h2>
        <h3>100 Posts:</h3>
        <div>
          {posts.map((post)=>{
            return (
              <div key={post.id}>
                <h2>{post.title}</h2>
                <p>{post.body}</p>
              </div>
            )
          })}
        </div>
    </div>
  )
}

export default Posts