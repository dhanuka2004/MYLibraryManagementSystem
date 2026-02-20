import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();
    private int transactionCounter = 1;

    public void addBook(Book b) { books.add(b); }
    public void registerUser(User u) { users.add(u); }

    public Book searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book != null && user != null && book.isAvailable()) {
            book.setAvailability(false);
            Transaction t = new Transaction(transactionCounter++, bookId, userId, java.time.LocalDate.now());
            transactions.add(t);
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Issue failed. Book may not be available.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBook(bookId);
        if (book != null) {
            book.setAvailability(true);
            for (Transaction t : transactions) {
                if (t.toString().contains("Book ID: " + bookId) && t.toString().contains("User ID: " + userId)) {
                    t.setReturnDate(java.time.LocalDate.now());
                    System.out.println("Book returned successfully!");
                    return;
                }
            }
        }
        System.out.println("Return failed. Transaction not found.");
    }

    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) return b;
        }
        return null;
    }

    private User findUser(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) return u;
        }
        return null;
    }
}
