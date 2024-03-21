public class Is {
      public static boolean isEnd(String s) {
            return s.equals("FIM");
      }

      public static boolean isVogal(String s) {
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                        return false;
                  }
            }
            return true;
      }

      public static boolean isConsoante(String s) {
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c < '0' || c > '9') {
                        return false;
                  }
            }
            return true;
      }

      public static boolean isInteiro(String s) {
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (c < '0' || c > '9') {
                        return false;
                  }
            }
            return true;
      }

      public static boolean isReal(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if (c == '.') {
                        count++;
                  }
                  if (count > 1) {
                        return false;
                  }
                  if (c < '0' || c > '9') {
                        return false;
                  }
            }
            return true;
      }

      public static void main(String[] args) {
            String linha;
            do {
                  linha = MyIO.readLine();
                  if (!isEnd(linha)) {
                        if (isVogal(linha)) {
                              System.out.print("SIM ");
                        } else {
                              System.out.print("NAO ");
                        }
                        if (isConsoante(linha)) {
                              System.out.print("SIM ");
                        } else {
                              System.out.print("NAO ");
                        }
                        if (isInteiro(linha)) {
                              System.out.print("SIM ");
                        } else {
                              System.out.print("NAO ");
                        }
                        if (isReal(linha)) {
                              System.out.println("SIM");
                        } else {
                              System.out.println("NAO");
                        }
                  }
            } while (!isEnd(linha));
      }
}
