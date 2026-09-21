class LibraryBookCounter {
    String title;
    String author;
    double price;

    // Static variable
    static int bookCount = 0;

    // Constructor
    LibraryBookCounter(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    // Static method
    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }

    public static void main(String[] args) {
        LibraryBookCounter b1 =
            new LibraryBookCounter("Java Programming", "James Gosling", 500);

        LibraryBookCounter b2 =
            new LibraryBookCounter("Python Basics", "Guido van Rossum", 450);

        LibraryBookCounter b3 =
            new LibraryBookCounter("C Programming", "Dennis Ritchie", 400);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();

        // Calling static method
        LibraryBookCounter.displayBookCount();
    }
}
