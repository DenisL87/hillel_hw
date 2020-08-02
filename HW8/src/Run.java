public class Run {
    public static void main (String[] args){
        Point a = new Point (2, -3);
        Point b = new Point (-2, 3);
        Point c = new Point (0, 0);
        Point a1 = new Point (10, 15);
        Point b1 = new Point (-5, 32);
        Point c1 = new Point (36, -20);

        Triangle[] t = new Triangle[4];
        t[0] = new Triangle(a, b, c);
        t[1] = new Triangle(c1, a1, b1);
        t[2] = new Triangle(c, a1, b);
        t[3] = new Triangle(a, c, b1);
        Triangle newT = new Triangle(t);
        newT.figureTypeDetermine(t);

        Triangle nt = new Triangle(a, b, c);
    }
}
