import java.util.Random;
import java.util.Scanner;

public class rock {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] ComputerOption = { "rock", "paper", "scissor" };
    Random r = new Random();
    String move = ComputerOption[r.nextInt(ComputerOption.length)];
    System.out.println(
      "1.Rock\n2.Paper\n3.Scissor\nEnter the Option in words: "
    );
    String ans = scan.nextLine().toLowerCase();
    if (move.equals(ans)) {
        System.out.println("Computer option is: " + move);
      System.out.println("tie");
    } else {
        switch (ans) {
        /* -----------Rock------- */
        case "rock":
          System.out.println("Computer option is: " + move);
          System.out.println(
            move.equals("scissor")
              ? "You won, rock can beat scissor"
              : "Computer won, Paper can catch Scissor"
          );
          break;
        /* -----------Paper------- */
        case "paper":
          System.out.println("Computer option is: " + move);
          System.out.println(
            move.equals("rock")
              ? "You won, paper can catch rock"
              : "Computer won, scissor can cut paper"
          );
          break;
        /* -----------Scissor------- */
        case "scissor":
          System.out.println("Computer option is: " + move);
          System.out.println(
            move.equals("paper")
              ? "You won, scissor can cut paper"
              : "Computer won, rock can beat Scissor"
          );
          break;
      }
    }
    scan.close();
  }
}
