import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
  static ArrayList<Integer> playerlist = new ArrayList<>();
    static ArrayList<Integer> cpulist = new ArrayList<>();
    static boolean run = true;
  public static void main(String[] args) {
    char[][] gameboard = {
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
    };
    Scanner scan = new Scanner(System.in);
    while (run) {
      System.out.println("Enter the position between 1-9");
      int pos = scan.nextInt();
      while (playerlist.contains(pos)|| cpulist.contains(pos)) {
        System.out.println("Position taken , Enter new Position:");
        pos = scan.nextInt();
      }
      placepiece(pos, gameboard, "player");
      String result = winner();
      if (result.length()>0) {
        System.out.println(result);
        break;
      }
      Random rand = new Random();
      int cpos = rand.nextInt(9) + 1;
      while (playerlist.contains(cpos) || cpulist.contains(cpos)) {
        cpos = rand.nextInt(9) + 1;
      }
      placepiece(cpos, gameboard, "cpu");
      viewboard(gameboard);
        result = winner();
      if (result.length()>0) {
        System.out.println(result);
        break;
      }
      
    }
  }

  private static String winner() {
    List<Integer> toprow = Arrays.asList(1, 2, 3);
    List<Integer> middlerow = Arrays.asList(4,5,6);
    List<Integer> bottomrow = Arrays.asList(7,8,9);
    List<Integer> topcol = Arrays.asList(1, 4,7);
    List<Integer> midcol = Arrays.asList(2,5,8);
    List<Integer> lastcol = Arrays.asList(3,6,9);
    List<Integer> c1 = Arrays.asList(1, 5,9);
    List<Integer> c2 = Arrays.asList(3, 5, 7);
    List<List> winningdcondition = new ArrayList<List>();
    winningdcondition.add(toprow);
    winningdcondition.add(middlerow);
    winningdcondition.add(bottomrow);
    winningdcondition.add(topcol);
    winningdcondition.add(midcol);
    winningdcondition.add(lastcol);
    winningdcondition.add(c1);
    winningdcondition.add(c2);
    for (List list : winningdcondition) {
      if (playerlist.containsAll(list)) {
        return "Congratulation You won....!";
      } else if (cpulist.containsAll(list)) {
        return "You lose...!";
      } else if (playerlist.size() + cpulist.size() == 9) {
        return "Tie...!";
      }
    }
    return "";
  }

  private static void placepiece(int pos, char[][] gameboard, String user) {
    char symbol = 'X';
    if (user.equals("player")) {
      symbol = 'X';
      playerlist.add(pos);
    } else if (user.equals("cpu")) {
      cpulist.add(pos);
      symbol = 'O';
    }
    switch (pos) {
      case 1:
        gameboard[0][0] = symbol;
        break;
      case 2:
        gameboard[0][2] = symbol;
        break;
      case 3:
        gameboard[0][4] = symbol;
        break;
      case 4:
        gameboard[2][0] = symbol;
        break;
      case 5:
        gameboard[2][2] = symbol;
        break;
      case 6:
        gameboard[2][4] = symbol;
        break;
      case 7:
        gameboard[4][0] = symbol;
        break;
      case 8:
        gameboard[4][2] = symbol;
        break;
      case 9:
        gameboard[4][4] = symbol;
        break;
      default:
        break;
    }
  }

  private static void viewboard(char[][] gameboard) {
    for (char[] cs : gameboard) {
      for (char s : cs) {
        System.out.print(s);
      }
      System.out.println();
    }
  }
}
