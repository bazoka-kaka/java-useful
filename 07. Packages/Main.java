/**
 * Built-in Packages
 * =================
 * Importing whole package:
 * import package.name.*;
 * 
 * Importing single class from a package:
 * import package.name.Class;
 * 
 * User-defined Packages
 * =====================
 * Java uses a file system directory to store them
 * e.g: 
 * └── root
 *    └── mypack
 *        └── MyPackageClass.java
 */
import java.util.Scanner;
import mypack.MyPackageClass;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username: ");

    String username = scanner.nextLine();
    System.out.println("Welcome, " + username);

    // using the custom made package class
    MyPackageClass.printSomething();

    /**
     * scanner must always be closed to avoid memory leak
     */
    scanner.close();
  }
}