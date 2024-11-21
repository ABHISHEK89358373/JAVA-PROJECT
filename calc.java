
import java.util.*;
public class calc {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    cac obj=new cac();
    int ch=0;

    do {
        System.out.println("Enter 1-add,2-diff,3-expo,4-prod");
        System.out.println("Enter choice:");
        ch=sc.nextInt();


        switch (ch) {
            case 1:
                cac.sum(a, b);
                break;
            case 2:
                cac.diff(a, b);
                break;
            case 3:
                cac.exp(a, b);
                break;
            case 4:
                cac.prod(a, b);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }

    }while(ch<=4);
}}
class cac{
public static void sum(int a, int b) {
    int res=a+b;
}
public static void diff(int a,int b) {
    int res = a - b;
    System.out.println(res);
}
public static void prod(int a,int b){
    int res=a*b;
    System.out.println(res);
}
public static void exp(int a ,int b) {
    double res = Math.pow(a, b);
    System.out.println(res);
  }
}

