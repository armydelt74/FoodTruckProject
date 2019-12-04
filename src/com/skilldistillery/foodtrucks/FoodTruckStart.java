package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTruck[] truck = new FoodTruck[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Food Truck Reviewer 5000," + "\n" + " you may review up to 5 trucks "
				+ "\n or enter 'quit' when you are finished:");

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
		printMenu();
		{
			int i = sc.nextInt();
			if (i == 1) {
				allTruck(truck);
			}
			if (i == 4)
				;
			System.exit(0);

		}

		sc.close();
	}

	public static void printMenu() {
		System.out.println("Select an option and enter your integer choice: ");
		System.out.println("1: List all food trucks");
		System.out.println("2: Average rating of food trucks");
		System.out.println("3: Display highest-rated food truck");
		System.out.println("4: Quit");
	}

	public static void allTruck(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				trucks[i].displayFoodTruck();
			}
		}
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
//public static oldTrucks()
//		for (int i = 0; i < trucks.length; i++) {
//			if (trucks[i] != null) {	
	}

//	private static void displayFoodTruck() {
		// TODO Auto-generated method stub


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
