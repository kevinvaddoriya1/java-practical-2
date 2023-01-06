import java.util.Scanner;

public class SimpleCALC {
    public static void main(String[] args) {
        CALC calc = new CALC();
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. input two numbers");
            System.out.println("2. Addition");
            System.out.println("3. Subtraction");
            System.out.println("4. Multiplication");
            System.out.println("5. Division");
            System.out.print("\nEnter your choice : ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            } 
            else if (choice == 1) {
                System.out.print("Enter no1 : ");
                n1 = sc.nextInt();
                System.out.print("Enter no2 : ");
                n2 = sc.nextInt();
            }
            else if (choice == 2) {
                calc.addition(n1, n2);
            }
            else if (choice == 3) {
                calc.subtraction(n1, n2);
            }
            else if (choice == 4) {
                calc.multiplication(n1, n2);
            }
            else if (choice == 5) {
                calc.division((float)n1, (float)n2);
            }
            else {
                System.out.println("Wrong choice ... !");
            }
        }
        sc.close();
    }
}

class CALC {
    int no1;
    int no2;

    void addition(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
        System.out.println("The addition of " + no1 + " and " + no2 + " is : " + (no1 + no2));
    }

    void subtraction(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
        System.out.println("The subtraction of " + no1 + " and " + no2 + " is : " + (no1 - no2));
    }

    void multiplication(int no1, int no2) {
        this.no1 = no1;
        this.no2 = no2;
        System.out.println("The multiplication of " + no1 + " and " + no2 + " is : " + (no1 * no2));
    }

    void division(Float no1, Float no2) {
        System.out.println("The division of " + no1 + " and " + no2 + " is : " + (float) (no1 / no2));
    }
}