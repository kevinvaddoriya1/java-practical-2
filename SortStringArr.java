import java.util.Scanner;

public class SortStringArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String name[] = new String[n];
        System.out.println("Enter five names : ");
        for(int i = 0;i<n;i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("Before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
        //logic
        for(int i = 0 ; i< n;i++) {
            for (int j = i+1; j < n; j++) {
                if (name[i].compareTo(name[j])>0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("After sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
        sc.close();
    }
}
