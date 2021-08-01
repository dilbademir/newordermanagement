package com.vitelco.ordermanagement.repository;

import com.vitelco.ordermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    static Optional<Customer> findByEmail(String email) {
        return null;
    }
}