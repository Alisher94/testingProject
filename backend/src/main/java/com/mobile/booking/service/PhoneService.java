package com.mobile.booking.service;

import com.mobile.booking.model.Phone;
import com.mobile.booking.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    public Phone bookPhone(Long id, String user) {
        Phone phone = phoneRepository.findById(id).orElseThrow(() -> new RuntimeException("Phone not found"));
        phone.setAvailable(false);
        phone.setBookedBy(user);
        phone.setBookedAt(LocalDateTime.now());
        return phoneRepository.save(phone);
    }

    public Phone returnPhone(Long id) {
        Phone phone = phoneRepository.findById(id).orElseThrow(() -> new RuntimeException("Phone not found"));
        phone.setAvailable(true);
        phone.setBookedBy(null);
        phone.setBookedAt(null);
        return phoneRepository.save(phone);
    }
}

