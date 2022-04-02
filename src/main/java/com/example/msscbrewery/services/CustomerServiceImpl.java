package com.example.msscbrewery.services;

import com.example.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Maurizio")
                .build();
    }
}
