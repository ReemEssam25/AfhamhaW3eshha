package com.example.afhamhaw3eshha.Model;

import java.util.List;

public class Post {
    private String title;
    private String img;
    private String article;
    private String category ;
   // private String userID;
    private int likes;


    public Post(String title, String img, String article, String category, int likes , String userID) {
        this.title = title;
        this.img = img;
        this.article = article;
        this.category = category;
        this.likes = likes;
       // this.userID = userID;
    }

   /* public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }*/

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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
