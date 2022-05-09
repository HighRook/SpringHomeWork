package ru.geekbrains.spring_less_web.Model;

public class Product {

    private Long id;

    private String title;

    private Integer amount;

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

    public Product(Long id, String title, Integer amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
    }

    public Product() {
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
