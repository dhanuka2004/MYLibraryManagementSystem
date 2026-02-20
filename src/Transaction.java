import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private int bookId;
    private int userId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(int transactionId, int bookId, int userId, LocalDate issueDate) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.userId = userId;
        this.issueDate = issueDate;
        this.returnDate = null; // not returned yet
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId +
                ", Book ID: " + bookId +
                ", User ID: " + userId +
                ", Issued: " + issueDate +
                ", Returned: " + (returnDate == null ? "Not yet" : returnDate);
    }
}
