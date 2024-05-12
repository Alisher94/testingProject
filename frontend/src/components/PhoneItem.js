import React, { useState } from 'react';
import axios from 'axios';

function PhoneItem({ phone, fetchPhones }) {
  const [userName, setUserName] = useState('');

  const options = {
    year: 'numeric',
    month: 'long',
    day: 'numeric',
    hour: '2-digit',
    minute: '2-digit',
    second: '2-digit',
    hour12: false
  };
  

  const handleBook = async () => {
    if (!userName) {
      alert('Please enter a user name.');
      return;
    }
    try {
      await axios.post(`http://localhost:8080/api/book/${phone.id}`, {'name': userName});
      fetchPhones();  // Refresh the list after booking
      setUserName('');  // Clear the input field after booking
    } catch (error) {
      console.error('Error booking the phone:', error);
      alert('Failed to book the phone.');
    }
  };

  const handleReturn = async () => {
    try {
      await axios.post(`http://localhost:8080/api/return/${phone.id}`);
      fetchPhones();  // Refresh the list after returning
    } catch (error) {
      console.error('Error returning the phone:', error);
      alert('Failed to return the phone.');
    }
  };

  return (
    <div className='item'>
      <h3>{phone.model}</h3>
      <p>Available: {phone.available ? 'Yes' : 'No'}</p>
      <p>Last Booked: {phone.bookedAt? new Date(phone.bookedAt).toLocaleString('en-US', options) : 'N/A'}</p>
      <p>Booked By: {phone.bookedBy || 'N/A'}</p>
      {phone.available ? (
        <div>
          <input
            type="text"
            value={userName}
            onChange={e => setUserName(e.target.value)}
            placeholder="Enter name to book"
          />
          <button onClick={handleBook}>Book</button>
        </div>
      ) : (
        <button onClick={handleReturn}>Return</button>
      )}
    </div>
  );
}

export default PhoneItem;
