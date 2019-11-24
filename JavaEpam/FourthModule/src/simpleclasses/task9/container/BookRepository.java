//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package simpleclasses.task9.container;

import simpleclasses.task9.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookRepository {
    private List<Book> books;


    public BookRepository() {
        books = new ArrayList<>();
    }

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void add(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public int size() {
        return books.size();
    }

    public Book getBook(int index) {
        if(isValidIndex(index)) {
            return books.get(index);
        }
        return null;
    }

    public void setCustomer(int index, Book book) {
        if (isValidIndex(index) && book != null) {
            books.set(index, book);
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRepository that = (BookRepository) o;
        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
