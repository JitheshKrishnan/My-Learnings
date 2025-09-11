export const Card = ({children}) => {
  return (
    <div style={{border: "1px solid #ccc", borderRadius: "10px", padding: "20px"}}>
        {children}
    </div>
  );
};