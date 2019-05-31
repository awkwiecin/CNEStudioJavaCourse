package studio.cne.java.course.JJDev.lesson2;

import java.util.Scanner;

public class Queen extends ChessPiece {

    public Queen( String color) {
        this.xPosition = 3;
        this.yPosition = 0;
        this.color = color;
        this.alive = true;
    }

    Scanner reader = new Scanner(System.in);

    public void move(int x, int y) {
        if (y == 0)
            this.xPosition += x;
        else if (x == 0)
            this.yPosition += y;
        else {
            throw new IllegalStateException("Programista nie umie w szachy LOL!!!");
        }
    }

    public void move(int increasePosition){
        this.xPosition+=increasePosition;
        this.yPosition+=increasePosition;
    }

    @Override
    public void move() {
        System.out.println("Queen is moving forward");
        System.out.println("Is queen moving diagonal?");
        boolean diagonalMove = reader.nextBoolean();
        System.out.println("Enter xMove position");
        int xMove = reader.nextInt();

        if (diagonalMove == true)
            move(xMove);
        else{
            System.out.println("Enter y position");
            int yMove = reader.nextInt();
            move(xMove,yMove);
        }

    }

}
