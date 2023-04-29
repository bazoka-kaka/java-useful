class Main {
  public static void main(String[] args) {
    String[] cars = {"Mitsubishi", "Honda", "Toyota", "Daihatsu"};
    // foreach
    for(String i: cars) {
      System.out.println(i);
    }
    // getting array length
    System.out.println(cars.length);

    // multidimensional array
    int [][]matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    for(int []i: matrix) {
      for(int j: i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
