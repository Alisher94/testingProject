package com.mobile.booking;

import com.mobile.booking.model.Phone;
import com.mobile.booking.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Booking implements CommandLineRunner {

    @Autowired
    private PhoneRepository phoneRepository;


    public static void main(String[] args) {
        SpringApplication.run(Booking.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        phoneRepository.save(new Phone("Samsung Galaxy S9"));
        phoneRepository.save(new Phone("Samsung Galaxy S8"));
        phoneRepository.save(new Phone("Samsung Galaxy S8"));
        phoneRepository.save(new Phone("Motorola Nexus 6"));
        phoneRepository.save(new Phone("Oneplus 9"));
        phoneRepository.save(new Phone("Apple iPhone 13"));
        phoneRepository.save(new Phone("Apple iPhone 12"));
        phoneRepository.save(new Phone("Apple iPhone 11"));
        phoneRepository.save(new Phone("iPhone X"));
        phoneRepository.save(new Phone("Nokia 3310"));
    }

}
