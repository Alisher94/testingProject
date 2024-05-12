package com.mobile.booking.controller;

import com.mobile.booking.dto.UserDTO;
import com.mobile.booking.model.Phone;
import com.mobile.booking.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/getAll")
    public List<Phone> getAllPhones() {
        return phoneService.getAllPhones();
    }

    @PostMapping("/book/{id}")
    public Phone bookPhone(@PathVariable Long id, @RequestBody UserDTO user) {
        System.out.println(user.getName());
        return phoneService.bookPhone(id, user.getName());
    }

    @PostMapping("/return/{id}")
    public Phone returnPhone(@PathVariable Long id) {
        return phoneService.returnPhone(id);
    }
}

