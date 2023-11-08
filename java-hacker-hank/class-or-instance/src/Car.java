public class Car {
  int maxSpeed = 100;
  int minSpeed = 0;

  double weight = 4079;

  boolean isTheCarOn = false;
  char condition = 'A';
  String nameOfCar = "João";

  double maxFuel = 16;
  double currentFuel = 8;
  double mpg = 26.4;
  
  public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn, char condition, String nameOfCar,
      double maxFuel, double currentFuel, double mpg) {
    this.maxSpeed = maxSpeed;
    this.minSpeed = minSpeed;
    this.weight = weight;
    this.isTheCarOn = isTheCarOn;
    this.condition = condition;
    this.nameOfCar = nameOfCar;
    this.maxFuel = maxFuel;
    this.currentFuel = currentFuel;
    this.mpg = mpg;
  }
  public int getMaxSpeed() {
    return maxSpeed;
  }
  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
  public int getMinSpeed() {
    return minSpeed;
  }
  public void setMinSpeed(int minSpeed) {
    this.minSpeed = minSpeed;
  }
  public double getWeight() {
    return weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public boolean isTheCarOn() {
    return isTheCarOn;
  }
  public void setTheCarOn(boolean isTheCarOn) {
    this.isTheCarOn = isTheCarOn;
  }
  public char getCondition() {
    return condition;
  }
  public void setCondition(char condition) {
    this.condition = condition;
  }
  public String getNameOfCar() {
    return nameOfCar;
  }
  public void setNameOfCar(String nameOfCar) {
    this.nameOfCar = nameOfCar;
  }
  public double getMaxFuel() {
    return maxFuel;
  }
  public void setMaxFuel(double maxFuel) {
    this.maxFuel = maxFuel;
  }
  public double getCurrentFuel() {
    return currentFuel;
  }
  public void setCurrentFuel(double currentFuel) {
    this.currentFuel = currentFuel;
  }
  public double getMpg() {
    return mpg;
  }
  public void setMpg(double mpg) {
    this.mpg = mpg;
  }

  
}
