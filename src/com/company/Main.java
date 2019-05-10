package com.company;

import com.company.calculator.Calculator;
import com.company.calculator.Carpet;
import com.company.calculator.Floor;

public class Main {

    public static void main(String[] args) {
//		Point first = new Point(6,5);
//		Point second = new Point(3,1);
//		System.out.println("Point (" + first.getX() + "," + first.getY() + ") distance from (0,0)= " + first.distance());
//		System.out.println("Point (" + first.getX() + "," + first.getY() + ") distance from ("+ second.getX() + "," + second.getY() +")= " + first.distance(second));
//		System.out.println("Point (" + first.getX() + "," + first.getY() + ") distance from ("+2+","+2+")= " + first.distance(2,2));
//		Point point = new Point();
//		System.out.println("distance from ()= " + point.distance(6,5));

		Carpet carpet = new Carpet(-3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println(calculator.getTotalCost());

    }
}
