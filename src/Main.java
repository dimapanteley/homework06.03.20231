import pro.sky.java.course1.lesson2.Author;
import pro.sky.java.course1.lesson2.Book;
import pro.sky.java.course1.lesson2.ProgramStart;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author ("FedorDostoevsky", 30);
        Book book1 = new Book ("PrestuplenieNakazanie",author1,1820);
        Author author2 = new Author ("MikhailBulgakov", 54);
        Book book2 = new Book ("MasterAndMargarita",author2,1578);
        book1.setAge(1866);
        System.out.println();
        new ProgramStart(book1, author1);
        System.out.println();
        book2.setAge(1967);
        System.out.println();
        new ProgramStart (book2, author2);
        System.out.println(author1.equals(author2));
    }
}