package studio.cne.java.course.JJDev.homeTasks.homeTask1;

public class MathTeacher implements Teacher {
    public void giveGrade(Student student, int grade) {
        if (grade <= 6 && grade >= 1) {
            student.setMathGrade(grade);
        } else
            throw new IllegalArgumentException("Dear teacher, you've been sacked!");
    }
}
