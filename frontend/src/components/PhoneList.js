import React from 'react';
import PhoneItem from './PhoneItem';
import '../App.css';

function PhoneList({ phones, fetchPhones }) {
  return (
    <div className='container'>
      {phones.map(phone => (
        <PhoneItem key={phone.id} phone={phone} fetchPhones={fetchPhones} />
      ))}
    </div>
  );
}

export default PhoneList;
