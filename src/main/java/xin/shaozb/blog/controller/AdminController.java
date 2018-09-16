package xin.shaozb.blog.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.shaozb.blog.model.Article;
import xin.shaozb.blog.service.ArticleService;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String adminIndex() {
        return "adminIndex";
    }

    @GetMapping("/article/{id}")
    @ResponseBody
    public String fetchArticle(@PathVariable(value = "id") int id) {
        Article article = articleService.selectArticleById(id);
        return JSONObject.toJSONString(article);
    }

    @PostMapping("/article/")
    public String createArticle() {
        return "create";
    }

    @PutMapping("/article/{id}")
    public String updateArticle(@PathVariable(value = "id") int id) {
        return "update";
    }

    @DeleteMapping("/article/{id}")
    public String deleteArticle(@PathVariable(value = "id") int id) {
        return "delete";
    }
}
