import java.util.Scanner;

public class FavoriteColor
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);
    
    System.out.print("What is your favorite color?");
    String favoriteColor = kboard.nextLine();
    
    System.out.println("I think " + favoriteColor + " is a terrible color! ");
    System.out.println("Just kidding! I like " + favoriteColor + " too.");
    
    kboard.close();
  }
}
