package simpleclasses.task3;


import java.util.Arrays;

public class Group {
    private Student[] students;

    public Group(Student[] students) {
        this.students = students;
    }

    public Group() {
        this.students = new Student[]{};
    }

    public Student[] getStudents() {
        return students;
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
