import java.util.Scanner;

abstract class figuree {
    double pi = 3.1420;

    public abstract void calArea();
    public abstract void calVol();
    public abstract void disArea();
    public abstract void disVol();
}

class Cone2 extends figuree {
    double n, s, h; // r=n s=slant height
    double a, v;

    public Cone2(double n, double s, double h) {
        this.n = n;
        this.s = s;
        this.h = h;
    }

    @Override
    public void calArea() {
        a = pi * n * s + pi * n * n; // Update instance variable a
    }

    @Override
    public void calVol() {
        v = (pi * n * n * h) / 3; // Update instance variable v
    }

    @Override
    public void disArea() {
        System.out.println("Area of Cone: " + a);
    }

    @Override
    public void disVol() {
        System.out.println("Volume of Cone: " + v);
    }
}

class Cylinder extends figuree {
    double n, h, a, v;

    public Cylinder(double n, double h) {
        this.n = n;
        this.h = h;
    }

    @Override
    public void calArea() {
        a = 2 * pi * n * h + 2 * pi * n * n; // Update instance variable a
    }

    @Override
    public void calVol() {
        v = pi * n * n * h; // Update instance variable v
    }

    @Override
    public void disArea() {
        System.out.println("Area of Cylinder: " + a);
    }

    @Override
    public void disVol() {
        System.out.println("Volume of Cylinder: " + v);
    }
}

class Sphere extends figuree {
    double n, a, v;

    public Sphere(double n) {
        this.n = n;
    }

    @Override
    public void calArea() {
        a = 4 * pi * n * n; // Update instance variable a
    }

    @Override
    public void calVol() {
        v = (4 / 3) * pi * n * n * n; // Update instance variable v
    }

    @Override
    public void disArea() {
        System.out.println("Area of Sphere: " + a);
    }

    @Override
    public void disVol() {
        System.out.println("Volume of Sphere: " + v);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter h, n, s:");
        double h = sc.nextDouble();
        double n = sc.nextDouble();
        double s = sc.nextDouble();

        Cone2 cone = new Cone2(n, s, h);
        cone.calArea();
        cone.calVol();
        cone.disArea();
        cone.disVol();

        Sphere sphere = new Sphere(n);
        sphere.calArea();
        sphere.calVol();
        sphere.disArea();
        sphere.disVol();

        Cylinder cylinder = new Cylinder(n, h);
        cylinder.calArea();
        cylinder.calVol();
        cylinder.disArea();
        cylinder.disVol();

        sc.close();
    }
}
