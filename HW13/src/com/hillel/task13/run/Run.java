package com.hillel.task13.run;
import com.hillel.task13.list.*;

public class Run {
    public static void main (String[] args){
        List list = new List();
        list.add("dfghjkl");
        list.add(95);
        list.add('t');
        list.add(true);
        list.print();

        System.out.println();
        Character [] arr = {89, 87, 555, 41, 45};
        List arrList = new List(arr);
        arrList.print();
    }
}
