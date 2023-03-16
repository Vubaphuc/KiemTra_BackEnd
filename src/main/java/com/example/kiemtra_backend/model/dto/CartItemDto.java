package com.example.kiemtra_backend.model.dto;


import com.example.kiemtra_backend.model.Course;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CartItemDto {
    private Integer id;
    private Course course;
    private Integer count;
}
