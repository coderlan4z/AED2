import java.io.*;
import java.nio.charset.*;
import java.net.*;


public class Html {
      public static String getHtml(String endereco) {
            URL url;
            InputStream is = null;
            BufferedReader br;
            String resp = "", line;

            try {
                  url = new URL(endereco);
                  is = url.openStream();
                  br = new BufferedReader(new InputStreamReader(is));

                  while ((line = br.readLine()) != null) {
                        resp += line + "\n";
                  }
            } catch (MalformedURLException mue) {
                  mue.printStackTrace();
            } catch (IOException ioe) {
                  ioe.printStackTrace();
            }

            try {
                  is.close();
            } catch (IOException ioe) {
            }
            return resp;
      }

      static boolean consoante(char s) {
            if (s >= 97 && s <= 122 && s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u')
                  return true;
            else
                  return false;

      }

      static void imprimir(char letra, int i) {
            System.out.print(letra);
            MyIO.print("(");
            MyIO.print(i);
            MyIO.print(") ");
      }

      static void imprimir(String f, int i) {
            MyIO.print(f);
            MyIO.print("(");
            MyIO.print(i);
            MyIO.print(") ");
      }

      static void ler(String s, String nome) {
            char aGrave = (char) 224;
            char aAgudo = (char) 225;
            char aTil = (char) 227;
            char aCirc = (char) 226;
            char eGrave = (char) 232;
            char eAgudo = (char) 233;
            char eCirc = (char) 234;
            char iGrave = (char) 236;
            char iAgudo = (char) 237;
            char iCirc = (char) 238;
            char oGrave = (char) 242;
            char oAgudo = (char) 243;
            char oCirc = (char) 244;
            char oTil = (char) 245;
            char uGrave = (char) 249;
            char uAgudo = (char) 250;
            char uCirc = (char) 251;
            int[] cont = new int[25];
            for (int i = 0; i < 25; i++) {
                  cont[i] = 0;
            }
            int tam = s.length();
            for (int i = 0; i < tam; i++) {
                  char temp = s.charAt(i);
                  if (temp == 'a') {
                        cont[0] = cont[0] + 1;
                  } else if (temp == 'e') {
                        cont[1] = cont[1] + 1;
                  } else if (temp == 'i') {
                        cont[2] = cont[2] + 1;
                  } else if (temp == 'o') {
                        cont[3] = cont[3] + 1;
                  } else if (temp == 'u') {
                        cont[4] = cont[4] + 1;
                  } else if (temp == aAgudo) {
                        cont[5] = cont[5] + 1;
                  } else if (temp == eAgudo) {
                        cont[6] = cont[6] + 1;
                  } else if (temp == iAgudo) {
                        cont[7] = cont[7] + 1;
                  } else if (temp == oAgudo) {
                        cont[8] = cont[8] + 1;
                  } else if (temp == uAgudo) {
                        cont[9] = cont[9] + 1;
                  } else if (temp == aGrave) {
                        cont[10] = cont[10] + 1;
                  } else if (temp == eGrave) {
                        cont[11] = cont[11] + 1;
                  } else if (temp == iGrave) {
                        cont[12] = cont[12] + 1;
                  } else if (temp == oGrave) {
                        cont[13] = cont[13] + 1;
                  } else if (temp == uGrave) {
                        cont[14] = cont[14] + 1;
                  } else if (temp == aTil) {
                        cont[15] = cont[15] + 1;
                  } else if (temp == oTil) {
                        cont[16] = cont[16] + 1;
                  } else if (temp == aCirc) {
                        cont[17] = cont[17] + 1;
                  } else if (temp == eCirc) {
                        cont[18] = cont[18] + 1;
                  } else if (temp == iCirc) {
                        cont[19] = cont[19] + 1;
                  } else if (temp == oCirc) {
                        cont[20] = cont[20] + 1;
                  } else if (temp == uCirc) {
                        cont[21] = cont[21] + 1;
                  }

                  else if (temp == '<' && s.charAt(i + 1) == 'b' && s.charAt(i + 2) == 'r' && s.charAt(i + 3) == '>') {
                        cont[23] = cont[23] + 1;
                        i = i + 4;
                  } else if (temp == '<' && s.charAt(i + 1) == 't' && s.charAt(i + 2) == 'a' && s.charAt(i + 3) == 'b'
                              && s.charAt(i + 4) == 'l' && s.charAt(i + 5) == 'e' && s.charAt(i + 6) == '>') {
                        cont[24] = cont[24] + 1;
                        i = i + 5;
                  } else if (consoante(temp)) {
                        cont[22] = cont[22] + 1;
                  }
            }
            imprimir('a', cont[0]);
            imprimir('e', cont[1]);
            imprimir('i', cont[2]);
            imprimir('o', cont[3]);
            imprimir('u', cont[4]);
            imprimir(aAgudo, cont[5]);
            imprimir(eAgudo, cont[6]);
            imprimir(iAgudo, cont[7]);
            imprimir(oAgudo, cont[8]);
            imprimir(uAgudo, cont[9]);
            imprimir(aGrave, cont[10]);
            imprimir(eGrave, cont[11]);
            imprimir(iGrave, cont[12]);
            imprimir(oGrave, cont[13]);
            imprimir(uGrave, cont[14]);
            imprimir(aTil, cont[15]);
            imprimir(oTil, cont[16]);
            imprimir(aCirc, cont[17]);
            imprimir(eCirc, cont[18]);
            imprimir(iCirc, cont[19]);
            imprimir(oCirc, cont[20]);
            imprimir(uCirc, cont[21]);
            imprimir("consoante", cont[22]);
            imprimir("<br>", cont[23]);
            imprimir("<table>", cont[24]);
            MyIO.println(nome);
      }

      public static void main(String args[]) {
            boolean status = true;
            while (status) {

                  String nome = MyIO.readLine();
                  if (nome.charAt(0) == 'F' && nome.charAt(1) == 'I' && nome.charAt(2) == 'M' && nome.length() == 3) {
                        break;
                  }
                  String s3 = MyIO.readLine();
                  String s4 = getHtml(s3);
                  ler(s4, nome);
            }

      }
}