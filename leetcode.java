import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode
 */
public class leetcode {

  public static void main(String[] args) {
    ArrayList<Integer> player = new ArrayList<>();
    player.add(1);
    player.add(2);
    player.add(3);
    List<Integer> toprow = Arrays.asList(1, 2, 3);
    List<Integer> middlerow = Arrays.asList(4, 5, 6);
    List<Integer> bottomrow = Arrays.asList(7, 8, 9);
    List<Integer> topcol = Arrays.asList(1, 4, 7);
    List<Integer> midcol = Arrays.asList(2, 5, 8);
    List<Integer> lastcol = Arrays.asList(3, 6, 9);
    List<Integer> c1 = Arrays.asList(1, 5, 9);
    List<Integer> c2 = Arrays.asList(3, 5, 7);
    List<List> winningdcondition = new ArrayList<List>();
    winningdcondition.add(middlerow);
    winningdcondition.add(toprow);
    winningdcondition.add(bottomrow);
    winningdcondition.add(topcol);
    winningdcondition.add(midcol);
    winningdcondition.add(lastcol);
    winningdcondition.add(c1);
    winningdcondition.add(c2);
    System.out.println(player);
    System.out.println(winningdcondition);
    for (List iterable_element : winningdcondition) {
        if (player.containsAll(iterable_element)) {
            System.out.println(true);
        }
    }
  }
}
