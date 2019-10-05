package com.example.afhamhaw3eshha.Model;

import java.util.List;

public class Post {
    private String title;
    private String img;
    private String article;
    private String category ;
   // private String userID;
    private String likes;
    private String userName;
    private String url;

    public Post(){

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Post(String title, String img, String article, String category, String likes, String userName, String url) {
        this.title = title;
        this.img = img;
        this.article = article;
        this.category = category;
        this.likes = likes;
        this.userName = userName;
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
