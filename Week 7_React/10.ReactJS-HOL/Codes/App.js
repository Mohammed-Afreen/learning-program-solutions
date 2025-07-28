import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";
  const sr = "https://tse3.mm.bing.net/th/id/OIP.sqgeVFGesP9DV4KIFw0vwQHaEK?pid=Api&P=0&h=180"; 
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  const ItemName = {
    Name: "DBS",
    Rent: 70000,
    Address: "Hyderabad"
  };

  // Conditional color class
  const rentColor = ItemName.Rent <= 60000 ? "textRed" : "textGreen";

  return (
    <center>
    <div >
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={rentColor}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
    </center>
  );
}

export default App;
