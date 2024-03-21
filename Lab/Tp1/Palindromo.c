#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isEnd(char *str)
{
      return strcmp(str, "FIM") == 0;
}

bool isPalindromo(char *str)
{
      int i = 0;
      int j = strlen(str) - 1;

      while (i < j)
      {
            if (str[i] != str[j])
            {
                  printf("NAO\n");
                  return false;
            }
            i++;
            j--;
      }
      printf("SIM\n");
      return true;
}

int main()
{
      char str[1000];
      do
      {
            fgets(str, 1000, stdin);
            strtok(str, "\n");
            if (!isEnd(str))
            {
                  isPalindromo(str);
            }
      } while (!isEnd(str));
      return 0;
}
