import java.util.Scanner;

public class A_Recursivo {
    public static boolean isUppercase(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    public static boolean isEnd(String str) {
        return str.equals("FIM");
    }

    public static int countUppercase(String str, int position) {
        if (position >= str.length()) {
            return 0;
        }
        if (isUppercase(str.charAt(position))) {
            return 1 + countUppercase(str, position + 1);
        }
        return countUppercase(str, position + 1);
    }

    public static int countUppercase(String str) {
        return countUppercase(str, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        do {
            str = scanner.nextLine();
            if (!isEnd(str)) {
                int count = countUppercase(str);
                System.out.println(count);
            }
        } while (!isEnd(str));
    }
}