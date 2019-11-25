package com.skilldistillery.foodtrucks;

public class FoodTruckLot {
	private FoodTruck[] trucks;
	private int numTrucks = 0;

	final private static int MAX_TRUCKS = 10;

	public FoodTruckLot() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}

	public void addFoodTruck(FoodTruck t) {
		trucks[numTrucks] = t;
		numTrucks++; // increment to reflect that we have one more car
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] truckCopy;
		truckCopy = new FoodTruck[numTrucks];
		for (int i = 0; i < numTrucks; i++) {
			truckCopy[i] = trucks[i];
		}

		return truckCopy;
	}
}
