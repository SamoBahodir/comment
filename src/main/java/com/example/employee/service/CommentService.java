package com.example.employee.service;

import com.example.employee.dto.CommentDto;

public interface CommentService {
    CommentDto commentDto(CommentDto commentDto,Integer postId);
    void deleteComment(Integer commentId);
}
