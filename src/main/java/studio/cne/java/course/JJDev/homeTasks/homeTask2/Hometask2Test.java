package studio.cne.java.course.JJDev.homeTasks.homeTask2;

//import java.util.ArrayList;
//import java.util.List;

import studio.cne.java.course.JJDev.commonConstantsAndMethods.CommonMethods;

public class Hometask2Test {

    public static void test() {

        System.out.println("--HomeTask 2 TEST BEGIN --");

        Library library = new Library("Słoneczne kartki");
        CommonMethods.createLibraryData(library);

       // library.printLibraryStock();

        library.rentWithFunction("Małe życie");
        library.receive("Tajemna historia");
        library.receive("Małe życie");



        System.out.println("--HomeTask 2 TEST END --");

    }

}
