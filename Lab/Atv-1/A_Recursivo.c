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

int countUppercaseRecursive(const char *str, int index)
{
      if (str[index] == '\0')
      {
            return 0;
      }

      int count = 0;
      if (isUppercase(str[index]))
      {
            count = 1;
      }

      return count + countUppercaseRecursive(str, index + 1);
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
                  count = countUppercaseRecursive(str, 0);
                  printf("%d\n", count);
            }
      } while (!isEnd(str));

      return 0;
}