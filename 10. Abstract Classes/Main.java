/**
 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces
 */

abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzzz...");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("Meow...");
  }
}

class Main {
  public static void main(String[] args) {
    Animal cat = new Cat();
    cat.animalSound();
    cat.sleep();
  }
}