package com.example.kiemtra_backend.repository;


import com.example.kiemtra_backend.database.CartDB;
import com.example.kiemtra_backend.model.CartItem;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CartItemRepository {

    // lay all
    public List<CartItem> findAll () {
        return CartDB.cart;
    }


    // lay theo id
    public Optional<CartItem> findById(int id) {
        return CartDB.cart
                .stream()
                .filter(cartItem -> cartItem.getId() == id)
                .findFirst();
    }

    // xoas theo id
    public void deleteById(int id) {
        CartDB.cart.removeIf(cart -> cart.getId() == id);
    }
}
