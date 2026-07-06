#include<iostream>
#include<ctype.h>

using namespace std;

class InfixToPostfix {
  private:
    char stack[50];
    int top = -1;
  
  public:
    void push(char);
    char pop();
    char peek();
    int precedence(char);
    void convert();
};

void InfixToPostfix::push(char ch) { // edge case handling
  stack[++top] = ch;
}

char InfixToPostfix::pop() { // edge case handling
  return stack[top--];
}

char InfixToPostfix::peek() { // edge case handling
  return stack[top];
}

int InfixToPostfix::precedence(char ch) {
  if (ch == '+' || ch == '-') 
    return 1;
  if (ch == '*' || ch == '/') 
    return 2;
return 0;
}

void InfixToPostfix::convert() {
  char infix[50];
  int i = 0;
  char ch;

  cout << "\nEnter a expression that ends with $ sign" << endl;
  cin >> infix;
  cout << "\nPostfix expression : ";

  while ((ch = infix[i]) != '$') {
    if (isalpha(ch)) 
      cout << ch;
    
    else if (ch == '(')
      push(ch);

    else if (ch == ')') {
      while (peek() != '(')
        cout << pop();
      pop();
    }

    else {
      while (top != -1 && precedence(peek()) >= precedence(ch))
        cout << pop();
      push(ch);
    }

    i++;
  }

  while (top != -1) {
    cout << pop();
  }
}

int main() {
  InfixToPostfix obj;
  obj.convert();
  return 0;
}