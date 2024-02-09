import java.io.IOException;
import java.util.Scanner;

public class A_Iterativo {
    public void uppercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str == "FIM") {
                return;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            } else if (str.charAt(i) == '\n') {
                System.out.println(count);
                count = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        A_Iterativo app = new A_Iterativo();
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
