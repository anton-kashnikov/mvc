package com.example.mvc.controller;

import com.example.mvc.dto.ArticleParams;
import com.example.mvc.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {

    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article")
    public ModelAndView getAll(Model model) {
//        ArticleParams articleParams = (ArticleParams)model.getAttribute("articleParams");
//        if (articleParams != null) {
//            System.out.println(articleParams.getLowPrice());
//            System.out.println(articleParams.getHighPrice());
//        }

        System.out.println();
        ModelAndView modelAndView = new ModelAndView("all-articles");
        modelAndView.addObject("articles", articleService.getAllArticles());
        modelAndView.addObject("name", "Sergey");
        modelAndView.addObject("articleParams", new ArticleParams());
        return modelAndView;
    }

    @PostMapping("/article")
    public ModelAndView getAllFilter(@ModelAttribute ArticleParams articleParams, Model model) {
        if (articleParams != null) {
            System.out.println(articleParams.getLowPrice());
            System.out.println(articleParams.getHighPrice());
        }
        ModelAndView modelAndView = new ModelAndView("all-articles");
        modelAndView.addObject("articles", articleService.getAllArticles());
        modelAndView.addObject("name", "Sergey");
        modelAndView.addObject("articleParams", new ArticleParams());
        return modelAndView;
    }
}

