import java.io.IOException;
import java.util.Scanner;

public class A_Recursivo {
    public void uppercase(String str) {
        uppercaseHelper(str, 0, 0);
    }

    private void uppercaseHelper(String str, int i, int count) {
        if (i == str.length()) {
            return;
        }

        char currentChar = str.charAt(i);

        if (Character.isUpperCase(currentChar)) {
            count++;
        } else if (currentChar == '\n') {
            System.out.println(count);
            count = 0;
        }

        if (str.equals("FIM")) {
            return;
        }

        uppercaseHelper(str, i + 1, count);
    }

    public static void main(String[] args) throws IOException {
        A_Recursivo app = new A_Recursivo();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        String input = sb.toString();
        app.uppercase(input);
        scanner.close();
    }

}
