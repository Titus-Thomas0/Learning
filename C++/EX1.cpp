#include<iostream>
#include<cstring>
using namespace std;

#define size 5

class stacks {
  private:
    int stack[size];
    int top = -1;
  public:
    void push();
    int pull();
    void display();
};

void stacks::push() {
  if (top == (size - 1)) {
    cout << "\nStack Overflow." << endl;
    return;
  }

  top++;
  cout << "\nEnter a element to stack : " << endl;
  cin >> stack[top];
  cout << "\n" << stack[top] << " is pushed to the stack." << endl;
}

int stacks::pull() {
  if (top == -1) {
    cout << "\nStack Underflow." << endl;
  }

  int popped_element = stack[top];
  stack[top] = 0;
  top--;
  return popped_element;
}

void stacks::display() {
  if (top == -1) {
    cout << "\nStack is empty." << endl;
  }

  cout << "\nStack elements are " << endl;

  for (int i = 0; i <= top; i++) {
    cout << stack[i] << endl;
  }
}

int main() {
  stacks s;
  char choice;
  int q = 0;

  do {
    cout << "\nPush -> I, Pull -> P, Quit -> Q. Enter your choice : " << endl;
    do {
      cin >> choice;
      choice = tolower(choice);
    }
    while (strchr ("ipq", choice) == NULL);
    switch (choice) {
      case 'i':
        s.push();
        s.display();
        break;

      case 'p':
        cout << s.pull() << endl;
        s.display();
        break;

      case 'q':
        q = 1;
      }
  }
  while (!q);
  return 0;
}