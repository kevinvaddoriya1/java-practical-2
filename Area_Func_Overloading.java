import java.util.Scanner;

public class Area_Func_Overloading {
    public static void main(String[] args) {
        int length,width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        length = sc.nextInt();
        System.out.print("Enter width : ");
        width = sc.nextInt();
        Area a = new Area();
        a.area(length);
        a.area(length, width);
        a.area((float)length, (float) width);
        sc.close();
    }
}

class Area {
    void area(int length) {
        System.out.println("Area of square is : " + (length * length));
    }
    void area(int length,int width) {
        System.out.println("Area of rectangle is : " + (length * width));
    }
    void area(float length, float width) {
        System.out.println("Area of triangle is : "+((length * width)/2));
    }
}