public class Book {
  String title;
  int pageCOunt;
  int ISBN;
  boolean isChecketOut;
  int dayCheckout = -1;

  public Book(String title, int pageCOunt, int iSBN) {
    this.title = title;
    this.pageCOunt = pageCOunt;
    this.ISBN = iSBN;
    isChecketOut = false;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPageCOunt() {
    return pageCOunt;
  }

  public void setPageCOunt(int pageCOunt) {
    this.pageCOunt = pageCOunt;
  }

  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int iSBN) {
    ISBN = iSBN;
  }

  public boolean getisChecketOut() {
    return this.isChecketOut;
  }

  public void setChecketOut(boolean isChecketOut, int currentDayCheckOut) {
    this.isChecketOut = isChecketOut;
    setDayCheckout(currentDayCheckOut);
  }

  public int getDayCheckout() {
    return dayCheckout;
  }

  public void setDayCheckout(int dayCheckout) {
    this.dayCheckout = dayCheckout;
  }

}
