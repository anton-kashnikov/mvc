//package com.example.mvc.dao;
//
//import com.example.mvc.entity.Article;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class ArticleDaoHibernate implements ArticleDao {
//
//    SessionFactory factory = new Configuration().configure().buildSessionFactory();
//
//
//    @Override
//    public Article save(Article article) {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        session.saveOrUpdate(article);
//        session.getTransaction().commit();
//        session.close();
//        return article;
//    }
//
//    @Override
//    public List<Article> getAll() {
//        Session session = factory.openSession();
//        Query<Article> from_article_ = session.createQuery("from Article ");
//        List<Article> resultList = from_article_.getResultList();
//        session.close();
//        return resultList;
//    }
//
//    @Override
//    public Article getById(Long id) {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        Article article = session.get(Article.class, id);
//        session.getTransaction().commit();
//        session.close();
//        return article;
//    }
//
//    @Override
//    public void eraseAll() {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        session.createQuery("delete from Article ");
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public void eraseArticle(Article article) {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        session.delete(article);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<Article> getBetweenPrice(Double min, Double max) {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        Query query = session.createQuery("from Article where price between :minimal and :maximal");
//        query.setParameter("minimal", min);
//        query.setParameter("maximal", max);
//        List<Article> list = query.list();
//        session.getTransaction().commit();
//        session.close();
//        return list;
//    }
//
//    @Override
//    public List<Article> getAvailableArticle() {
//        Session session = factory.openSession();
//        session.beginTransaction();
//        List<Article> list = session.createQuery("from Article where quantity > 20").list();
//        session.getTransaction().commit();
//        session.close();
//        return list;
//    }
//
//    @Override
//    public List<Article> getArticleOrderByPrice(boolean desc) {
//        Session session = factory.openSession();
//        Query<Article> from_article_order_by_price;
//        if (desc) {
//            from_article_order_by_price = session.createQuery("from Article order by price");
//        } else {
//            from_article_order_by_price = session.createQuery("from Article order by price desc ");
//        }
//        return from_article_order_by_price.getResultList();
//    }
//
//}
