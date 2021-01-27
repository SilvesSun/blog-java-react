package com.sksun.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@TableName("tag")
public class TagEntity {
    private Integer id;
    private String name;
    private List<ArticleEntity> articles;
}
