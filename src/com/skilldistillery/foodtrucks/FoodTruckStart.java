package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTruck[] truck = new FoodTruck[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Food Truck Reviewer 5000" + ", you may review up to 5 trucks "
				+ "enter up to 5 new trucks or enter 'quit' when you are finished:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Name: ");
			if (sc.hasNext("quit"))
				quit();

				String name = sc.next();

				System.out.print("Food: ");
				String food = sc.next();

				System.out.print("Score (0 to 5): ");
				int rated = sc.nextInt();

				FoodTruck t = new FoodTruck();
				t.setName(name);
				t.setFood(food);
				t.setRated(rated);
				truck[i] = t;

				t.displayFoodTruck();

				t.toString();

			}
			printMenu();{
				int i = sc.nextInt();
				if(i == 1); System.out.println(truck.toString());
				if(i == 4);System.exit(0);
				
			}

		

		sc.close();
	}

	public static void printMenu() {
		System.out.println("Select an option and enter your integer choice: ");
		System.out.println("1: List all food trucks");
		System.out.println("2: Average rating of food trucks");
		System.out.println("3: Display highest-rated food truck");
		System.out.println("4: Quit");

		// Put the user in a loop until they enter a valid option
//		boolean calcDone = false;
//		do {
//			System.out.print("Enter (C) to calculate the average ratings for all Food Trucks (E) to exit: ");
//			String cOrE = sc.next();
//			switch (cOrE) {
//			case "C":
////          double arating = avg(FoodTruck[]);
//          System.out.println("Average Rating for all Food Trucks is " + arating);
//				calcDone = true;
//				break;
//			case "E":
//				System.out.println("Exiting...");
//				break;
//			}
//		} while (calcDone == false);

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

//	}

//	private static void displayFoodTruck() {
		// TODO Auto-generated method stub

	}

	private static void quit() {
		{
			System.out.println("Test Quit");
			printMenu();
			;
		} // TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}// main
}// class
//FoodTruckStart()

// FoodTruckQuit() - "Thank you for playing Food Truck Life"
//https://github.com/SkillDistillery/SD24/blob/master/java1/FoodTrucks/README.md
