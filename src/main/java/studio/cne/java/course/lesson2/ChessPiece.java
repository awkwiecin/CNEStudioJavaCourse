package studio.cne.java.course.lesson2;

public abstract class ChessPiece {
    protected int xPosition;
    protected int yPosition;
    protected String color;
    protected boolean alive;

    protected ChessPiece() {
    }

    protected void move (){
        System.out.println("Moving forward!");
    }
}
