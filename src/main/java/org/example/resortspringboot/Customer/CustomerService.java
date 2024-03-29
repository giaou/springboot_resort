package org.example.resortspringboot.Customer;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class CustomerService {
    public List<Customer> getCustomer(){
        return List.of(
                new Customer(
                        1L,
                        "U",
                        "Leslie",
                        "WA123",
                        "123",
                        "leslie@gmail.com",
                        LocalDate.of(1997,07,25),
                        26
                )

        );
    }
}
