package LAB5;

public class Book {
    String BookTitle;
    String BookAuthor;
    String BookISBN;
    int numOfCopies;
    Book(String BookTittle,String BookAuthor,String BookISBN,int numOfCopies){
        this.BookTitle=BookTittle;
        this.BookAuthor=BookAuthor;
        this.BookISBN=BookISBN;
        this.numOfCopies=numOfCopies;
    }
    void display() {
            System.out.println("Book Name : " + BookTitle);
            System.out.println("Book Writer : " + BookAuthor);
            System.out.println("Book code : " + BookISBN);
            System.out.println("amount  of  " + BookTitle + " book is : " + numOfCopies);
    }
}
