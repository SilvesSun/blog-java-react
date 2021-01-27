package com.sksun.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sksun.blog.entity.ArticleEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
public interface ArticleMapper extends BaseMapper<ArticleEntity> {
    ArticleEntity findArticleById(int id);
}
