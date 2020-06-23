package com.example.books;

public class Books {

    private int id;
    private String category;
    private  String name;
    private String author;
    private  String imageUrl;
    private String dis_author;

    public Books(int id, String category, String name, String author, String imageUrl, String dis_author) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.author = author;
        this.imageUrl = imageUrl;
        this.dis_author = dis_author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDis_author() {
        return dis_author;
    }

    public void setDis_author(String dis_author) {
        this.dis_author = dis_author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", dis_author='" + dis_author + '\'' +
                '}';
    }
}
