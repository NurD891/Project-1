import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();

        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += c;
        }
         // somthing
        if (sum % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
