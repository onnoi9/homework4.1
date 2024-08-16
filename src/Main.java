import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int t;
        String action;
        System.out.println("Give total:");
        Scanner scanner = new Scanner(System.in);
               t = scanner.nextInt ();

               if(t < 17)
                   action = "hit";
               else if (t<=21)
                   action = "stay";
               else
                   action = "bust";

        System.out.println(action);




    }
}