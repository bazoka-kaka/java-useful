/**
 * The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
 */

class OuterClass {
  int x = 1;
  class InnerClass {
    int y = 5;
  }
  static class StaticInnerClass {
    int z = 10;
  }
}

class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    OuterClass.StaticInnerClass myStaticInner = new OuterClass.StaticInnerClass();
    System.out.println(myOuter.x + myInner.y + myStaticInner.z);
  }
}       