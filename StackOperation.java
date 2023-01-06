import java.util.Scanner;

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice=0;
        do{
            System.out.println("\n0.Exit\n1.Push\n2.Pop\n3.Display");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter element : ");
                    int a = sc.nextInt();
                    s.push(a);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Please enter valid choice...");
            }
        }while(choice != 0);
        sc.close();
    }
}

class Stack {
    int size=100;
    int top = -1;
    int arr[] = new int[size];
    void push(int a) {
        if (top == size-1) {
            System.out.println("Stack Overflow.");
        }
        else {
            top++;
            arr[top] = a;
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
        }
        else {
            top--;
            System.out.println("Element popped.");
        }
    }
    void display() {
        System.out.println("Stack is : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}