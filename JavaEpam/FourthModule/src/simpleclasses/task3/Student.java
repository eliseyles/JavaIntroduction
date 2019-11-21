//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов).

package simpleclasses.task3;

import java.util.Arrays;
import java.util.Objects;

class Student {

    private String name;
    private String group;
    private int[] progress;

    public Student(String name, String group, int[] progress) {
        this.name = name;
        this.group = group;
        this.progress = progress;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getProgress() {
        return progress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Arrays.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group);
        result = 31 * result + Arrays.hashCode(progress);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }
}

