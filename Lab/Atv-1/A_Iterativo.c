#include <stdio.h>
#include <string.h>

void uppercase(const char *str)
{
      int count = 0;
      for (int i = 0; str[i] != '\0'; i++)
      {
            if (strncmp(&str[i], "FIM", 3) == 0)
            {
                  return;
            }
            if (str[i] >= 'A' && str[i] <= 'Z')
            {
                  count++;
            }
            else if (str[i] == '\n')
            {
                  printf("%d\n", count);
                  count = 0;
            }
      }
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
