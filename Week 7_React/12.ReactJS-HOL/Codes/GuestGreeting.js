import FlightDetails from './FlightDetails';

function GuestGreeting() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Please login to book a flight.</p>
      <FlightDetails />
    </div>
  );
}

export default GuestGreeting;
