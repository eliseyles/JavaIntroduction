package simpleclasses.task3;

public class GroupView {
    public static void printGroup(Group group) {
        for (int i = 0; i < group.getStudents().length; i++) {
            StudentView.printStudent(group.getStudents()[i]);
        }
    }
}
