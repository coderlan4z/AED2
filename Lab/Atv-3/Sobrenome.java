import java.util.Scanner;

public class Sobrenome {
      public static boolean isEnd(String str) {
            return str.equals("FIM");
      }

      public static void isEasy(String word) {
            boolean isEasy = true;
            for (int i = 0; i < word.length() - 2; i++) {
                  if (!isVowel(word.charAt(i)) && !isVowel(word.charAt(i + 1)) && !isVowel(word.charAt(i + 2))) {
                        isEasy = false;
                        break;
                  }
            }
            if (isEasy) {
                  System.out.printf("%s eh facil\n", word);
            } else {
                  System.out.printf("%s nao eh facil\n", word);
            }
      }

      public static boolean isVowel(char c) {
            return "aeiou".indexOf(c) != -1;
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str;

            do {
                  str = scanner.nextLine();
                  if (!isEnd(str)) {
                        isEasy(str);
                  }
            } while (!isEnd(str));
      }
}