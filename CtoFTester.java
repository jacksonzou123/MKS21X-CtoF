public class CtoFTester{
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(100) + " degrees fahrenheit");
    System.out.println(fahrenheitToCelsius(212) + " degrees celsius");
  }
  public static double celsiusToFahrenheit(double c) {
    return c * (9.0/5) + 32;
  }
  public static double fahrenheitToCelsius(double f) {
    return (f - 32.0) * 5/9;
  }
}
