import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sun rises in ?\n1.East\n2.West\n3.North\n4.South");
        System.out.println("Enter your choice");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Yes correct ");
                break;
            default:
                System.out.println("Wrong");
                break;
        }
        float x = 2.888f;
        System.out.printf("%.2f",x);
    }
}
