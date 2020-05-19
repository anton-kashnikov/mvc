package com.example.mvc.dao;

import com.example.mvc.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleSpringJpaDao extends CrudRepository<Article, Long> {

    List<Article> findAllByNameLikeAndPriceBetween(String name, Double price, Double price2);

    List<Article> findAllByNameLike(String name);

    List<Article> findAllByNameLikeAndPriceAfter(String name, Double lowerPrice);

    List<Article> findAllByNameLikeAndPriceBefore(String name, Double highPrice);
}
