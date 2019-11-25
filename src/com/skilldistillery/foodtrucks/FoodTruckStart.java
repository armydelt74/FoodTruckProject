package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTruck[] truck = new FoodTruck[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Food Truck Reviewer 5000" + ", you may review up to 5 trucks "
				+ "enter 5 or quit when you are finished:");

		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Food: ");
		String food = sc.next();

		System.out.print("Score (0.0 to 5.0): ");
		double rated = sc.nextDouble();

		FoodTruck t = new FoodTruck();

		t.name = name;
		t.food = food;
		t.rated = rated;

		t.displayFoodTruck();

		// Put the user in a loop until they enter a valid option
		boolean calcDone = false;
		do {
			System.out.print("Enter (C) to calculate the average ratings for all Food Trucks (E) to exit: ");
			String cOrE = sc.next();
			switch (cOrE) {
			case "C":
//		          double arating = avg(rating);
//		          System.out.println("Average Rating for all Food Trucks is " + arating);
				calcDone = true;
				break;
			case "E":
				System.out.println("Exiting...");
				break;
			}
		} while (calcDone == false);

		sc.close();

//		  public static double avgRating(double rated) {
//		    double arating = sum all ratings / num ratings;
//		    return arating;

//		public int tID;
//		public String name;
//		public String food;
//		public double rated;
//
//		FoodTruck tc = new FoodTruck();
//		tc.tID = 1;
//		tc.name = "Taco Truck";
//		tc.food = "Tacos n' Tacos ";
//		tc.rated = 2.0;
//
//		FoodTruck tb = new FoodTruck();
//		tb.tID = 2;
//		tb.name = "Tegridy Burgers";
//		tb.food = " Goo Hemp Burger ";
//		tb.rated = 5.0;
//
//		FoodTruck kc = new FoodTruck();
//		kc.tID = 3;
//		kc.name = "Kansas Chicken ";
//		kc.food = " KC Chicken KC style ";
//		kc.rated = 3.0;
//
//		FoodTruck nn = new FoodTruck();
//		nn.tID = 4;
//		nn.name = "Nom Nom";
//		nn.food = " Nom Nom ";
//		nn.rated = 5.0;
//
//		FoodTruck sg = new FoodTruck();
//		sg.tID = 5;
//		sg.name = "Sage Grouse";
//		sg.food = " Gruff Grouse ";
//		sg.rated = 1.0;
//
//		truck[0] = tc;
//		truck[1] = tb;
//		truck[2] = kc;
//		truck[3] = nn;
//		truck[4] = sg;

	}// main
}// class
//FoodTruckStart()

// FoodTruckQuit() - "Thank you for playing Food Truck Life"
//https://github.com/SkillDistillery/SD24/blob/master/java1/FoodTrucks/README.md
