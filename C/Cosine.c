#include<stdio.h>
#include<math.h>
#include<Conio.h>

void main() {
  float x, t, x1, y, sum;
  int i, n=20;

  clrscr();

  printf("\n\t Input x");
  scanf("%f", &x);
  printf("\n\t %6.4f", x);

  x1 = x;
  x = x * (3.1412/180); // Convert degrees to radians
  t = 1;
  sum = 1;

  for(i=1; i<=n; i++) {
    t = t * pow((double)(-1), (double)(2*i-1)) * x * x / (2*i * (2*i-1));
    sum = sum + t;
  }

  y = cos(x);

  printf("\n\t Calculated value");
  printf("\t tcos(%3.0f) = %7.2f\n", x1, sum);
  printf("\n\t Built-in value");
  printf("\t cos(%3.0f) = %7.2f\n", x1, y);

  getch();
}