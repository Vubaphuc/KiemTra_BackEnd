package com.example.kiemtra_backend.exception;

// class xử lý lỗi thông tin không được tìm thấy hoặc không tồn tại
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}