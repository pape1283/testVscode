public class TestCastImplicite {
    public static void main(String[] args) {
        byte a = 10;
        double b = a; // Implicit casting from int to double
      if ((a+5) instanceof Integer){
          System.out.println("int");}
      // Output: Integer
    }
}