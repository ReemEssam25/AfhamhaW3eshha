package com.example.afhamhaw3eshha.Model;

import java.util.List;

public class Post {
    private String title, img, article ;
    private int likes;

    public Post(String title, String img, String article, int likes) {
        this.title = title;
        this.img = img;
        this.article = article;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
