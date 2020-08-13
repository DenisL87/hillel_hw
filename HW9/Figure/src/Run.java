import com.hillel.processor.*;
import com.hillel.point.Point;
import com.hillel.figure.Triangle;

public class Run {
    public static void main (String[] args){
        Point a = new Point (-2, -1);
        Point b = new Point (4, -1);
        Point c = new Point (5, 4);
        Point a1 = new Point (2, 2);
        Point b1 = new Point (2, -1);
        Point c1 = new Point (-2, -1);

        Processor p = new Processor();

        Triangle[] t = new Triangle[4];
        t[0] = new Triangle(a, b, c);
        t[1] = new Triangle(c1, a1, b1);
        t[2] = new Triangle(c, a1, b);
        t[3] = new Triangle(a, c, b1);
        p.typeDetermine(t);

        if(p.equilateral.length > 0){
            System.out.println("The largest equilateral triangle:");
            p.toString(p.maxElDetermine(p.equilateral));
            System.out.println("The smallest equilateral triangle:");
            p.toString(p.minElDetermine(p.equilateral));
        }else{
            System.out.println("No equilateral triangles" + "\n");
        }
        if(p.isosceles.length > 0){
            System.out.println("The largest isosceles triangle:");
            p.toString(p.maxElDetermine(p.isosceles));
            System.out.println("The smallest isosceles triangle:");
            p.toString(p.minElDetermine(p.isosceles));
        }else{
            System.out.println("No isosceles triangles" + "\n");
        }
        if(p.rectangular.length > 0){
            System.out.println("The largest rectangular triangle:");
            p.toString(p.maxElDetermine(p.rectangular));
            System.out.println("The smallest rectangular triangle:");
            p.toString(p.minElDetermine(p.rectangular));
        }else{
            System.out.println("No rectangular triangles" + "\n");
        }
        if(p.arbitrary.length > 0){
            System.out.println("The largest arbitrary triangle:");
            p.toString(p.maxElDetermine(p.arbitrary));
            System.out.println("The smallest arbitrary triangle:");
            p.toString(p.minElDetermine(p.arbitrary));
        }else{
            System.out.println("No arbitrary triangles" + "\n");
        }
    }
}