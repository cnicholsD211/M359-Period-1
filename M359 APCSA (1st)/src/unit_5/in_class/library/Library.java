package unit_5.in_class.library;

public class Library {
    public static void main(String[] args) {
        // call static method
        Book.bookSummary();

        // create Book objects
        Book harryPotter1 = new Book("Harry Potter 1", "J.K. Rowling", "Fantasy", "Penguin", 275, 1997);
        Book lordOfTheRings1 = new Book("LOTR1", "J.R.R. Tolkin", "Fantasy", "Allen", 304, 1954);

        // printouts
        System.out.println(harryPotter1);
        System.out.println(lordOfTheRings1);
        Book.bookSummary();
    }
}
