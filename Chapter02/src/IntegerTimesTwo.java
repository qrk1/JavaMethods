import java.util.Scanner;

public class IntegerTimesTwo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int n = keyboard.nextInt();
    System.out.println("2 * " + n + " = " + (n + n));
  }
}
