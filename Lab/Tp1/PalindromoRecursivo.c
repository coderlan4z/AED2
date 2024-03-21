#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isEnd(char *str)
{
      return strcmp(str, "FIM\n") == 0;
}

bool isPalindromoRecursivo(char *str, int inicio, int fim)
{
      if (inicio >= fim)
      {
            printf("SIM\n");
            return true;
      }

      if (str[inicio] != str[fim])
      {
            printf("NAO\n");
            return false;
      }

      return isPalindromoRecursivo(str, inicio + 1, fim - 1);
}

bool isPalindromo(char *str)
{
      int length = strlen(str);
      return isPalindromoRecursivo(str, 0, length - 2);
}

int main()
{
      char str[1000];
      do
      {
            fgets(str, 1000, stdin);
            if (!isEnd(str))
            {
                  isPalindromo(str);
            }
      } while (!isEnd(str));
      return 0;
}
