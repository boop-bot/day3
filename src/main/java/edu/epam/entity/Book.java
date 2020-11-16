package edu.epam.entity;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int publishYear;
    private int pages;
    private int price;
    private String bindingType;

    public Book() {}

    public Book(int id, String title, String author, String publishingHouse, int publishYear, int pages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishYear = publishYear;
        this.pages = pages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id = ").append(id).append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publishingHouse='").append(publishingHouse).append('\'');
        sb.append(", publishYear=").append(publishYear);
        sb.append(", pages=").append(pages);
        sb.append(", price=").append(price);
        sb.append(", bindingType='").append(bindingType).append('\'').append('}');
        return sb.toString();
    }
}
