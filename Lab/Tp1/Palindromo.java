import java.util.Scanner;

public class Palindromo {

      public static boolean isEnd(String str) {
            return str.equals("FIM");
      }

      public static boolean isPalindromo(String str) {
            int i = 0;
            int j = str.length() - 1;

            while (i < j) {
                  if (str.charAt(i) != str.charAt(j)) {
                        System.out.println("NAO");
                        return false;
                  }
                  i++;
                  j--;
            }
            System.out.println("SIM");
            return true;
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
