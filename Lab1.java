import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Point3d[] myPoint = new Point3d[3]; //объявление массива из 3 объектов
        Scanner in = new Scanner(System.in);
        Point3d d1 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d d2 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d d3 = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        if(Point3d.sameDots(d1,d2)||Point3d.sameDots(d2,d3)||Point3d.sameDots(d1,d3))
            System.out.println("Какие-то точки совпадают. Невозможно посчитать площадь");
        else
            System.out.println(computeArea(d1,d2,d3));
    }

    public static double computeArea(Point3d d1, Point3d d2, Point3d d3) {
        double a,b,c,p;
        a= d2.distanceTo(d3);
        b= d1.distanceTo(d3);
        c= d1.distanceTo(d2);
        p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c)); // формула Герона
    }


}


