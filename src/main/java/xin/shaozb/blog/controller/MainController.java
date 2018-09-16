package xin.shaozb.blog.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.shaozb.blog.model.Article;
import xin.shaozb.blog.service.ArticleService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ArticleService articleService;

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String index(String page, Model model) {
        int intPage = 1;
        if (StringUtils.isNotEmpty(page)) {
            intPage = Integer.parseInt(page);
        }
        List<Article> articles = articleService.selectArticleList(intPage);
        model.addAttribute("articles",articles);
        return "index";
    }

    @RequestMapping("/query")
    public String query(String keyword) {
        return keyword;
    }
}
