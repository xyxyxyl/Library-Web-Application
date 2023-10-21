package com.luv2code.springbootlibrary.DAO;

import com.luv2code.springbootlibrary.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    Checkout findByUserEmailandBookId(String userEmail, Long bookId);
}
