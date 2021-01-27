package com.sksun.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@TableName(value = "article")
@NoArgsConstructor
public class ArticleEntity {
    @TableId(type = IdType.AUTO)
    private Integer id;

    @NonNull
    private String title;
    private String content;
    private String author;
    private Integer categoryId;

    @TableField(exist = false)
    private CategoryEntity category;

    @TableField(exist = false)
    private List<TagEntity> tagSet;
}
