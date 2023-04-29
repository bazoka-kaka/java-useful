class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Pig pig = new Pig();
    Cat cat = new Cat();
    System.out.println(animal.printSomething());
    System.out.println(pig.printSomething());
    System.out.println(cat.printSomething());
  }
}

class Animal {
  public String printSomething() {
    return "This is an animal";
  }
}

class Pig extends Animal {
  public String printSomething() {
    return "This is a damn pig";
  }
}

class Cat extends Animal {
  public String printSomething() {
    return "This is a freaking cat";
  }
}