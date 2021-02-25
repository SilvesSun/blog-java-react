package com.sksun.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@TableName("tag")
@AllArgsConstructor
@NoArgsConstructor
public class TagEntity {
    private Integer id;
    private String name;
    private List<ArticleEntity> articles;
}
