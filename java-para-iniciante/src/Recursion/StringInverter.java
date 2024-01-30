package Recursion;

public class StringInverter {
  String x;

  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public static String inverter(String s){
      if(s.isEmpty()) return s;
      return inverter(s.substring(1)) + s.charAt(0);
  }
  
}
