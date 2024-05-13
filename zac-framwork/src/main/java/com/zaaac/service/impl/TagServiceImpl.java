package com.zaaac.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zaaac.domain.entity.Tag;
import com.zaaac.mapper.TagMapper;
import com.zaaac.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2024-05-13 13:24:17
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}

