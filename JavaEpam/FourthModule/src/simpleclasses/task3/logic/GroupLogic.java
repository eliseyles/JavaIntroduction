//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3.logic;

import simpleclasses.task3.container.Group;

public class GroupLogic {

    public Group getExcelentStudents(Group group) {
        Group excelentStudents = new Group();
        for (int i = 0; i < group.size(); i++) {
            if (new StudentLogic().isProgressive(group.getStudent(i))) {
                excelentStudents.add(group.getStudent(i));
            }
        }
        return excelentStudents;
    }
}
