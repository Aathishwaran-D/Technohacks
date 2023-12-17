import java.util.Random;
import java.util.Scanner;

public class ran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length of your password: ");
        int len = scan.nextInt();
        System.out.println("Your generated password is: " + randomGenerator(len));
        scan.close();
    }

    private static String randomGenerator(int len) {
        String pass = "";
        Random r = new Random();
        String mylist = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        for (int i = 0; i < len; i++) {
            pass += mylist.charAt(r.nextInt(mylist.length()));
        }
        return pass;
    }
    
}