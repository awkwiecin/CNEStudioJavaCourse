package studio.cne.java.course;


import studio.cne.java.course.JJDev.common.CommonMethods;

public class Main {

    public static void main(String[] args) {

        int[] array = {6,5,2,1,4,8,2};
        CommonMethods.printArray(array);
        CommonMethods.printArray(CommonMethods.prefixSums(array));
        CommonMethods.printArray(CommonMethods.suffixSums(array));
    }
}
