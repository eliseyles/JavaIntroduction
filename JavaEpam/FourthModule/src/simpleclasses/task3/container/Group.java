//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

package simpleclasses.task3.container;

import simpleclasses.task3.entity.Student;

import java.util.Arrays;

public class Group {
    private Student[] students;

    public Group(Student[] students) {
        this.students = students;
    }

    public Group() {
        this.students = new Student[]{};
    }

    public int size() {
        return students.length;
    }

    public Student getStudent(int index) {
        if (index >= 0 && index < size()) {
            return students[index];
        }
        return null;
    }

    public boolean add(Student student) {
        if (student != null) {
            students = Arrays.copyOf(students, size() + 1);
            students[size() - 1] = student;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
