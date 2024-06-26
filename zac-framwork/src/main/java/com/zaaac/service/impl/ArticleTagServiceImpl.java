package com.zaaac.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaaac.domain.entity.ArticleTag;
import com.zaaac.mapper.ArticleTagMapper;
import com.zaaac.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签关联表(ArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 21:23:35
 */
@Service("articleTagService")
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}

