import java.util.Scanner;

public class A_Iterativo {
    public static boolean isUppercase(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    public static boolean isEnd(String str) {
        return str.equals("FIM");
    }

    public static int countUppercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isUppercase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int count;

        do {
            str = scanner.nextLine();
            if (!isEnd(str)) {
                count = countUppercase(str);
                System.out.println(count);
            }
        } while (!isEnd(str));
    }
}