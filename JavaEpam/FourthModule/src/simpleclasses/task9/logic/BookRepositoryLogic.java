//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package simpleclasses.task9.logic;

import simpleclasses.task9.container.BookRepository;

public class BookRepositoryLogic {

    public BookRepository findBooksByAuthor(BookRepository bookRepository, String author) {
        if (bookRepository != null) {
            BookRepository authorBooks = new BookRepository();
            for (int i = 0; i < bookRepository.size(); i++) {
                if(bookRepository.getBook(i).getAuthor().equals(author)) {
                    authorBooks.add(bookRepository.getBook(i));
                }
            }
            return authorBooks;
        }
        return new BookRepository();
    }

    public BookRepository findBooksByPublisher(BookRepository bookRepository, String publisher) {
        if (bookRepository != null) {
            BookRepository authorBooks = new BookRepository();
            for (int i = 0; i < bookRepository.size(); i++) {
                if(bookRepository.getBook(i).getPublishingHouse().equals(publisher)) {
                    authorBooks.add(bookRepository.getBook(i));
                }
            }
            return authorBooks;
        }
        return new BookRepository();
    }

    public BookRepository findBooksPushedAfterYear(BookRepository bookRepository, int year) {
        if (bookRepository != null) {
            BookRepository authorBooks = new BookRepository();
            for (int i = 0; i < bookRepository.size(); i++) {
                if(bookRepository.getBook(i).getYear() > year) {
                    authorBooks.add(bookRepository.getBook(i));
                }
            }
            return authorBooks;
        }
        return new BookRepository();
    }
}
