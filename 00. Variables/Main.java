class Main {
  public static void main(String[] args) {
    /**
     * Data types in java:
     * - String
     * - int
     * - float
     * - char
     * - boolean
     * 
     * To make variables unmutable add "final" keyword
     * 
     * 
     */
    String name = "bazoka-kaka";
    int n = 2;
    float height = 102.1f;
    double weight = 52.3;
    char initial = 'b';
    final int unchangeable = 21;
    System.out.printf("%s %d %f %f %c %d", name, n, height, weight, initial, unchangeable);

    // multiple variables in one line
    int x, y, z;
    x = y = z = 20;
    System.out.printf("%d %d %d", x, y, z);
  }
}