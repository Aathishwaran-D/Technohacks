import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ToDo
 */
class ToDo {
    List<String> arr = new ArrayList<>();
    public void add(String a)
    {
        arr.add(a);
    }

    void view() {
        for (String string : arr) {
            System.out.println(string);
        }
    }

    void update(int a,String s) {
        arr.set(a, s);
    }

    public void delete(Integer valueOf) {
        arr.remove(valueOf - 1);
    }
}
class simpletodo {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ToDo todo = new ToDo();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter Option: 1.Add 2.View 3.Update 4.Delete");       
            int option = Integer.valueOf(input.readLine());
            switch (option) {
            case 1:
                System.out.print("Enter what you want to add in your ToDO List:");
                String inp = input.readLine();
                todo.add(inp);
                break;
            case 2:
                System.out.println("Your list:");
                todo.view();
                break;
            case 3:
                System.out.println("Your list:");
                todo.view();
                System.out.println("Enter the line have to update:");
                int n = Integer.valueOf(input.readLine());
                System.out.print("Enter the updated text:");
                String s = input.readLine();
                todo.update(n-1,s);
                break;
            case 4:
                System.out.println("Your list:");
                todo.view();
                System.out.print("Enter the line you have to delete: ");
                todo.delete(Integer.valueOf(input.readLine()));
        }
        }
    }
}
