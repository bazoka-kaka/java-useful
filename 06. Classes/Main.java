/**
 * if you don't want another class to inherit from your class, use "final" before class declaration
 * e.g:
 * final class Vehicle {...}
 */

class Main {
  public static void main(String[] args) {
    JDM supra = new JDM(1990, "Toyota Supra MK4", "Toyota");
    System.out.println(supra);
    supra.start();
  }
}
