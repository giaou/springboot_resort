package org.example.resortspringboot.Customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer Leslie = new Customer(
                    1L,
                    "Leslie",
                    "U",
                    "WA123",
                    "123",
                    "leslie@gmail.com",
                    LocalDate.of(1997,07,25),
                    26

            );
            Customer Matthew = new Customer(
                    2L,
                    "Matthew",
                    "Johnston",
                    "WA456",
                    "456",
                    "matthew@gmail.com",
                    LocalDate.of(1997,11,25),
                    26

            );
            Customer Vu = new Customer(
                    3L,
                    "Vu",
                    "Nguyen",
                    "MO789",
                    "789",
                    "vu@gmail.com",
                    LocalDate.of(1990,11,1),
                    32

            );
            customerRepository.saveAll(List.of(Leslie,Matthew,Vu));

        };


    }
}
