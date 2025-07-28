function FlightDetails() {
  const flights = [
    { id: 1, from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
    { id: 2, from: 'Chennai', to: 'Kolkata', time: '1:00 PM' },
    { id: 3, from: 'Hyderabad', to: 'Bangalore', time: '5:00 PM' },
  ];

  return (
    <div>
      <h3>Flight Details</h3>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} ➡ {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightDetails;
