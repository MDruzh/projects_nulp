// Lab23.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include <stdio.h>
#include <math.h>
#include <conio.h>


int main()
{
	double a, b, h, d;
	printf("a: ");
	scanf_s("%lf", &a);
	printf("b: ");
	scanf_s("%lf", &b);
	printf("h: ");
	scanf_s("%lf", &h);
	printf("d: ");
	scanf_s("%lf", &d);

	while (a < b + h) {
		printf("x=%lf ", a);
		double sum = 0;
		double result = 0;
		int k = 1;
		do {
			result = (1 / pow(2, k) * sin(a / pow(2, k)));
			sum = sum + result;
			k++;
		} while (result > d);
		printf("sum = %lf\n", sum);

		a = a + h;
	}
	_getche();
    return 0;
}

