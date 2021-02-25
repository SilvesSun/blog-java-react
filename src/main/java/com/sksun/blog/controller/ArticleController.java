package com.sksun.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sksun.blog.common.enums.ResultCode;
import com.sksun.blog.common.result.Result;
import com.sksun.blog.entity.ArticleEntity;
import com.sksun.blog.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("articles")
public class ArticleController {
    final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @RequestMapping("/getArticle/{id}")
    public Result getArticle(@PathVariable("id") Integer id){
        Result r = new Result();
        if (null == id) {
            r.setCode(ResultCode.PARAM_IS_BLANK);
            return r;
        }
        log.info("查询文章id为" + id);
        ArticleEntity article = articleService.findArticleById(id);
        log.info("查询结果为 "+ article);
        r.setCode(ResultCode.SUCCESS);
        r.setResult(article);
        return r;
    }

    @RequestMapping("/getArticles")
    public Result getArticles(@RequestParam("page") Integer page,
                                            @RequestParam(name="pageSize", required = false, defaultValue = "10") Integer pageSize){
        log.info("查询第{}页数据, 单页共{}条", page, pageSize);
        IPage<ArticleEntity> q = articleService.getArticleList(new Page<>(page, pageSize));
        Map<String, Object> response = new HashMap<>();
        System.out.println(q.getTotal());
        response.put("data", q.getRecords());
        response.put("total", q.getTotal());
        response.put("page", q.getCurrent());
        response.put("pageSize", q.getSize());
        response.put("pages", q.getPages());
        return Result.success(response);
    }
}
