package com.example.kiemtra_backend.model.mapper;

import com.example.kiemtra_backend.database.CourseDB;
import com.example.kiemtra_backend.exception.NotFoundException;
import com.example.kiemtra_backend.model.CartItem;
import com.example.kiemtra_backend.model.Course;
import com.example.kiemtra_backend.model.dto.CartItemDto;

import java.util.Optional;

public class CartMapper {

    public static CartItemDto toCartItemDto (CartItem cartItem) {
        Course course = getCousreById(cartItem.getCourseId()).orElseThrow(() -> {
            throw new NotFoundException("Not found Course with id = " + cartItem.getCourseId());
        });


        CartItemDto cartItemDto = new CartItemDto();

        cartItemDto.setId(cartItem.getId());
        cartItemDto.setCourse(course);
        cartItemDto.setCount(cartItem.getCount());

        return cartItemDto;
    }

    private static Optional<Course> getCousreById(int courseId) {
        return CourseDB.courses
                .stream()
                .filter(course -> course.getId() == courseId)
                .findFirst();
    }
}
