#include<iostream>

using namespace std;

class Polynominal {
  private:
    int size;
    int coeff[50];
    int deg[50];

  public:
    void getSize();
    void getPoly();
    void add(Polynominal, Polynominal);
};

void Polynominal::getSize() {
  cout << "\nEnter size" << endl;
  cin >> size;
}

void Polynominal::getPoly() {
  for (int i = 0; i < size; i++) {
    cout << "\nEnter the coefficient : ";
    cin >> coeff[i];
    cout << "\nEnter the degree : ";
    cin >> deg[i];
  }
}

void Polynominal::add(Polynominal p1, Polynominal p2) {
  int i = 0, j = 0;

  cout << "\nThe result polynominal is : ";

  while (i < p1.size && j < p2.size) {
    if (p1.deg[i] == p2.deg[j]) {
      int sum = p1.coeff[i] + p2.coeff[j];
      cout << sum << "x^" << p1.deg[i] << "+";
      i++;
      j++;
    }

    else if (p1.deg[i] > p2.deg[j]) {
      cout << p1.coeff[i] << "x^" << p1.deg[i] << "+";
      i++;
    }

    else {
      cout << p2.coeff[j] << "x^" << p2.deg[j] << "+";
      j++;
    }
  }

  while (i < p1.size) {
    cout << p1.coeff[i] << "x^" << p1.deg[i] << "+";
    i++;
  }

  while (j < p2.size) {
    cout << p2.coeff[j] << "x^" << p2.deg[j] << "+";
    j++;
  }

  cout << "\b" << "";
}

int main() {
  Polynominal p1, p2, p3;

  cout << "\nFirst Polynominal:" << endl;
  p1.getSize();
  p1.getPoly();

  cout << "\nSecond Polynominal:" << endl;
  p2.getSize();
  p2.getPoly();
  
  p3.add(p1, p2);

  return 0;
}