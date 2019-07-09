package studio.cne.java.course.JJDev.common;

import studio.cne.java.course.JJDev.homeTasks.homeTask1.*;
import studio.cne.java.course.JJDev.homeTasks.homeTask2.Book;
import studio.cne.java.course.JJDev.homeTasks.homeTask2.Library;

public class CommonMethods {

   public static double calculateVAT(double income) {

       return income - income * CommonConstants.PL_VAT;

   }

    public static double calculateZUS (double income, double yearsPassed){
       if (yearsPassed<= CommonConstants.threshold1)
           return income - 320;
       else if (yearsPassed<= CommonConstants.threshold2 && yearsPassed> CommonConstants.threshold1)
           return income - 550;
       else
           return income - 1300;


    }
    public static double calculateTAX (double income){
       if (income<200000)
           return income - 0.18*income;
       else
           return income - 0.32*income;
    }

    public static double calculateCosts (double income, double costs){

       return income - costs;
    }

    public static double gradeMeanCounter (int physicsGrade, int mathGrade, int englishGrade, int polishGrade, int peGrade){
       return (physicsGrade + mathGrade + englishGrade + polishGrade + peGrade)/5;
    }

    public static void printStudentsResults(Student student1) {
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " got physics grade: " + student1.getPhysicsGrade());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " got math grade: " + student1.getMathGrade());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " got english grade: " + student1.getEnglishGrade());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " got polish grade: " + student1.getPolishGrade());
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " got pe grade: " + student1.getPeGrade());
    }

    public static void createLibraryData(Library library) {

        Book book0 = new Book ("Zbrodnia i kara", "F.Dostojewski",2018, "Czesław Jastrzębiec-Kozłowski", false);
        Book book1 = new Book ("Tajemna historia", "D.Tartt",2015, "Jerzy Kozłowski", false );
        Book book2 = new Book("Kafka nad morzem", "H.Murakami", 2007,"Anna Zielińska-Elliott", true);
        Book book3 = new Book("Małe życie", "Hanya Yanagihara",2016,"Jolanta Kozak", false);
        Book book4= new Book ("Bezdomny ptak","Gloria Whelan",2008,"unknown",true);

        //      List<Book> books = new ArrayList<Book>();

        library.receive(book0);
        library.receive(book1);
        library.receive(book2);
        library.receive(book3);
        library.receive(book4);


    }
    public static boolean checkBookPresence (Library library, String title) {

        for (int i = 0; i < library.getBooks().size(); i++) {

            if (title.equals(library.getBooks().get(i).getTitle())) {
                if (library.getBooks().get(i).isRented() == true) {
                    return false;
                } else {
                    library.getBooks().get(i).setRented(true);
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public static void printArray(int[] array){
        for (int x: array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] prefixSums(int[] array){
       int [] prefixSumsArray = new int[array.length+1];
       prefixSumsArray[0]=0;

       for (int i = 0; i<array.length; i++){
           prefixSumsArray[i+1]=prefixSumsArray[i]+array[i];
        }

       return prefixSumsArray;
    }

    public static int[] suffixSums(int[] array){
        int [] suffixSumsArray = new int[array.length+1];
        suffixSumsArray[suffixSumsArray.length-1]=0;

        for (int i = suffixSumsArray.length-1; i>0; i--){
            suffixSumsArray[i-1]=suffixSumsArray[i]+array[i-1];
        }

        return suffixSumsArray;
    }


}
