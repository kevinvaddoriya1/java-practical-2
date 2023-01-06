import java.util.Scanner;

/* 1. create a class Purchase in which product_id, product_name, unit_price, total_qty, total_price are data members.
 * Take input from user and display result as following.
 * (Use static variable and static function concept)
 * PID  PNAME    PRICE  QTY  TOTAL  BILL_AMOUNT
 * P1   t-shirt    500    3   1500        1500
 * P2   cap        100    5    500        2000
 * P3   watch     2000    1   2000        4000
 * -------------------------------------------
 * Total Bill : 4000 rs
 */

public class ProductBill {
    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        String p_id[] = new String[4];
        String p_name[] = new String[3];
        int u_price[] = new int[3];
        int qty[] = new int[3];
        Purchase[] p = new Purchase[3];

        System.out.print("Enter product id : ");
        p_id[0] = scString.nextLine();
        System.out.print("Enter product name : ");
        p_name[0] = scString.nextLine();
        System.out.print("Enter unit price : ");
        u_price[0] = scInt.nextInt();
        System.out.print("Enter Qty : ");
        qty[0] = scInt.nextInt();

        System.out.print("Enter product id : ");
        p_id[1] = scString.nextLine();
        System.out.print("Enter product name : ");
        p_name[1] = scString.nextLine();
        System.out.print("Enter unit price : ");
        u_price[1] = scInt.nextInt();
        System.out.print("Enter Qty : ");
        qty[1] = scInt.nextInt();

        System.out.print("Enter product id : ");
        p_id[2] = scString.nextLine();
        System.out.print("Enter product name : ");
        p_name[2] = scString.nextLine();
        System.out.print("Enter unit price : ");
        u_price[2] = scInt.nextInt();
        System.out.print("Enter Qty : ");
        qty[2] = scInt.nextInt();

        System.out.println("PID \t\t PNAME \t\t PRICE \t\t QTY \t\t TOTAL \t\t BILL_AMOUNT");

        p[0] = new Purchase();
        p[0].setProductData(p_id[0], p_name[0], u_price[0], qty[0]);
        p[0].display();
        Purchase.setBillAmount();

        p[1] = new Purchase();
        p[1].setProductData(p_id[1], p_name[1], u_price[1], qty[1]);
        p[1].display();
        Purchase.setBillAmount();

        p[2] = new Purchase();
        p[2].setProductData(p_id[2], p_name[2], u_price[2], qty[2]);
        p[2].display();
        Purchase.setBillAmount();

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Total Bill : " + Purchase.BILL_AMOUNT + " rs");

        scInt.close();
        scString.close();
    }
}

class Purchase {
    
    String product_id;
    String product_name;
    int unit_price;
    int total_qty;
    int total_price;
    static int BILL_AMOUNT = 0;
    void setProductData (String id,String name,int price,int qty) {
        product_id = id;
        product_name = name;
        unit_price = price;
        total_qty = qty;
        total_price = unit_price * total_qty;
        BILL_AMOUNT = BILL_AMOUNT + total_price;

    }
    static void setBillAmount () {
        System.out.println(BILL_AMOUNT);
    }

    void display() {
        System.out.print(product_id + " \t\t " + product_name + " \t\t " + unit_price + " \t\t " + total_price + " \t\t " + total_qty + " \t\t ");
    }
}