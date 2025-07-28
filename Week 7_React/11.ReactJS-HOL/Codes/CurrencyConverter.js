// src/CurrencyConverter.js
import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');

  const handleSubmit = () => {
    const inr = parseFloat(rupees);
    if (isNaN(inr)) {
      alert("Please enter a valid number");
      return;
    }
    const euro = inr /101.116; // Example conversion rate
    alert(`₹${inr} is €${euro.toFixed(2)}`);
  };

  return (
    <div>
      <h2>Currency Converter (INR to Euro)</h2>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
    </div>
  );
}

export default CurrencyConverter;
