public class Point2d {
    //кордината Х
    private double xCoord; //инкапсуляция
    //координата У
    private double yCoord;  //
    //коструктор инициализации
    public Point2d(double x, double y){
        xCoord = x;
        yCoord = y;
    }
    //конструктор по умолчанию
    public Point2d(){
        this(0,0);
    }
    //возвращение координаты х
    public double getX(){
        return xCoord;
    }   //так как *Coord под private,
    //возвращение координаты у
    public double getY(){
        return yCoord;
    }   // "делаем ее доступной для других классов"
    //установка значения координаты х
    public void setX(double val){
        xCoord = val;
    }
    //установка значения координаты у
    public void setY(double val){
        yCoord = val;
    }
    public static void main(String[] args){
        Point2d myPoint = new Point2d();
        Point2d myOtherPoint = new Point2d(5,3);
        Point2d aThirdPoint = new Point2d();
        System.out.println(aThirdPoint==myPoint);//сравниваются ССЫЛКИ
        System.out.println(sameDots(aThirdPoint, myPoint));//сравниваются КООРДИНАТЫ
    }
    public static boolean sameDots(Point2d d1, Point2d d2){//метод для сравнения КООРДИНАТ
        return (d1.getX()==d2.getX()&&d1.getY()==d2.getY());
    }
}
