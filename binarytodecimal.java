import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary value: ");
        String str = scan.nextLine();
        StringBuffer sbr = new StringBuffer(str);
        String s = String.valueOf(sbr.reverse());
        char[] a = s.toCharArray();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            int binary = Character.getNumericValue(a[i]);
            c += binary * Math.pow(2, i);
        }
        System.out.println(c);
        scan.close();
    }
}
