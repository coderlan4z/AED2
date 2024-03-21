import java.util.Scanner;

public class encontre_0 {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;

            do {
                  input = scanner.nextLine();
                  if (input.equals("0")) {
                        System.out.println("P");
                  } else {
                        System.out.println("I");
                  }
            } while (!input.equals("0"));
      }
}
