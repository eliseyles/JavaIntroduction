//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3;

import java.util.ArrayList;

public class GroupLogic {
    public Group getExcelentStudents(Group group) {
        ArrayList<Student> excelentStudents = new ArrayList<Student>();
        for (int i = 0; i < group.getStudents().length; i++) {
            if (StudentLogic.isProgressive((Student) group.getStudents()[i])) {
                excelentStudents.add((Student) group.getStudents()[i]);
            }
        }
        return new Group(excelentStudents.toArray(new Student[excelentStudents.size()]));
    }
}
