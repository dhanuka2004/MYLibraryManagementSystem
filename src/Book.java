public class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private boolean isAvailable;

    public Book(int bookId, String title, String author, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isAvailable = true; // default: available
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author +
                ", Category: " + category + ", Available: " + isAvailable;
    }
}
