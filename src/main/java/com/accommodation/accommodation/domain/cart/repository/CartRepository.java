package com.accommodation.accommodation.domain.cart.repository;

import com.accommodation.accommodation.domain.cart.model.entity.Cart;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Page<Cart> findByUserId(Long userId , Pageable pageable);
}
