package com.example.kiemtra_backend.database;


import com.example.kiemtra_backend.model.Course;

import java.util.ArrayList;
import java.util.List;
public class CourseDB {
    public static List<Course> courses = new ArrayList<>(List.of(
            new Course(1,"Sản phẩm 1","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,1),
            new Course(2,"Sản phẩm 2","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,2),
            new Course(3,"Sản phẩm 3","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,3),
            new Course(4,"Sản phẩm 4","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,1),
            new Course(5,"Sản phẩm 5","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,2),
            new Course(6,"Sản phẩm 6","Chưa biết","chưa biết",CategoryDB.categories,"chưa biết",200_000,5.5,3)
    ));
}
