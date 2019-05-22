package studio.cne.java.course.lesson2;

public class SecondLessonTest {

    public void test() {

        System.out.println("-- LESSON 2 TEST BEGIN --");
        ChessPiece pawn1 = new Pawn("black");
        ChessPiece rook1 = new Rook("white");

        pawn1.move();
        rook1.move();

        ChessPiece bishop1 = new Bishop ("white");

        bishop1.move();

        ChessPiece queen1 = new Queen ("black");
        queen1.move();

        System.out.println("-- LESSON 2 TEST END --");
    }
}
