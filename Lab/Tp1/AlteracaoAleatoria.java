import java.util.Random;
import java.util.Scanner;

public class AlteracaoAleatoria {
    public static void Sortear(char[] s) {
        Random rand = new Random();
        int minAscii = 'a';
        int maxAscii = 'z';

        char c1 = (char) (rand.nextInt(maxAscii - minAscii + 1) + minAscii);
        char c2 = (char) (rand.nextInt(maxAscii - minAscii + 1) + minAscii);

        for (int i = 0; i < s.length; i++) {
            if (s[i] == c1) {
                s[i] = c2;
            }
        }
        System.out.println(String.valueOf(s));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = new char[500];

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("FIM")) {
                break;
            }
            s = input.toCharArray();
            Sortear(s);
        }
        scanner.close();
    }
}
