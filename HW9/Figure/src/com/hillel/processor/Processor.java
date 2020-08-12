package com.hillel.processor;
import com.hillel.figure.Triangle;

public class Processor implements TriangleProcessor{
    public Triangle[] equilateral = new Triangle[0];
    public Triangle[] isosceles = new Triangle[0];
    public Triangle[] rectangular = new Triangle[0];
    public Triangle[] arbitrary = new Triangle[0];

    public void typeDetermine(Triangle[] t){
        for(Triangle tr : t){
            if (tr.getSideBC() == tr.getSideAB() & tr.getSideAB() == tr.getSideAC()) {
                equilateral = extendArr(equilateral, tr);
            }else if((tr.getSideAB() == tr.getSideAC() & tr.getSideAB() != tr.getSideBC()) |
                     (tr.getSideAC() == tr.getSideBC() & tr.getSideAC() != tr.getSideAB()) |
                     (tr.getSideAB() == tr.getSideBC() & tr.getSideAB() != tr.getSideAC())){
                isosceles = extendArr(isosceles, tr);
            }else if(Math.pow(tr.getSideAB(), 2) == Math.pow(tr.getSideAC(), 2) + Math.pow(tr.getSideBC(), 2) |
                     Math.pow(tr.getSideAC(), 2) == Math.pow(tr.getSideAB(), 2) + Math.pow(tr.getSideBC(), 2) |
                     Math.pow(tr.getSideBC(), 2) == Math.pow(tr.getSideAC(), 2) + Math.pow(tr.getSideAB(), 2)){
                rectangular = extendArr(rectangular, tr);
            }else if (tr.getSideAB() != tr.getSideBC() & tr.getSideBC() != tr.getSideAC() &
                      tr.getSideAC() != tr.getSideAB()){
                arbitrary = extendArr(arbitrary, tr);
            }
        }
    }
    public Triangle maxElDetermine(Triangle[] tr){
        Triangle t = tr[0];
        for (int i = 0; i < tr.length; i++){
            if (tr[i].getArea() > t.getArea() & tr[i].getPerimeter() > t.getPerimeter()){
                t = tr[i];
            }
        }
        return t;
    }
    public Triangle minElDetermine(Triangle[] tr){
        Triangle t = tr[0];
        for (int i = 0; i < tr.length; i++){
            if (tr[i].getArea() < t.getArea() & tr[i].getPerimeter() < t.getPerimeter()){
                t = tr[i];
            }
        }
        return t;
    }
    private Triangle[] extendArr(Triangle[] tr, Triangle t){
        Triangle [] newArr = new Triangle[tr.length + 1];
        for (int i = 0; i < tr.length; i++) {
            newArr[i] = tr[i];
        }
        newArr[tr.length] = t;
        return newArr;
    }
    public void toString (Triangle t){
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter() + "\n");
    }
}