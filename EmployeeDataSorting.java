import java.util.Scanner;

public class EmployeeDataSorting {
    public static void main(String[] args) {
        int n = 3;
        Employee e[] = new Employee[n];
        Employee temp;
        for(int i = 0;i < n ; i++) {
            e[i] = new Employee();
        }
        System.out.println("Employee's data : ");
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
        System.out.println("Employee's data sorting by salary : ");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (e[i].salary > e[j].salary) {
                    temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
        System.out.println("Employee's data sorting by name : ");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((e[i].name).compareTo(e[j].name) < 0 ) {
                    temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
    }
}

class Employee {
    int id;
    String name;
    int salary;
    Employee() {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.print("Enter Employee id : ");
        id = scInt.nextInt();
        System.out.print("Enter Employee name : ");
        name = scString.nextLine();
        System.out.print("Enter Employee salary : ");
        salary = scInt.nextInt();
        scInt.close();
        scString.close();
    }
    void display() {
        System.out.println(id + "  " +name + "  "+salary);
    }
}