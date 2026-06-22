import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Random random = new Random ();
      Scanner sc = new Scanner(System.in);
      int RandomNum , NumGuess;
      do
      {
          RandomNum = random.nextInt(100) + 1 ;
          System.out.print("Please , guess number from 1 to 100: ");
           NumGuess = sc.nextInt();
          if( RandomNum < NumGuess )
          {
                System.out.println("The guess number is too high");
                System.out.println("Don't give up! You can guess correct.\n");
          }
         else if( RandomNum > NumGuess )
            {
                System.out.println("The guess number is too low");
                System.out.println("Don't give up! You can guess correct.\n");
                
            }
      }
      while( RandomNum != NumGuess);
      System.out.println("You guess number correct");
       System.out.println("You win");
    }
}