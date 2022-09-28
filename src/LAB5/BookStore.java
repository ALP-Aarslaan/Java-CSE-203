package LAB5;
import java.util.Scanner;

public class BookStore {
    int index=0;
    Scanner scan =new Scanner(System.in);
    Book[] books=new Book[10];
    void sell(String BookTittle,int numOfCopies){

        for(int i=0;i<books.length;i++) {
            if (books[i] != null && books[i].BookTitle.equals(BookTittle) && books[i].numOfCopies >= numOfCopies) {
                books[i].numOfCopies -= numOfCopies;
                break;
            }
            else if(books[i]!=null && books[i].BookTitle.equals(BookTittle)&&books[i].numOfCopies<numOfCopies)
                System.out.println("OUt of stock");
            else if (books[i]!=null){
                System.out.println("No such book");
                break;
            }
    }
        }
    void order(String ISBN,int noOfCopies){
        boolean found=false;
        for(int i=0;i<books.length;i++) {
            if (books[i]!=null && books[i].BookISBN.equals(ISBN)) {
                books[i].numOfCopies = books[i].numOfCopies + noOfCopies;
                found=true;
                index=i;
                break;
            }
        }
        if(found==false){
            System.out.println("enter book name :");
            String bookName=scan.nextLine();
            System.out.println("enter writer name :");
            String writerName=scan.nextLine();
            books[index]=new Book(bookName,writerName,ISBN,noOfCopies);
        }
    }
    void display(){
        for(int i=0;i<books.length;i++) {
            if(books[i]==null) {
                break;
            }
            if(books[i]!=null&&books[i].numOfCopies>0)
                books[i].display();
            if(books[i]!=null && books[i].numOfCopies<=0)
                System.out.println("out of stock");
        }
    }
}
