import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {
  Map<String, Book> bookCollection = new HashMap<String, Book>();
  int currentDay = 0;
  int lengthCheckoutPeriod = 7;
  double initialLateFee = 0.50;
  double feepPerLateDay = 1.00;

  public LibraryCatalog(Map<String, Book> collection) {
    this.bookCollection = collection;
  }

  public LibraryCatalog(Map<String, Book> collection, int lengthCheckoutPeriod, double initialLateFee,
      double feepPerLateDay) {
    this.bookCollection = collection;
    this.lengthCheckoutPeriod = lengthCheckoutPeriod;
    this.initialLateFee = initialLateFee;
    this.feepPerLateDay = feepPerLateDay;
  }

  public Map<String, Book> getBookCollection() {
    return bookCollection;
  }

  public void setBookCollection(Map<String, Book> bookCollection) {
    this.bookCollection = bookCollection;
  }

  public int getCurrentDay() {
    return currentDay;
  }

  public void setCurrentDay(int currentDay) {
    this.currentDay = currentDay;
  }

  public int getLengthCheckoutPeriod() {
    return lengthCheckoutPeriod;
  }

  public void setLengthCheckoutPeriod(int lengthCheckoutPeriod) {
    this.lengthCheckoutPeriod = lengthCheckoutPeriod;
  }

  public double getInitialLateFee() {
    return initialLateFee;
  }

  public void setInitialLateFee(double initialLateFee) {
    this.initialLateFee = initialLateFee;
  }

  public double getFeepPerLateDay() {
    return feepPerLateDay;
  }

  public void setFeepPerLateDay(double feepPerLateDay) {
    this.feepPerLateDay = feepPerLateDay;
  }

  public Book getBook(String bookTitle) {
    return getBookCollection().get(bookTitle);
  }

  public void nextDay() {
    this.currentDay++;
  }

  public void setDay(int day) {
    this.currentDay = day;
  }

  public void checkOutBook(String title) {
    Book book = getBook(title);
    if (book.getisChecketOut()) {
      sorryBookAlreadyCheckedOut(book);
    } else {
      book.setChecketOut(true, currentDay);
      System.out.println("You just checked out" + title + ". It is due on day" +
          (getCurrentDay() + getLengthCheckoutPeriod()) + ".");
    }
  }

  public void returnBook(String title) {
    Book book = getBook(title);
    int daysLate = currentDay - (book.getDayCheckout() + getLengthCheckoutPeriod());
    if (daysLate > 0) {
      System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate + getFeepPerLateDay())
          + "because your book is " + daysLate + " days overdue.");
    } else {
      System.out.println("Book Returned. Thank you!");
    }

  }

  public void sorryBookAlreadyCheckedOut(Book book) {
    System.out.println("Sorry, " + book.getTitle() + " is already checked out. " +
        "It shoud be back on day " + (book.getDayCheckout() + getLengthCheckoutPeriod()) + " . ");
  }

  public static void main(String[] args) {
    Map<String, Book> bookCollection = new HashMap<String, Book>();
    Book harry = new Book("Harry Potter", 827132, 99999);
    bookCollection.put("Harry Potter", harry);
    LibraryCatalog lib = new LibraryCatalog(bookCollection);
    lib.checkOutBook("Harry Potter");
    lib.nextDay();
    lib.nextDay();
    lib.checkOutBook("Harry Potter");
    lib.setDay(17);
    lib.checkOutBook("Harry Potter");
  
  }
}
