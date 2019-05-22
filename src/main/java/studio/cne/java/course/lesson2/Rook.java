package studio.cne.java.course.lesson2;

import java.util.Scanner;

public class Rook extends ChessPiece {

    Scanner reader = new Scanner(System.in);

    public Rook( String color) {
        this.xPosition = 0;
        this.yPosition = 0;
        this.color = color;
        this.alive = true;
    }


    public void move(int x, int y) {
        if (y == 0)
            this.xPosition += x;
        else if (x == 0)
            this.yPosition += y;
        else {
            throw new IllegalStateException("Programista nie umie w szachy LOL!!!");
        }

    }
    @Override
    public void move() {
        System.out.println("Rook is moving forward");
        System.out.println("Enter xMove position");
        int x = reader.nextInt();
        System.out.println("Enter yMove position");
        int y = reader.nextInt();

        move(x,y);
    }

}
