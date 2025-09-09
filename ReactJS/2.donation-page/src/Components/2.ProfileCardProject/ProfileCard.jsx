const ProfileCard = () => {
    const name = "Jithesh";
    const language = "JavaSpringBoot";
    const bio = "I love building web apps with react and exploring new tech.";
    const imageUrl = "https://images.pexels.com/photos/1564839/pexels-photo-1564839.jpeg";
    const hobbies = ["Coding", "Gaming", "Reading"];
    return (
        <div style={{padding: "2rem", fontFamily: "Arial"}}>
            <h1>Welcome to {name}'s Profile</h1>
            <img style={{borderRadius: "50%", width: "200px", height: "200px", marginBottom: "1rem"}} src={imageUrl} alt="profile" />
            <p><strong>Favorite Language: </strong>{language}</p>
            <p><strong>Bio: </strong>{bio}</p>
            <h1>Hobbies</h1>
            <ul>
                {hobbies.map((hobby, index)=>{
                    return <li key={index}>{hobby}</li>
                })}
            </ul>
        </div>
    );
};

export default ProfileCard;