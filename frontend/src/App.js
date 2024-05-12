import React, { useEffect, useState } from 'react';
import axios from 'axios';
import PhoneList from './components/PhoneList';

function App() {
  const [phones, setPhones] = useState([]);

  useEffect(() => {
    fetchPhones();
  }, []);

  const fetchPhones = async () => {
    try {
      const response = await axios.get('http://localhost:8080/api/getAll');
      setPhones(response.data);
    } catch (error) {
      console.error('Error fetching phones:', error);
    }
  };

  return (
    <div>
      <h1 className='padding10'>Phone Booking System</h1>
      <PhoneList phones={phones} fetchPhones={fetchPhones} />
    </div>
  );
}

export default App;
