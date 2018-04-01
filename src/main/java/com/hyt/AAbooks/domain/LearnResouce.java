package com.hyt.AAbooks.domain;

public class LearnResouce {
    private Long id;
    private String author;
    private String title;
    private String url;
    public LearnResouce(){}
    public LearnResouce(String author,String title,String url) {
        this.author=author;
        this.title=title;
        this.url=url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
