#include <stdio.h>
#include <stdlib.h>

int main()
{
      int n;
      scanf("%d", &n);

      FILE *file = fopen("valores.txt", "wb+");
      if (file == NULL)
      {
            perror("Erro ao abrir arquivo");
            return EXIT_FAILURE;
      }

      for (int i = 0; i < n; i++)
      {
            double value;
            scanf("%lf", &value);
            fwrite(&value, sizeof(double), 1, file);
      }

      fclose(file);

      file = fopen("valores.txt", "rb");
      if (file == NULL)
      {
            perror("Erro ao abrir arquivo");
            return EXIT_FAILURE;
      }

      for (int i = n - 1; i >= 0; i--)
      {
            fseek(file, i * sizeof(double), SEEK_SET);
            double value;
            fread(&value, sizeof(double), 1, file);
            printf("%.3lf\n", value);
      }

      fclose(file);

      return 0;
}
