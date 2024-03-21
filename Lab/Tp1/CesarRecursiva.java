public class CesarRecursiva {
      public static boolean isEnd(String str) {
            return str.equals("FIM");
      }

      public static String cifraRecursiva(String linha, int index) {
            if (index >= linha.length()) {
                  return "";
            }

            char caractere = linha.charAt(index);
            char novoCaractere;
            if (caractere == '-') {
                  novoCaractere = '0';
            } else if (caractere == ' ') {
                  novoCaractere = '#';
            } else {
                  novoCaractere = (char) (caractere + 3);
            }

            return novoCaractere + cifraRecursiva(linha, index + 1);
      }

      public static String cifra(String linha) {
            return cifraRecursiva(linha, 0);
      }

      public static void main(String[] args) {
            String linha;
            do {
                  linha = MyIO.readLine();
                  if (!isEnd(linha)) {
                        MyIO.println(cifra(linha));
                  }
            } while (!isEnd(linha));
      }
}
