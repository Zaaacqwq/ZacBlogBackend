package com.zaaac.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zaaac.domain.ResponseResult;
import com.zaaac.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
