//Using AutoBoxing

public class Q01_IntToIntObj {
  public static void main(String[] args) {
      int primitiveInt = 42;

      Integer integerObject = primitiveInt;

      System.out.println("Primitive int: " + primitiveInt);
      System.out.println("Integer object (autoboxed): " + integerObject);
  }
}


// Wihtout Autoboxing

// public class IntegerConversionWithoutAutoboxing {
//   public static void main(String[] args) {
//       int primitiveInt = 42;
//       Integer integerObject = Integer.valueOf(primitiveInt);
//       System.out.println("Primitive int: " + primitiveInt);
//       System.out.println("Integer object (without autoboxing): " + integerObject);
//   }
// }