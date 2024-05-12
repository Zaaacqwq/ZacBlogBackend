package com.zaaac.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaaac.domain.ResponseResult;
import com.zaaac.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2024-05-12 03:55:01
 */
public interface CommentService extends IService<Comment> {
    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}

