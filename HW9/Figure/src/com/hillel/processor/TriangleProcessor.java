package com.hillel.processor;
import com.hillel.figure.*;

public interface TriangleProcessor{
    void typeDetermine(Triangle[] f);
    Triangle maxElDetermine(Triangle[] f);
    Triangle minElDetermine(Triangle[] f);
    int noOfArbitraries(Triangle[] t);
    int noOfEquilaterals(Triangle[] t);
    int noOfIsosceles(Triangle[] t);
    int noOfRectangulars(Triangle[] t);
}