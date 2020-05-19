package com.example.mvc.entity;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "`order_items`")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "article_id")
    private Article article;
    @Column(name = "quantity")
    private Integer quantity;

    public OrderItem(Long id, Article article, Integer quantity) {
        this.id = id;
        this.article = article;
        this.quantity = quantity;
    }

    public OrderItem(Article article, Integer quantity) {
        this.article = article;
        this.quantity = quantity;
    }

    public OrderItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "OrderItem{" +
                "article=" + article +
                ", quantity=" + quantity +
                '}';
    }
}
