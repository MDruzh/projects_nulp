// lb4.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <vector>

using namespace std;

const short N = 5;
class Matrix
{
private:
	int matrix[N][N];
	int i, j;
	int*ProductOfElement;
public:
	void InputMatrix();
	void WriteMatrix();
	void SelectionSort();
	void ProductOfElements();
	void WriteProduct();
	void SumOfElements();
};

void Matrix::InputMatrix()
{
	cout << "Write matrix:" << endl;

	for (i = 0; i < N; i++)
	{
		for (j = 0; j < N; j++)
		{
			cout << '[' << i + 1 << "][" << j + 1 << "] = ";
			cin >> matrix[i][j];
		}
	}
}

void Matrix::WriteMatrix()
{
	for (i = 0; i < N; i++, cout << endl)
	{
		for (j = 0; j < N; j++)
		{
			printf("%4d ", matrix[i][j]);
		}
	}
}

void Matrix::SelectionSort()
{
	for (int x = 0; x < 5; x++) {
		for (int y = 1; y < 5; y++) {
			for (int z = 0; z < 5 - y; z++) {
				if (matrix[z][x] > matrix[z + 1][x]) {
					int buffer = matrix[z][x];
					matrix[z][x] = matrix[z + 1][x];
					matrix[z + 1][x] = buffer;
				}
			}
		}
	}
}

void Matrix::ProductOfElements()
{
	ProductOfElement = new int[N - 1];
	for (int k = 0; k< N-1; k++)
	{
		int product = 1;
		for (int j = 0; j < N; j++)
		{
			if ((k + j) < N-1)
			product *= matrix[k][j];
		}
		ProductOfElement[k] = product;
	}
}

void Matrix::WriteProduct()
{
	cout << "\nProduct of elements above auxiliary diagonal:" << endl;

	for (i = 0; i < N-1; i++)
	{
		cout << ProductOfElement[i] << ' ';
	}
	cout << endl << endl;
}


void Matrix::SumOfElements() {
	int product = 0;

	for (i = 0; i < N-1; i++)
	{
		product += ProductOfElement[i];
	}
	cout << "Sum of elements = " << product << endl << endl;
}

int main(void) {
	Matrix M;

	M.InputMatrix();
	cout << "\n Inputed matrix:" << endl;
	M.WriteMatrix();
	M.SelectionSort();
	cout << "\n Sorted matrix:" << endl;
	M.WriteMatrix();
	M.ProductOfElements();
	M.WriteProduct();
	M.SumOfElements();

	system("PAUSE");
	return 0;
}
