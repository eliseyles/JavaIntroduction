//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package simpleclasses.task9.entity;

import java.util.Objects;

public class Book {
    private static int bookCount = 1;
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int pageNumber;
    private double price;
    private String bindingType;

    public Book() {
        id = bookCount;
        title = "";
        author = "";
        publishingHouse = "";
        year = 0;
        pageNumber = 0;
        price = 0;
        bindingType = "";
        bookCount++;
    }

    public Book(String title, String author, String publishingHouse, int year, int pageNumber, double price, String bindingType) {
        id = bookCount;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
        this.bindingType = bindingType;
        bookCount++;
    }

    public int getId() {
        return id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pageNumber == book.pageNumber &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishingHouse, year, pageNumber, price, bindingType);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
