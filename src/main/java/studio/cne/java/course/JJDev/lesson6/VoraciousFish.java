package studio.cne.java.course.JJDev.lesson6;

import java.util.Stack;

public class VoraciousFish {

    public static void test() {

        int[] directionArray = {1, 0, 1, 0, 0, 1, 0};
        int[] sizeArray = {5, 3, 7, 4, 2, 6, 1};

        System.out.println("Survivos quantity: " + voraciousFishSolution(sizeArray, directionArray));

    }

    private static int voraciousFishSolution(int[] sizeArray, int[] directionArray) {

        Stack<Integer> stack = new Stack<Integer>();
        int survivorCounter = 0;
        int leftWeight = 0;
        int rightWeight = 0;

        for (int i = 0; i < directionArray.length; i++) {

            leftWeight = sizeArray[i];
            if (directionArray[i] == 1) {
                stack.push(leftWeight);
            } else {
                rightWeight = stack.isEmpty() ? -1 : stack.pop();
                while (rightWeight != -1 && leftWeight > rightWeight) {
                    rightWeight = stack.isEmpty() ? -1 : stack.pop();
                }

                if (rightWeight == -1)
                    survivorCounter++;
                else
                    stack.push(rightWeight);
            }

        }
        System.out.println(survivorCounter);
        System.out.println(stack.size());
        return stack.size() + survivorCounter;

    }
}
