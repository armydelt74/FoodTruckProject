package com.skilldistillery.foodtrucks;

public class FoodTruckCheck {

	private FoodTruckLot truckLot;

	{
		truckLot = new FoodTruckLot();
	}

	public void addFoodTruckToInventory(FoodTruck truck) {
		truckLot.addFoodTruck(truck);
	}

	public FoodTruck[] findFoodTrucksByName(String name) {
		FoodTruck[] trucksByName = null;
		FoodTruck[] trucks = truckLot.getTrucks();

		boolean[] matchingIndexes = new boolean[trucks.length];
		int numMatchingIndexes = 0;
		for (int i = 0; i < trucks.length; i++) {

			if (name.equals(trucks[i].gettID())) {
				matchingIndexes[i] = true;
				numMatchingIndexes++;
			}
		}

		// now loop through to see which indexes match
		// use a separate counter to keep track of which trucksByModel
		// index we are on
		trucksByName = new FoodTruck[numMatchingIndexes];
		int trucksByNameCounter = 0;
		for (int i = 0; i < matchingIndexes.length; i++) {
			if (matchingIndexes[i]) {
				trucksByName[trucksByNameCounter] = trucks[i];
				trucksByNameCounter++;
			}
		}

		return trucksByName;
	}

	public FoodTruck[] getAllFoodTrucks() {
		FoodTruck[] repoFoodTrucks = truckLot.getTrucks();

		// Stretch Goal:
		// return a copy of the array so that callers cannot modify repository data
		FoodTruck[] allFoodTrucks = new FoodTruck[repoFoodTrucks.length];
		for (int i = 0; i < repoFoodTrucks.length; i++) {
			allFoodTrucks[i] = repoFoodTrucks[i];
		}

		return allFoodTrucks;
	}// main
}// class
