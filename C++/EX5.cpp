#include<iostream>

using namespace std;

struct Node {
  int data;
  Node* next;
  Node* previous;
};

class Db_link {
  private:
    Node* start = NULL;

  public:
    void doubly_create();
    void doubly_insert();
    void doubly_delete();
    void doubly_display();
};

void Db_link::doubly_create() {
  Node* node;
  Node* temp;
  char ch;
  int num = 0;

  while (true) {
    cout << "\nInput choice n for break." << endl;
    ch = getchar();

    if (ch == 'n') {
      break;
    }

    if (ch == '\n'){
      node = new Node;

      cout << "\nInput the value of node : " << num + 1 << " : ";
      cin >> node->data;

      node->next = NULL;
      node->previous = NULL;

      if (start == NULL) {
        start = node;
      }
      else {
        temp = start;
        while (temp->next != NULL) {
          temp = temp->next;
        }
        temp->next = node;
        node->previous = temp;
      }

      num++;
    }
  }
  
  cout << "\nTotal number of nodes is " << num << endl;
}

void Db_link::doubly_insert() {
  Node* temp = new Node;

  cout << "\nInput the value of node : ";
  cin >> temp->data;

  temp->previous = NULL;
  temp->next = start;

  if (start != NULL) {
    start->previous = temp;
  }

  start = temp;
}

void Db_link::doubly_delete() {
  if (start == NULL) {
    cout << "\nList is empty" << endl;
    return;
  }

  Node* temp = start;
  start = start->next;

  if (start != NULL) {
    start->previous = NULL;
  }

  delete temp;
}

void Db_link::doubly_display() {
  Node* temp = start;

  if (temp == NULL) {
    cout << "\nList is empty" << endl;
  }

  while (temp->next != NULL) {
    cout << temp->data << endl;
    temp = temp->next;
  }

  cout << temp->data << endl;

  while (temp->previous != NULL) {
    temp = temp->previous;
    cout << temp->data << endl;
  }
}

int main() {
  Db_link db_link_list;

  cout << "\nDOUBLE LINKED LIST" << endl;
  cout << "\nCreating a linked list" << endl;
  cout << "\n~~~~~~~~~~~~~~~~~~~~~~" << endl;

  db_link_list.doubly_create();

  cout << "\nCreated doubly linked list as follows." << endl;
  db_link_list.doubly_display();

  cout << "\nInserting a node to linked list" << endl;
  cout << "\n~~~~~~~~~~~~~~~~~~~~~~" << endl;

  db_link_list.doubly_insert();

  cout << "\nAfter inserting doubly linked list as follows." << endl;
  db_link_list.doubly_display();

  cout << "\nDeleting a node to linked list" << endl;
  cout << "\n~~~~~~~~~~~~~~~~~~~~~~" << endl;

  db_link_list.doubly_delete();

  cout << "\nAfter deleting doubly linked list as follows." << endl;
  db_link_list.doubly_display();

  return 0;
}