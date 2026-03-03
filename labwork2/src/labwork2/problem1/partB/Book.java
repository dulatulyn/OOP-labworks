package labwork2.problem1.partB;

public class Book extends LibraryItem{
    private double rating;

    public Book(String title, String author, int publicationYear, double rating) {
        super(title, author, publicationYear);
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + " Rating: " + rating;
    }
}
