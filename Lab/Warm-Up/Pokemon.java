import java.util.Scanner;

public class Pokemon {

      public static void RepeatPokemon(int n, String[] temp) {
            int repeat = 0;
            int pokemons = 0;
            int result = 151;
            for (int i = 0; i < n - 1; i++) {
                  if (temp[i].equals(temp[i + 1])) {
                        repeat++;
                  }
            }
            pokemons = n - repeat - 1;
            result = 151 - pokemons;
            System.out.printf("Falta(m) %d pomekon(s).", result);
      }

      public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            String[] temp = new String[n];
            for (int i = 0; i < n; i++) {
                  temp[i] = sc.nextLine();
            }
            sc.close();
            RepeatPokemon(n, temp);
      }
}