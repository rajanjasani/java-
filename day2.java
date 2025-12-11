
import java.util.*;
class index{
  public static void main(String arg[]){

    Scanner sc = new Scanner(System.in);

    System.out.print(" Enter numbers n1: ");
    int n1 = sc.nextInt();
    
    System.out.print(" Enter numbers n2: ");
    int n2 = sc.nextInt();
    int sum = n1 + n2;
    System.out.println(" Sum: "+sum);
  }
}

// used for input floating number
import java.util.*;
class index{
  public static void main(String arg[]){

    Scanner sc = new Scanner(System.in);

    System.out.print(" Enter numbers n1: ");
    float n1 = sc.nextFloat();

    System.out.print(" Enter numbers n2: ");
    float n2 = sc.nextFloat();
    float sum = n1 + n2;
    System.out.println(" Sum: "+sum);
    
  }
}


Method	Description
next() Reads a single name from the user
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user

Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte
