#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

void recursive_replace(char *str, char old_char, char new_char, int index)
{
      if (str[index] == '\0')
      {
            printf("%s", str);
            return;
      }

      if (str[index] == old_char)
      {
            str[index] = new_char;
      }

      recursive_replace(str, old_char, new_char, index + 1);
}

void replace_chars(char *str)
{
      srand(time(NULL));
      int min_ascii = 'a';
      int max_ascii = 'z';

      char old_char = rand() % (max_ascii - min_ascii + 1) + min_ascii;
      char new_char = rand() % (max_ascii - min_ascii + 1) + min_ascii;

      recursive_replace(str, old_char, new_char, 0);
}

int main()
{
      char input_str[500];

      while (1)
      {
            fgets(input_str, sizeof(input_str), stdin);

            if (strcmp(input_str, "FIM\n") == 0)
            {
                  break;
            }

            replace_chars(input_str);
      }

      return 0;
}