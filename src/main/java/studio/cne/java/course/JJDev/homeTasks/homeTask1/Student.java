package studio.cne.java.course.JJDev.homeTasks.homeTask1;

public class Student {

    private String firstName;
    private String lastName;

    private int physicsGrade;
    private int mathGrade;
    private int englishGrade;
    private int polishGrade;
    private int peGrade;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setPolishGrade(int polishGrade) {
        this.polishGrade = polishGrade;
    }

    public void setPeGrade(int peGrade) {
        this.peGrade = peGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public int getMathGrade() {
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", physicsGrade=" + physicsGrade +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", polishGrade=" + polishGrade +
                ", peGrade=" + peGrade +
                '}';
    }
}
