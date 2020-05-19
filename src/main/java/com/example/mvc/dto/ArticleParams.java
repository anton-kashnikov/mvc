package com.example.mvc.dto;

public class ArticleParams {

    private Double lowPrice;
    private Double highPrice;

    public ArticleParams() {
    }

    public ArticleParams(Double lowPrice, Double highPrice) {
        this.lowPrice = lowPrice;
        this.highPrice = highPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }
}
