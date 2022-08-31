package com.example.employee.dto;

import com.example.employee.domen.Comment;
import lombok.Data;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class PostDto {
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
    private Set<Comment> commentSet = new HashSet<>();

}

