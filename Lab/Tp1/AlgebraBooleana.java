public class AlgebraBooleana {
      static String TrocarLetra(String s, int n) {
            int tam = s.length();
            String s2 = new String();
            char A, B, C = 0;
            A = s.charAt(0);
            B = s.charAt(1);
            if (n == 3) {
                  C = s.charAt(2);

            }
            for (int i = n; i < tam; i++) {
                  char temp = s.charAt(i);
                  if (temp == 'A') {
                        s2 = s2 + A;
                  } else if (temp == 'B') {
                        s2 = s2 + B;
                  } else if (temp == 'C') {
                        s2 = s2 + C;
                  } else
                        s2 = s2 + temp;

            }
            return s2;

      }

      static String TrocarExpressao(String s) {
            while (s.length() > 1)

            {

                  s = not(s);

                  s = and(s);
                  s = or(s);
            }

            return s;
      }

      static String RemoverEspaco(String s) {
            char temp;
            int tam = s.length();
            String resp = new String();
            for (int i = 0; i < tam; i++) {
                  temp = s.charAt(i);
                  if (temp == ' ') {

                  } else
                        resp = resp + temp;
            }
            return resp;
      }

      static String and(String s2) {
            char temp;
            String s3 = new String();
            int tam = s2.length();
            for (int i = 0; i < tam; i++) {
                  temp = s2.charAt(i);
                  if (temp == 'a' && s2.charAt(i + 1) == 'n' && s2.charAt(i + 2) == 'd' && s2.charAt(i + 3) == '('
                              && (s2.charAt(i + 4) == '1' || s2.charAt(i + 4) == '0') && s2.charAt(i + 7) == ',') {
                        if (s2.charAt(i + 4) == '1' && s2.charAt(i + 6) == '1') {

                              s3 = s3 + "and(1";
                              i = i + 6;
                        } else {
                              s3 = s3 + "and(0";
                              i = i + 6;
                        }
                  } else if (temp == 'a' && s2.charAt(i + 1) == 'n' && s2.charAt(i + 2) == 'd'
                              && s2.charAt(i + 3) == '(' && (s2.charAt(i + 4) == '1' || s2.charAt(i + 4) == '0')
                              && (s2.charAt(i + 6) == '1' || s2.charAt(i + 6) == '0')) {
                        if (s2.charAt(i + 4) == '1' && s2.charAt(i + 6) == '1') {

                              s3 = s3 + "1";
                              i = i + 7;
                        } else {
                              s3 = s3 + "0";
                              i = i + 7;
                        }

                  } else {
                        s3 = s3 + temp;
                  }

            }
            return s3;

      }

      static String or(String s) {
            char temp;
            String s2 = new String();
            int tam = s.length();
            for (int i = 0; i < tam; i++) {
                  temp = s.charAt(i);
                  if (temp == 'o' && s.charAt(i + 1) == 'r' && s.charAt(i + 2) == '('
                              && (s.charAt(i + 3) == '1' || s.charAt(i + 3) == '0') && s.charAt(i + 6) == ',') {
                        if (s.charAt(i + 3) == '1' || s.charAt(i + 5) == '1') {
                              s2 = s2 + "or(1";
                              i = i + 5;
                        } else {
                              s2 = s2 + "or(0";
                              i = i + 5;
                        }
                  }

                  else if (temp == 'o' && s.charAt(i + 1) == 'r' && s.charAt(i + 2) == '('
                              && (s.charAt(i + 3) == '1' || s.charAt(i + 3) == '0')) {
                        if (s.charAt(i + 3) == '1' || s.charAt(i + 5) == '1') {
                              s2 = s2 + '1';
                              i = i + 6;
                        } else {
                              s2 = s2 + '0';
                              i = i + 6;
                        }
                  } else
                        s2 = s2 + temp;
            }

            return s2;
      }

      static String not(String s)

      {
            int tam = s.length();
            char temp;

            String s2 = new String();
            for (int i = 0; i < tam; i++) {
                  temp = s.charAt(i);
                  if (temp == 'n' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 't' && s.charAt(i + 3) == '('
                              && (s.charAt(i + 4) == '1' || s.charAt(i + 4) == '0') && s.charAt(i + 5) == ')') {
                        if (s.charAt(i + 4) == '1') {
                              s2 = s2 + '0';
                              i = i + 5;
                        } else if (s.charAt(i + 4) == '0') {
                              s2 = s2 + '1';
                              i = i + 5;
                        }

                  } else
                        s2 = s2 + temp;

            }

            return s2;
      }

      static boolean Resultado(String s, int n) {

            s = RemoverEspaco(s);
            s = TrocarLetra(s, n);
            s = TrocarExpressao(s);
            if (s.charAt(0) == '0')
                  return false;
            else
                  return true;
      }

      public static void main(String args[]) {
            boolean status = true;
            while (status) {
                  int n = MyIO.readInt();
                  if (n == 0) {
                        break;
                  }

                  String s = MyIO.readLine();
                  if (Resultado(s, n) == false) {
                        MyIO.println(0);
                  } else {
                        MyIO.println(1);
                  }
            }

      }
}