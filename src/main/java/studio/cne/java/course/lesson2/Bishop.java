package studio.cne.java.course.lesson2;

import java.util.Scanner;

public class Bishop extends ChessPiece {


    Scanner reader = new Scanner(System.in);

    public Bishop( String color) {
        this.xPosition = 0;
        this.yPosition = 0;
        this.color = color;
        this.alive = true;
    }
    public void move(int increasePosition){
        this.xPosition+=increasePosition;
        this.yPosition+=increasePosition;
    }

    @Override
    public void move() {
        System.out.println("Bishop is moving forward");
        System.out.println("Enter incrementation of the position");
        int increasePosition = reader.nextInt();

        move(increasePosition);
    }

}
