import java.util.Scanner;
class figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("Area: " + a);
    }

    public void dispVolume() {
        System.out.println("Volume: " + v);
    }
}

class Cone extends figure {
    double h, s;
    public void calcArea() {
        a = (h*r*s)+(h*r*s);
    }

    public void calcVolume() {
        v = (h*r*s);
    }
}

 class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cone cone = new Cone();
        System.out.println("Enter r,h,s:");
        cone.r = sc.nextDouble();
        cone.h =sc.nextDouble();
        cone.s = sc.nextDouble();

        cone.calcArea();
        cone.calcVolume();

        cone.dispArea();
        cone.dispVolume();
    }
}
