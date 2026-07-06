#include<iostream>;

using namespace std;

struct Node {
  int data;
  Node* left;
  Node* right;
};

class Binary_tree {
  public:
  Node* binary_tree (char[], int, int);
  void pre_order(Node*);
  void in_order(Node*);
  void post_order(Node*);
};

Node* Binary_tree::binary_tree(char ch[], int lower, int higher) {
  if (lower > higher) {
    return NULL;
  }

  int mid = (higher - lower) / 2;

  Node* node = new Node;
  node->data = ch[mid];

  node->left = binary_tree(ch, lower, mid - 1);
  node->right = binary_tree(ch, mid + 1, higher);

  return node;
} 

void Binary_tree::pre_order(Node* node) {
  if (node) {
    cout << node->data << " ";
    pre_order(node->right);
    pre_order(node->left);
  }
}

void Binary_tree::in_order(Node* node) {
  if (node) {
    pre_order(node->left);
    cout << node->data << " ";
    pre_order(node->right);
  }
}

void Binary_tree::post_order(Node* node) {
  if (node) {
    pre_order(node->left);
    pre_order(node->right);
    cout << node->data << " ";
  }
}

int main() {
  Binary_tree tree;
  char ch[100];
  int num = 0;
  char value;
  char choice;

  cout << "\nInput choice b to break.";
  cin >> choice;

  while (choice != 'b') {
    cout << "Input information of node : ";
    cin >> value;
    ch[num] = value;

    num++;

    cout << "\nInput choice b to break.";
    cin >> choice;
  }

  cout << "\nTotal number of input is : " << num << endl;

  Node* node = tree.binary_tree(ch, 0, num - 1);

  cout << "\nPre-Order value is :";
  tree.pre_order(node);

  cout << "\nIn-Order value is :";
  tree.in_order(node);

  cout << "\nPost-Order value i :";
  tree.post_order(node);

  return 0;
}