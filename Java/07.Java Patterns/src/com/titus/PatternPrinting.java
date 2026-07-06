package com.titus;

public class PatternPrinting {
    public static void main(String[] args) {
        pattern27(5);
    }

    static void pattern27(int n) {
        for (int row = 1; row <= n + 1; row++) {
            int space = row - 1;
            for (int col = 1; col <= n + 1 - space; col++) {
                System.out.print(row + " ");
            }
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern26(int n) {
        for (int row = 1; row <= n + 1; row++) {
            int space = row - 1;
            for (int col = 1; col <= n + 1 - space; col++) {
                System.out.print(row + " ");
            }
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern25(int n) {
        for (int row = 1; row <= n; row++) {
            int space = n - row;

            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n) {
                    System.out.print("*");
                }
                else if (col == 1 || col == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int currentRow = row > n ? (2 * n + 1 - row) : row;
            int space = 2 * (n - currentRow);

            for (int col = 1; col <= currentRow; col++) {
                if (col == 1 || col == currentRow) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= currentRow; col++) {
                if (col == 1 || col == currentRow) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

//    static void pattern23(int n) {
//        for (int row = 1; row <= n; row++) {
//            int i = row % 2 == 0 ? 0 : 1;
//            for (int col = 1; col <= row; col++) {
//                System.out.print(i + " ");
//                i = 1 - i;
//            }
//            System.out.println();
//        }
//    }

    static void pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            int i = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(i + " ");
                i = 1 - i;
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(i + " ");
                i++;
            }

            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n; col++) {
                if (row == 1 || row == n) {
                    System.out.print("*");
                }
                else if (col == 1 || col == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern19(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int currentRow = row > n ? 2 * n - row : row;
            int space = 2 * n - 2 * currentRow ;

            for (int col = 1; col <= currentRow; col++) {
                System.out.print("*");
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= currentRow; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int currentRow = row > n ? 2 * n - row + 1 : row;
            int star = n - currentRow + 1;
            int space = 2 * currentRow - 2;

            for (int col = 1; col <= star; col++) {
                System.out.print("*");
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= star; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int currentRow = row > n ? 2 * n - row : row;

            for (int s = 0; s < n - currentRow; s++) {
                System.out.print(" ");
            }

            for (int col = currentRow; col >= 1; col--) {
                System.out.print(col);
            }

            for (int col = 2; col <= currentRow; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }

            int val = 1;

            for (int col = 0; col <= row; col++) {
                System.out.print(val + " ");

                val = val * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int currentRow = row > n ? 2 * n - row : row;
            int star = 2 * currentRow - 1;
            int space = n - currentRow;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                if (row == 1 && row == 2 * n - 1) {
                    System.out.print("*");
                    break;
                }

                if (col == 1 || col == star) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            int space = row - 1;
            int star = 2 * n - row - space;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                if (row == n) {
                    System.out.print("*");
                    break;
                }

                if (row == 1) {
                    System.out.print("*");
                }
                else if (col == 1 || col == star) {
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            int space = n - row;
            int star = row * 2 - 1;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= star; col++) {
                if (row == 1) {
                    System.out.print("*");
                    break;
                }

                if (row == n) {
                    System.out.print("*");
                }
                else if (col == 1 || col == star) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int space = row > n ? 2 * n - row : row - 1;
            int star = row > n ? row - n - 1 : n - row;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= star; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < row - 1; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            int space = row - 1;
            int star = n * 2 - row - space;
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < star; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < row - 1; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfEle = row > n ? 2 * n - row : row;
            for (int col = 1; col <= noOfEle; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n - row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
