package com.example.kiemtra_backend.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
}
