//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package simpleclasses.task9;

import simpleclasses.task9.container.BookRepository;
import simpleclasses.task9.entity.Book;
import simpleclasses.task9.logic.BookRepositoryLogic;
import simpleclasses.task9.view.BookRepositoryView;

import java.util.Random;

public class BookRepositoryRunner {
    public static final String[] TITLE = new String[]{"hfskd", "fhsdjkfh", "huser", "rtyui", "oeiuew", "uirower", "aaand", "bfdbkr"};
    public static final String[] AUTHOR = new String[]{"joiew", "ioewds", "owep", "owdssfv", "koim", "pexk"};
    public static final String[] PUBLISHER = new String[]{"klsr", "qerd", "qwer", "poiuumxz", "iuytr", "mnbv"};
    public static final String[] BIND_TYPE = new String[]{"lj;lsjfhlksdf", "seyiruyojnf", "ndksd", "ouirt", "plkjnbvc", "wedfghjk"};
    public static final int BOOK_NUMBER = 5;

    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        for (int i = 0; i < BOOK_NUMBER; i++) {
            bookRepository.add(new Book(TITLE[new Random().nextInt(TITLE.length)],
                    AUTHOR[new Random().nextInt(AUTHOR.length)],
                    PUBLISHER[new Random().nextInt(PUBLISHER.length)],
                    new Random().nextInt(200) + 1819,
                    new Random().nextInt(1000),
                    new Random().nextDouble() * 100,
                    BIND_TYPE[new Random().nextInt(BIND_TYPE.length)]
            ));
        }

        BookRepositoryView bookRepositoryView = new BookRepositoryView();
        bookRepositoryView.print(bookRepository);

        bookRepositoryView.print(new BookRepositoryLogic().findBooksByAuthor(bookRepository, "owep"));
        bookRepositoryView.print(new BookRepositoryLogic().findBooksByPublisher(bookRepository, "klsr"));
        bookRepositoryView.print(new BookRepositoryLogic().findBooksPushedAfterYear(bookRepository, 1950));
    }

}
