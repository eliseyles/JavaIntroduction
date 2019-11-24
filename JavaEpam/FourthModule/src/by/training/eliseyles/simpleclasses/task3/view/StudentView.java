//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package by.training.eliseyles.simpleclasses.task3.view;

import by.training.eliseyles.simpleclasses.task3.entity.Student;

public class StudentView {

    public void printStudent(Student student) {
        System.out.println(student.getName() + " " + student.getGroup());
    }

}
