package com.sksun.blog.entity;

import lombok.Data;

@Data
public class ArticleTag {
    private Integer id;
    private ArticleEntity articleEntity;
    private TagEntity tagEntity;
}
