package ru.geekbrains.model;

public class Product {
    Long id;
    String title;
    String cast;

    public Product(Long id, String title, String cast) {
        this.id = id;
        this.title = title;
        this.cast = cast;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cast='" + cast + '\'' +
                "}\\n";
    }
}
