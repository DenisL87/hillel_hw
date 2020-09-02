package com.hillel.task13.run;
import com.hillel.task13.list.*;

public class Run {
    public static void main (String[] args){
        List list = new List();
        list.add("dfghjkl");
        list.add(95);
        list.add('t');
        list.print();

        System.out.println();
        list.exchange('t', "dfghjkl");
        list.print();
        System.out.println(list.noOfListElements());
    }
}
