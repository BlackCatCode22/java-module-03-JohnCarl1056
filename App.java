import p1.BackPack;
import p1.Student;
import p1.TextBook;

// App.java
// jg 09/11/25
public class App {
    public static void main(String[] args) {

        //Creat and a give assignments to all the Strings from p1.Student.java class

        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpern";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 18;
        myStudent.onProbation = true;

        //Test code using the firstname resulting in Jim

        System.out.println(myStudent.firstName);

        Student myStudent2 = new Student();
        myStudent2.firstName = "John";
        myStudent2.lastName = "Gonzalez";
        myStudent2.major = "Business";
        myStudent2.gpa = 4.0;
        myStudent2.age = 20;
        myStudent2.onProbation = false;

        System.out.println(myStudent2.firstName);

        TextBook myTextBook = new TextBook();
        myTextBook.bookName = "Book of life";
        myTextBook.Author = "John";
        myTextBook.Genre = "Fiction";
        myTextBook.pageNumbers = 1010;

        System.out.println(myTextBook.bookName);

        BackPack myBackPack = new BackPack();
        myBackPack.brand = "Jordan";
        myBackPack.color = "Black";
        myBackPack.size = "Large";
        myBackPack.zippers = 5;

        System.out.println(myBackPack.brand);
    }
}