package simpleclasses.task3;

public class StudentView {

    private static void printStudent(Student student) {
        System.out.println(student.getName() + student.getGroup());
    }

    public static void printExcelentStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (StudentLogic.isProgressive(students[i])) {
                StudentView.printStudent(students[i]);
            }
        }
    }

    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            StudentView.printStudent(students[i]);
        }
    }
}
