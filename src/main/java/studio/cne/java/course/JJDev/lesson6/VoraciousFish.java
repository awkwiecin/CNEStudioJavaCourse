package studio.cne.java.course.JJDev.lesson6;

import java.util.Stack;

public class VoraciousFish {

    public static void test() {

        int[] directionArray = {1,0,1,0,0,1,0};
        int[] sizeArray = {5,3,7,4,2,6,1};

        System.out.println("Survivos quantity: " + voraciousFishSolution(sizeArray,directionArray));

    }

    private static int voraciousFishSolution(int[] sizeArray, int[] directionArray){

        Stack<Integer> stack = new Stack<Integer>();
        int survivorCounter = 0;



        return stack.size()+survivorCounter;
    }
}
