package com.sksun.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sksun.blog.entity.ArticleEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ArticleMapper extends BaseMapper<ArticleEntity> {
    ArticleEntity findArticleById(int id);

//    @Select("select * from article")
//    IPage<ArticleEntity> getArticleList(Page<?> page);
}
