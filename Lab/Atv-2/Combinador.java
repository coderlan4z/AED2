import java.util.Scanner;

public class Combinador {

      public static String combine(String str1, String str2) {
            char[] str3 = new char[str1.length() + str2.length()];
            int i = 0;
            int j = 0;
            while (i < str1.length() && i < str2.length()) {
                  if (i < str1.length()) {
                        str3[j] = str1.charAt(i);
                        j++;
                  }
                  if (i < str2.length()) {
                        str3[j] = str2.charAt(i);
                        j++;
                  }
                  i++;
            }
            return new String(str3);
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str1, str2;
            while (scanner.hasNext()) {
                  str1 = scanner.next();
                  str2 = scanner.next();
                  System.out.println(combine(str1, str2));
            }
            scanner.close();
      }
}
