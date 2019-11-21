//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3;

public class StudentLogic {

    private static final int HIGH_MARK = 9;
    private static final int HIGHEST_MARK = 10;

    public static boolean isProgressive(Student student) {
        boolean isProgressive = true;
        for (int i = 0; i < student.getProgress().length && isProgressive; i++) {
            if (student.getProgress()[i] < HIGH_MARK || student.getProgress()[i] > HIGHEST_MARK) {
                isProgressive = false;
            }
        }
        return isProgressive;
    }
}
