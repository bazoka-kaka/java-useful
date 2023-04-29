class Main {
  public static void main(String[] args) {
    /**
     * 2 Types of Type Casting:
     * 1. Widening Casting (automatically) - converting a smaller type to a larger type size
     * byte -> short -> char -> int -> long -> float -> double
     * 2. Narrowing Casting (manually) - converting a larger type to a smaller size type
     * double -> float -> long -> int -> char -> short -> byte
     */

     // Widening Casting
     int x = 9;
     double y = x;

     // Narrowing Casting
     double z = 9.32d;
     int a = (int)z;

     System.out.printf("%.2f %d", y, a);
  }
}
