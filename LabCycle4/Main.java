/*import java.util.Scanner;

class Book{
    private int bookId;
    private String title;
    private String author;

    public void setBook(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Book Id: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        title = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
}

class BookUtility{
    public static void displayBook(Book b){
        System.out.println("----------------");
        System.out.println("Book Details");
        System.out.println("----------------");
        System.out.println("Book Id: " +b.getBookId());
        System.out.println("Title: " +b.getTitle());
        System.out.println("Author: " +b.getAuthor());
    }
}

public class Main{
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("Enter the details of Book 1");
        book1.setBook();

        System.out.println("Enter the details of Book 2");
        book2.setBook();

        BookUtility.displayBook(book1);
        BookUtility.displayBook(book2);
    }
}*/


import java.util.Scanner;

class Rectangle{
    private int length;
    private int width;

    public void setDimensions(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        length = sc.nextInt();

        System.out.print("Width: ");
        width = sc.nextInt();
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }
}

public class Main{
    public static void main(String[] args){
        Rectangle[] rect = new Rectangle[3];

        for (int i=0; i<3; i++){
            System.out.println("Rectangle " + (i + 1));
            rect[i] = new Rectangle();
            rect[i].setDimensions();
        }
        System.out.println("\n--- Output ---");

        // Loop to invoke calculations and display the results
        for (int i = 0; i < 3; i++) {
            System.out.println("Rectangle " + (i + 1));
            System.out.println("Area : " + rect[i].calculateArea());
            System.out.println("Perimeter : " + rect[i].calculatePerimeter());
        }
    }
}