class Book {
    String title;
    String author;
    boolean isAvailable = true;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void borrowBook() {
        if (isAvailable) {
            System.out.println("Yes, this book \"" + title + "\" by " + author + " is available.");
            isAvailable = false;
        } else {
            System.out.println("No, this book \"" + title + "\" by " + author + " is already borrowed.");
        }
    }
    void returnBook() {
        if (!isAvailable) {
            System.out.println("Now this book \"" + title + "\" has been returned and is available again.");
            isAvailable = true;
        } else {
            System.out.println("The book was not borrowed, so it cannot be returned.");
        }
    }
    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");

        b1.displayBookDetails();
        b1.borrowBook();
        b1.displayBookDetails();
        b1.returnBook();
        b1.displayBookDetails();
    }
}