public class IsRecursivo {
    public static boolean isEnd(String s) {
        return s.equals("FIM");
    }

    public static boolean isVogalRecursivo(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            return false;
        }
        return isVogalRecursivo(s, index + 1);
    }

    public static boolean isVogal(String s) {
        return isVogalRecursivo(s, 0);
    }

    public static boolean isConsoanteRecursivo(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c < '0' || c > '9') {
            return false;
        }
        return isConsoanteRecursivo(s, index + 1);
    }

    public static boolean isConsoante(String s) {
        return isConsoanteRecursivo(s, 0);
    }

    public static boolean isInteiroRecursivo(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (c < '0' || c > '9') {
            return false;
        }
        return isInteiroRecursivo(s, index + 1);
    }

    public static boolean isInteiro(String s) {
        return isInteiroRecursivo(s, 0);
    }

    public static boolean isRealRecursivo(String s, int index, int count) {
        if (index == s.length()) {
            return count <= 1;
        }
        char c = s.charAt(index);
        if (c == '.') {
            count++;
        }
        if (count > 1 || (c != '.' && (c < '0' || c > '9'))) {
            return false;
        }
        return isRealRecursivo(s, index + 1, count);
    }

    public static boolean isReal(String s) {
        return isRealRecursivo(s, 0, 0);
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
