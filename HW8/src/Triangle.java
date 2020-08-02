public class Triangle {
    Point a, b, c;
    double sideAB, sideAC, sideBC, perimeter, area;

    Triangle (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        sideAB = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        sideAC = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        sideBC = Math.sqrt(Math.pow(b.x - c.x, 2) + Math.pow(b.y - c.y, 2));
        perimeter = sideAB + sideAC + sideBC;
        area = findArea();
    }
    Triangle (Triangle[] t){

    }

    double findArea(){
        double halfPerimeter = perimeter / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideAB) * (halfPerimeter - sideAC) * (halfPerimeter - sideBC));
    }
    Triangle[] equilateral = new Triangle[0];
    Triangle[] isosceles = new Triangle[0];
    Triangle[] rectangular = new Triangle[0];
    Triangle[] arbitrary = new Triangle[0];
    void figureTypeDetermine (Triangle[] t){
        for(Triangle tr : t){
            if(tr.sideBC == tr.sideAB & tr.sideAB == tr.sideAC){
                equilateral = tr.extendArr(equilateral, tr);
            }
            else if((tr.sideAB == tr.sideAC & tr.sideAB != tr.sideBC) |
                    (tr.sideAC == tr.sideBC & tr.sideAC != tr.sideAB) |
                    (tr.sideAB == tr.sideBC & tr.sideAB != tr.sideAC)){
                isosceles = tr.extendArr(isosceles, tr);
            }
            else if(Math.pow(tr.sideAB, 2) == Math.pow(tr.sideAC, 2) + Math.pow(tr.sideBC, 2) &
                    Math.pow(tr.sideAC, 2) == Math.pow(tr.sideAB, 2) + Math.pow(tr.sideBC, 2) &
                    Math.pow(tr.sideBC, 2) == Math.pow(tr.sideAC, 2) + Math.pow(tr.sideAB, 2)){
                rectangular = tr.extendArr(rectangular, tr);
            }
            else if (tr.sideAB != tr.sideBC & tr.sideBC != tr.sideAC & tr.sideAC != tr.sideAB){
                arbitrary = tr.extendArr(arbitrary, tr);
            }
        }

    }

    Triangle[] extendArr(Triangle[] tr, Triangle t){
        Triangle [] newArr = new Triangle[tr.length + 1];
        for (int i = 0; i < tr.length; i++) {
            newArr[i] = tr[i];
        }
        newArr[tr.length] = t;
        return newArr;
    }
}
