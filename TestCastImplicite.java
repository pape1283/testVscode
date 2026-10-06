public class TestCastImplicite {
    public static void main(String[] args) {
        byte a = 10;
        Integer b = 5; // Implicit casting from int to double
      if (b instanceof Integer){
          System.out.println("int");}
      // Output: Integer
    }
}