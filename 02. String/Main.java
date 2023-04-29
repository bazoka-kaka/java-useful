class Main {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // output the string length
    int txtLen = txt.length();
    System.out.println(txtLen);

    // uppercase and lowercase
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());

    // finding first index of 
    System.out.println(txt.indexOf("HIJ"));

    // concat string
    String firstname = "bazoka";
    String lastname = "kaka";
    String fullname = firstname.concat(lastname);
    System.out.println(fullname);
  }
}
