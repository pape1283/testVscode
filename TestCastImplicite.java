public class TestCastImplicite {
    public static void main(String[] args) {
        byte a = 10;
int b = 5; // Implicit casting from int to double
      if ((a+a) instanceof Integer){
          System.out.println("int");}
      // Output: Integer
    }
}