package com.example.kiemtra_backend.controller;


import com.example.kiemtra_backend.model.dto.CartItemDto;
import com.example.kiemtra_backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CartController {

    @Autowired
    private CartService service;

    @GetMapping("/cartItems")
    public ResponseEntity<?> getAllCartItems () {
        List<CartItemDto> cartItemDtos = service.getCart();
        return ResponseEntity.ok(cartItemDtos);
    }


    @DeleteMapping("/cartItems/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCartItems (@PathVariable int id) {
        service.deleteCartItem(id);
    }

    @PutMapping("/cartItems/{id}/increment")
    public void incrementCartItemsById(@PathVariable int id) {
        service.incrementCartItemsById(id);
    }

    @PutMapping("/cartItems/{id}/decrement")
    public void decrementCartItemsById(@PathVariable int id) {
        service.decrementCartItemsById(id);
    }
}
