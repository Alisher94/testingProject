package com.mobile.booking.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.mobile.booking.model.Phone;
import com.mobile.booking.repository.PhoneRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PhoneServiceTest {

    @Mock
    private PhoneRepository phoneRepository;

    @InjectMocks
    private PhoneService phoneService;

    private Phone phone;

    @BeforeEach
    void setUp() {
        phone = new Phone("iPhone X");
        phone.setId(1L);
        phone.setAvailable(true);
    }

    @Test
    void testBookPhone() {
        when(phoneRepository.findById(1L)).thenReturn(Optional.of(phone));
        phoneService.bookPhone(1L, "User1");
        assertFalse(phone.isAvailable());
        assertEquals("User1", phone.getBookedBy());
        assertNotNull(phone.getBookedAt());
        verify(phoneRepository, times(1)).save(phone);
    }

    @Test
    void testReturnPhone() {
        phone.setAvailable(false);
        when(phoneRepository.findById(1L)).thenReturn(Optional.of(phone));
        phoneService.returnPhone(1L);
        assertTrue(phone.isAvailable());
        assertNull(phone.getBookedBy());
        assertNull(phone.getBookedAt());
        verify(phoneRepository, times(1)).save(phone);
    }
}
