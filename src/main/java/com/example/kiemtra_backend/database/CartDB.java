package com.example.kiemtra_backend.database;

import com.example.kiemtra_backend.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class CartDB {
    public static List<CartItem> cart = new ArrayList<>(List.of(
            new CartItem(1,1,5),
            new CartItem(2,2,5),
            new CartItem(3,3,5),
            new CartItem(4,1,5),
            new CartItem(5,2,5),
            new CartItem(6,3,5)

    ));
}
