public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double sideAB;
    private double sideAC;
    private double sideBC;
    private double perimeter;
    private double area;

    Triangle (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        sideAB = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        sideAC = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
        sideBC = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        perimeter = sideAB + sideAC + sideBC;
        area = findArea();
    }

    private double findArea(){
        double halfPerimeter = perimeter / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter - sideAC) * (halfPerimeter - sideBC));
    }
    public void setA(Point a){
        this.a = a;
    }
    public void setB(Point b){
        this.b = b;
    }
    public void setC(Point c){
        this.c = c;
    }
    public Point getA(){
        return a;
    }
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }
    public double getSideAB(){
        return sideAB;
    }
    public double getSideAC(){
        return sideAC;
    }
    public double getSideBC(){
        return sideBC;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
}