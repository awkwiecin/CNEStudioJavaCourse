package studio.cne.java.course.lesson2;

public class Pawn extends ChessPiece {

    public Pawn( String color) {
        this.xPosition = 0;
        this.yPosition = 1;
        this.color = color;
        this.alive = true;
    }

    @Override
    public void move() {
        System.out.println("Pawn is moving forward");
        this.yPosition++;
    }

}
