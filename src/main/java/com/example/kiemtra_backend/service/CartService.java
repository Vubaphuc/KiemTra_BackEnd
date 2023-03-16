package com.example.kiemtra_backend.service;

import com.example.kiemtra_backend.exception.BadRequestException;
import com.example.kiemtra_backend.exception.NotFoundException;
import com.example.kiemtra_backend.model.CartItem;
import com.example.kiemtra_backend.model.dto.CartItemDto;
import com.example.kiemtra_backend.model.mapper.CartMapper;
import com.example.kiemtra_backend.model.request.CrementUpdateRequest;
import com.example.kiemtra_backend.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService {

    @Autowired
    private CartItemRepository repository;
    public List<CartItemDto> getCart() {
        return repository.findAll()
                .stream()
                .map(CartMapper::toCartItemDto)
                .collect(Collectors.toList());
    }

    public void deleteCartItem(int id) {
        CartItem cartItem = repository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found CartItem with id = " + id);
        });

        repository.deleteById(cartItem.getId());
    }


    public void incrementCartItemsById(int id) {
        CartItem cartItem = repository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found CartItem with id = " + id);
        });

        cartItem.setCount(cartItem.getCount() + 1);
    }

    public void decrementCartItemsById(int id) {
        CartItem cartItem = repository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found CartItem with id = " + id);
        });

        if (cartItem.getCount() > 1) {
            cartItem.setCount(cartItem.getCount() - 1);
        }
    }
}
