package studio.cne.java.course.JJDev.lesson5;

import studio.cne.java.course.JJDev.commonConstantsAndMethods.CommonMethods;

public class CyclicRotation {
    public static void test (){

        int[] array = {3,2,4,8,5,1,4,5};
        int K=2;
        CommonMethods.printArray(array);

        int[] array2 = cyclicRotation(array,K);
        CommonMethods.printArray(array2);
    }

    private static int[] cyclicRotation(int[] array, int k) {

        int[] rotatedArray = new int[array.length];

        for (int i=0; i<array.length; i++){

            int index2 = (i+k)%array.length;
            rotatedArray [index2] = array [i];
        }

        return rotatedArray;
    }

}
