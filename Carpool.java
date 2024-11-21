import java.util.Scanner;

public class Carpool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = sc.nextDouble();
        System.out.println("Enter cost per gallon:");
        double cost = sc.nextDouble();
        System.out.println("Enter fee:");
        double fee = sc.nextDouble();
        System.out.println("Enter toll:");
        int toll = sc.nextInt();

        Cal obj = new Cal();
        obj.costcalc(miles, cost, fee, toll);
    }
}

class Cal {
    static void costcalc(double miles, double cost, double fee, int toll) {
        double res = (miles * cost) + fee + toll;
        System.out.println("Total cost: " + res);
    }
}





