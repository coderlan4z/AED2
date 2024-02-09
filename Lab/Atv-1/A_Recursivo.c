#include <stdio.h>
#include <string.h>

void uppercaseHelper(const char *str, int i, int count)
{
      if (str[i] == '\0')
      {
            return;
      }

      char currentChar = str[i];

      if (currentChar == '\n')
      {
            printf("%d\n", count);
            count = 0;
      }
      else if (currentChar >= 'A' && currentChar <= 'Z')
      {
            count++;
      }

      if (strncmp(&str[i], "FIM", 3) == 0)
      {
            return;
      }

      uppercaseHelper(str, i + 1, count);
}

void uppercase(const char *str)
{
      uppercaseHelper(str, 0, 0);
}

int main()
{
      char linha[1000];
      char input[10000] = "";

      while (fgets(linha, sizeof(linha), stdin) != NULL)
      {
            strcat(input, linha);
      }

      uppercase(input);

      return 0;
}
