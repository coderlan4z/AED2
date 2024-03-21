import java.util.*;
import java.io.RandomAccessFile;

public class Arquivo {
  public static void main(String[] args) {
    // definir dados
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    try {
      RandomAccessFile file = new RandomAccessFile("valores.txt", "rw");

      for (int i = 0; i < n; i++) {
        double value = scanner.nextDouble();
        file.writeDouble(value);
      }

      file.close();

      file = new RandomAccessFile("valores.txt", "r");

      for (int i = n - 1; i >= 0; i--) {
        file.seek(i * 8);
        double value = file.readDouble();
        System.out.println(value);
      }

      file.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    scanner.close();
  }
}
