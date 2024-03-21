public class Cesar {
    public static boolean isEnd(String str) {
        return str.equals("FIM");
    }

    public static String cifra(String linha) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < linha.length(); i++) {
            char caractere = linha.charAt(i);
            char novoCaractere = (char) (caractere + 3);
            if (caractere == '-') {
                resultado.append('0');
            } else if (caractere == ' ') {
                resultado.append('#');
            } else {
                resultado.append(novoCaractere);
            }
        }

        return resultado.toString();

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