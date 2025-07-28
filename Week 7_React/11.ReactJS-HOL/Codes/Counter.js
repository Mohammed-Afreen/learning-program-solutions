// src/Counter.js
import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prev => prev + 1);
  };

  const sayHello = () => {
    alert("Hello! Button clicked.");
  };

  const greet = (message) => {
    alert( message);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <h2>Counter: {count}</h2>
      
      <button onClick={() => { increment(); sayHello(); }}>
        Increment
      </button>
      
      <button onClick={() => setCount(count - 1)}>
        Decrement
      </button>

      <br /><br />
      <button onClick={() => greet("Welcome!")}>
        Say Welcome
      </button>

      <br /><br />
      <button onClick={handleClick}>
        Click on me
      </button>
    </div>
  );
}

export default Counter;
