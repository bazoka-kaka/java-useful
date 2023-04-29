/**
 * An interface is a completely "abstract class" that is used to group related methods with empty bodies
 */

interface Animal {
  public void animalSound();
  public void run();
}

interface Mammal {
  public void milking();
}

class Pig implements Animal, Mammal {
  public void animalSound() {
    System.out.println("Mooo...");
  }

  public void run() {
    System.out.println("The pig is running");
  }

  public void milking() {
    System.out.println("The pig is milking");
  }
}

class Main {
  public static void main(String[] args) {
    Pig pig = new Pig();
    pig.run();
    pig.animalSound();
    pig.milking();
  }
}