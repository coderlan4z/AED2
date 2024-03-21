#include <stdio.h>
#include <string.h>

int isUppercase(char c)
{
      return (c >= 'A' && c <= 'Z');
}

int isEnd(const char *str)
{
      return strcmp(str, "FIM") == 0;
}

int countUppercase(const char *str)
{
      int count = 0;
      for (int i = 0; str[i] != '\0'; i++)
      {
            if (isUppercase(str[i]))
            {
                  count++;
            }
      }
      return count;
}

int main()
{
      char str[100];
      int count;

      do
      {
            fgets(str, sizeof(str), stdin);
            strtok(str, "\n");
            if (!isEnd(str))
            {
                  count = countUppercase(str);
                  printf("%d\n", count);
            }
      } while (!isEnd(str));

      return 0;
}