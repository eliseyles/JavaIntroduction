//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3;

public class GroupView {
    public static void printGroup(Group group) {
        for (int i = 0; i < group.size(); i++) {
            StudentView.printStudent(group.getStudent(i));
        }
    }
}
