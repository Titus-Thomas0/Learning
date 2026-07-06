#include<iostream>
#include<cstring>

using namespace std;

#define size 5

class Queue {
  private:
    int queue[size];
    int front = -1;
    int rear = -1;

  public:
    void addQ();
    void deleteQ();
    void display();
};

void Queue::addQ() {
  if (rear == (size - 1)) {
    cout << "\nQueue overflow cannot add elements" <<endl;
    return;
  }

  if (front == -1)
    front++;

  cout << "\nEnter a value to add : " << endl;
  rear++;
  cin >> queue[rear];
  cout << "\n" << queue[rear] << " is added to the queue." << endl;
}

void Queue::deleteQ() {
  if (front == -1) {
    cout << "\nQueue underflow cannot delete elements" <<endl;
    return;
  }

  cout << "\n" << queue[front] << " is deleted from the queue." << endl;
  queue[front] = 0;
  front++;

  if (front > rear) 
    front = rear = -1;
}

void Queue::display() {
  if (front == -1) {
    cout << "\nQueue is empty." << endl;
  }

  cout << "\nQueue elements are " << endl;

  for (int i = front; i <= rear; i++) {
    cout << queue[i] <<endl; 
  }
}

int main() {
  Queue q;
  char choice;
  int e = 0;

  do {
    cout << "\nEnter A -> Add, D -> Delete or E -> Exit. Enter your choice" << endl;

    do {
      cin >> choice;
      choice = tolower(choice);
    }
    while(strchr("ade", choice) == NULL);

    switch (choice) {
    case 'a':
      q.addQ();
      q.display();
      break;
    case 'd':
      q.deleteQ();
      q.display();
      break;
    case 'e':
      e = 1;
    }
  }
  while(!e);
  return 0;
}