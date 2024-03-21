import java.util.Scanner;

public class PalindromoRecursivo {

      public static boolean isEnd(String str) {
            return str.equals("FIM");
      }

      public static boolean isPalindromo(String str) {
            if (str.length() <= 1) {
                  System.out.println("SIM");
                  return true;
            }
            if (str.charAt(0) != str.charAt(str.length() - 1)) {
                  System.out.println("NAO");
                  return false;
            }

            return isPalindromo(str.substring(1, str.length() - 1));
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str;
            do {
                  str = scanner.nextLine();
                  if (!isEnd(str)) {
                        isPalindromo(str);
                  }
            } while (!isEnd(str));
            scanner.close();
      }
}
