
public class GenericMethodTest {
   // generic method printArray
   public  static < f > void printArray( f[] inputArray ) {
      // Display array elements
      for(f element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println("Array integerArray contains:");
      printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray characterArray contains:");
      printArray(charArray);   // pass a Character array
      
      // alternate type
      System.out.print("Interger array:");
      for(int i:intArray){
    	  System.out.print(i);
      }
      System.out.println();
      System.out.print("double array:");
      for(double j:doubleArray){
    	  System.out.print(j + " ");
      }
   }
}