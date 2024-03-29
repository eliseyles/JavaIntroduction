//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

package by.training.eliseyles.simpleclasses.task9.view;

import by.training.eliseyles.simpleclasses.task9.container.BookRepository;

public class BookRepositoryView {
    public void print(BookRepository bookRepository) {
        for(int i = 0; i < bookRepository.size(); i++) {
            new BookView().print(bookRepository.getBook(i));
        }
        System.out.println();
    }
}
