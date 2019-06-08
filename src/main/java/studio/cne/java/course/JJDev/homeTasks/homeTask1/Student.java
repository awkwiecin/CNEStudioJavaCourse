package studio.cne.java.course.JJDev.homeTasks.homeTask1;

public class Student {
    private int physicsGrade;
    private int mathGrade;
    private int englishGrade;
    private int polishGrade;
    private int peGrade;

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public int getMathgrade() {
        return mathGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getPolishGrade() {
        return polishGrade;
    }

    public int getPeGrade() {
        return peGrade;
    }

    public Student(int physicsGrade, int mathGrade, int englishGrade, int polishGrade, int peGrade) {
        this.physicsGrade = physicsGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.polishGrade = polishGrade;
        this.peGrade = peGrade;


    }

}
