import java.util.Random;

public class Main {
  public static void main(String[] args) {



    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }



  public static String pluralize(String word, int n) {
    if (n == 0 || n < 1) {
      word = word + "s";
    }
    return word;
  }

  public static int flipNHeads(int n) {
    Random rand = new Random();
    int flips = 0;
    int headsInRow = 0;
    int lastResult = 0;
    while (n > headsInRow) {
      int result = rand.nextInt(2);

      if (result == 1) {
       
        System.out.println("Heads");
        flips++;
        if (lastResult == result){
          headsInRow++;
        }
        lastResult = result;
      } else if (result == 0){
        System.out.println("Tails");
        flips++;
        lastResult = result;
      }
    }
    System.out.println("It took" + flips + "flips to flip" + n + "heads in a row");
  }

  public static void clock() {

  }
}