package com.felix.testing.customer;

import org.assertj.core.api.OptionalAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository underTest;
    @Test
    void itShouldSelectCustomerByPhoneNumber() {
        // Given

        // When
        // Then

    }

    @Test
    void itShouldSaveCustomer() {
        // Given
        UUID id = UUID.randomUUID();
        Customer customer = new Customer(id, "Felix", "0700000000");
        // When
        underTest.save(customer);
        // Then
        Optional<Customer> optionalCustomer = underTest.findById(id);
        assertThat(optionalCustomer)
                .isPresent()
                .hasValueSatisfying(customer1 -> {
//                    assertThat(customer1.getID()).isEqualTo(id);
//                    assertThat(customer1.getName()).isEqualTo("Felix");
//                    assertThat(customer1.getPhoneNumber()).isEqualTo("0700000000");
                    assertThat(customer1).isEqualToComparingFieldByField(customer);
                });

        // if check for assertCheck



    }
}