package com.skilldistillery.foodtrucks;

public class FoodTruck {
	public int tID;
	public String name;
	public String food;
	public double rated;
		
	public FoodTruck() {
		
//		int tID;
//		String name;
//		String food;
//		double rated;		
	}
	
	
	public FoodTruck(int tID, String name, String food, double rated) {
		this.tID = tID;
		this.name = name;
		this.food = food;
		this.rated = rated;		
	}
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getRated() {
		return rated;
	}
	public void setRated(double rated) {
		this.rated = rated;
	}
	

	  public String toString() {
	    String output = "tID=" + tID + "name=" + name + ", food=" + food + ", rated=" + rated;
	    return output;
	  }

	  public void displayFoodTruck() {
	    String truckData = this.toString();
	    System.out.println(truckData);
	  
	}
}
	

	  
//	  final private static int MAX_TRUCKS = 10;
//	  
//	  public FoodTruck () {
//	    trucks = new FoodTruck[MAX_TRUCKS];
//	  }
//	  public void addTruck(FoodTruck t) {
//	    trucks[numTrucks] = t;
//	    numTrucks++;    // increment to reflect that we have one more car
//	  }
//	  
//	  public FoodTruck[] getTrucks() {
//	    FoodTruck[] truckCopy;
//	   truckCopy = new FoodTruck[numTrucks];
//	    for(int i=0; i < numTrucks; i++) {
//	      truckCopy[i] = trucks[i];
//	    }
//	    
//	    return truckCopy;
//System.out.println(trucks);




	//flds
	//String TID = new TruckId
	
	//ctor
	
	
	//meth
	//public void foodTruck() {int TID, String "name", String "food", double rated}
//	FoodTruck is created, its constructor assigns its 
//	id field the current value of a static field 
//	(such as (nextTruckId) and then increments 
//			the static field.

	//	FoodTruck class with fields for a unique numeric id,
	//  a name ("TacoRific", etc.)
	//  food type ("Tacos", "Falafel", etc.), 
	//  a numeric rating.
