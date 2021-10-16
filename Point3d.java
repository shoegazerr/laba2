public class Point3d extends Point2d { /////наследуем поинт2д берем х и у и добавляем z
    //координата z
    private double zCoord;
    //конструктор инициализации
    public Point3d(double x, double y, double z){
        this.setX(x);
        this.setY(y);
        zCoord = z;
    }
    //конструктор по умолчанию
    public Point3d(){
        this(0,0,0);
    }
    //возвращение координаты z
    public double getZ(){
        return zCoord;
    }  // пример инкапсуляции
    //установка значения координаты z
    public void setZ(double val){
        zCoord = val;
    }
    public static void main(String[] args){
        Point3d myDot = new Point3d(1,3,4);
        Point3d mySecDot = new Point3d();
        Point3d myThirdDot = new Point3d();
        System.out.println(sameDots(myDot,mySecDot));
        System.out.println(sameDots(myThirdDot,mySecDot));
        System.out.println(myDot.distanceTo(mySecDot));
    }
    public static boolean sameDots(Point3d d1, Point3d d2){ //одинаковые ли точки
        return (d1.getX()==d2.getX()&&d1.getY()==d2.getY()&&d1.getZ()==d2.getZ());
    }
    public double distanceTo(Point3d d){ //расстояние
        double distance = Math.sqrt(Math.pow(this.getX()-d.getX(), 2)+Math.pow(this.getY()-d.getY(), 2)
                +Math.pow(this.getZ()-d.getZ(), 2));
        distance = distance*100;
        distance = Math.round(distance)/100.d;
        return distance;
    }
}

