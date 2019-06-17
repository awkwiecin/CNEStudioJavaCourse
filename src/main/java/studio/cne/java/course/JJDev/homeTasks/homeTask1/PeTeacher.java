package studio.cne.java.course.JJDev.homeTasks.homeTask1;

public class PeTeacher implements Teacher {
    public void giveGrade(Student student, int grade) {
        if (grade <= 6 && grade >= 1) {
            student.setPeGrade(grade);
        } else
            throw new IllegalArgumentException("Dear teacher, you've been sacked!");
    }
}
