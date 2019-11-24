//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package by.training.eliseyles.simpleclasses.task9.view;

import by.training.eliseyles.simpleclasses.task9.entity.Book;

public class BookView {

    public void print(Book book) {
        System.out.println("Book " +
                "id " + book.getId() +
                ", title = " + book.getTitle() +
                ", author = " + book.getAuthor() +
                ", publishingHouse = " + book.getPublishingHouse() +
                ", year = " + book.getYear() +
                ", pageNumber = " + book.getPageNumber() +
                ", price = " + book.getPrice() +
                ", bindingType = " + book.getBindingType());
    }
}
