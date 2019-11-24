//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3;

import simpleclasses.task3.container.Group;
import simpleclasses.task3.entity.Student;
import simpleclasses.task3.logic.GroupLogic;
import simpleclasses.task3.view.GroupView;

public class StudentRunner {
    public static final String[] NAMES = new String[]{"dsd", "dsdsd", "hasukf", "fjdk", "yreui", "fdleq",
            "fhdj", "as", "awe", "irej"};
    public static final String[] GROUPS = new String[]{"1092", "439", "32", "643894", "6422",
            "3456", "47390", "5658", "647893", "3223"};
    public static final int[][] MARKS = new int[][]{{9, 10, 9, 10, 9}, {5, 4, 7, 8, 9}, {6, 5, 6, 5, 6}, {5, 7, 5, 8, 6},
            {10, 10, 10, 10, 10}, {9, 8, 9, 9, 9}, {7, 7, 7, 7, 7}, {5, 7, 8, 7, 8}, {1, 4, 2, 1, 1}, {5, 8, 6, 5, 7}};
    public static final int SIZE = 10;

    public static void main(String[] args) {
        Student[] students = new Student[SIZE];
        for (int i = 0; i < SIZE; i++) {
            students[i] = new Student (NAMES[i], GROUPS[i], MARKS[i]);
        }

        Group group = new Group(students);

        new GroupView().printGroup(new GroupLogic().getExcelentStudents(group));
    }
}
