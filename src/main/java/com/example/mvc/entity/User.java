package com.example.mvc.entity;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String name;
    @Column(name = "orders_count")
    private Integer ordersCount;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    public User() {
    }

    public User(Long id, String name, Integer ordersCount) {
        this.id = id;
        this.name = name;
        this.ordersCount = ordersCount;
    }

    public User(String name, Integer ordersCount) {
        this.name = name;
        this.ordersCount = ordersCount;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, UserInfo userInfo) {
        this.name = name;
        this.userInfo = userInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ordersCount=" + ordersCount +
                ", userInfo=" + userInfo +
                '}';
    }
}
