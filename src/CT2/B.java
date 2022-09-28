package CT2;
class testClass {
    public static void main(String[] args) {
        Book b = new Book("Java the Complete Reference","Herbert Schildt",
        300.5);
        b.display();
        updateBook(b);
        b.display();
    }
    public static void updateBook(Book b) {
        Book c = b;
        c.author ="Kathy Sierra & Bert Bates";
        b.setPrice(100);
        b = null;
    }
}
class Book {
    String title, author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void increasePrice(double price) {
        this.price += price;
    }

    public void display() {
        System.out.printf("%s - %s - %.1f\n ",title, author, price);
    }
}
