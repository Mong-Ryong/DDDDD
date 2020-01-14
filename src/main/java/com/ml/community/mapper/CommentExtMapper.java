package com.ml.community.mapper;


import com.ml.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}