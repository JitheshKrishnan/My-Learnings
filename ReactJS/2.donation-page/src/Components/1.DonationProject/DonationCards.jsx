const DonationCards = () => {
    return (
        <section style={{display: "flex", justifyContent: "space-around", padding: "2rem"}}>
            <div style={{border: "1px solid #ccc", padding: "1rem", width: "200px", textAlign: "center"}}>
                <h3>Education</h3>
                <p>Support school programs and supplies</p>
                <button style={{border: "none", borderRadius: "0.5rem", padding: "0.5rem", background: "blue", color: "white"}}>Donate Now</button>
            </div>
            <div style={{border: "1px solid #ccc", padding: "1rem", width: "200px", textAlign: "center"}}>
                <h3>Healthcare</h3>
                <p>Provide medicines and care for families</p>
                <button style={{border: "none", borderRadius: "0.5rem", padding: "0.5rem", background: "blue", color: "white"}}>Donate Now</button>
            </div>
            <div style={{border: "1px solid #ccc", padding: "1rem", width: "200px", textAlign: "center"}}>
                <h3>Food AID</h3>
                <p>Deliver meals to those in need</p>
                <button style={{border: "none", borderRadius: "0.5rem", padding: "0.5rem", background: "blue", color: "white"}}>Donate Now</button>
            </div>
        </section>
    );
};

export default DonationCards;