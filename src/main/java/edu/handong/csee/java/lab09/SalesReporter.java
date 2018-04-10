package edu.handong.csee.java.lab09;

import java.util.Scanner; // import scanner utility to get user input

/**
 * SalesReporter class. Contains main method and input method getData,
 * calculating method computeAverage, computeTightestSales, printResults
 * @author Admin
 *
 */
public class SalesReporter { // declare class
	
	private double highestSales = 0; // set highestSales as private double and set the value as 0
	private double averageSales = 0; // set averageSales as private double and set the value as 0
	private  SalesAssociate[] team; // set team as array of private SalesAssociate constructor type
	
	/**
	 * getData method which tells the user to input the number of salesmen, then for that amount of salesmen,
	 * makes the user to input the name and sales of each salesman and store them.
	 */
	public void getData() { // declare method
		System.out.println("Enter the number of salesmen: "); // tell the user to input number of salesmen
		Scanner myKeyboard = new Scanner(System.in); // to get input from user keyboard

		int numOfSalesmen = myKeyboard.nextInt(); // get the next integer input from the keyboard
		
		team = new SalesAssociate[numOfSalesmen]; // create input number of arrays with SalesAssociate type and name it as team
		
		for(int i = 0; i < numOfSalesmen; i++) { // make a loop which repeats until reaching numOfSalesmen
			System.out.println("Enter data for associate number" + (i+1) + ":"); // tell user to input data for nth salesman
			System.out.print("Name? "); // tell user to input name
			myKeyboard.nextLine(); // eats enter
			String name = myKeyboard.nextLine(); // get user input for name as string
			System.out.print("Sales? "); // tell user to input sales
			double sales = myKeyboard.nextDouble(); // get user input for sales as double
			team[i] = new SalesAssociate(); // construct salesman's data
			team[i].setName(name); // set salesman's name from user input
			team[i].setSales(sales); // set salesman's sales from user input
			
		}
	}
	/**
	 * computeAverage method which computes the average sales of salesmen as a whole team.
	 */
	public void computeAverage() { //declare method
		double sum = 0; // declare sum as double and set it as 0;
		
		for(int i = 0; i < team.length; i++) { // make a loop which repeats until reaching the last member of team
			sum = sum + team[i].getSales(); // equation for sum of entire sales from all salesmen
		}
		averageSales = sum / team.length; // equation for average sale of all salesmen, stored as averageSales
	}
	/**
	 * computeTightestSales method which compute to find the salesman with highest sales.
	 */
	public void computeTightestSales() { // declare method
		
		double highestSales = 0; // declare local highestSales as double and set it as 0;
		
		for(int i = 0; i < team.length; i++) { // make a loop which repeats until reaching the last member of team
			if(highestSales < team[i].getSales()) // if the sales of the current salesman is higher than higestSales
				highestSales = team[i].getSales(); // the salesman's sales is the new highestSales
		}
		
		this.highestSales = highestSales; // set the highestSales as the highest sales found.
	}	
	/**
	 * printResults method which will print the computed data of average sales, highest sales and
	 * data of salesman with highest sales and data of rest of the salesmen.
	 */
	public void printResults() {
		
		System.out.println("Average sales per associate is $" + averageSales); // print the average sales
		System.out.println("The highest sales figure is $" + highestSales);// print the highest sales
		
		System.out.println("Salesman who has the highest sales:");  // print who has the highest sales
		for(int i = 0; i < team.length; i++) { // loop which repeats until reaching the last member of team to find the person with highest sales
			if(team[i].getSales() == highestSales) { // if the salesman's sales matches the highestSales
				System.out.println("Name: " + team[i].getName()); // print the salesman's name
				System.out.println("Sales: " + team[i].getSales()); // print the salesman's sales
			}
		}
		
		System.out.println("The rest performed as followed:"); // print for the rest of the salesmen
		for(int i = 0; i < team.length; i++) { // loop which repeats until reaching the last member of team for the rest of the salesmen
			if(team[i].getSales() != highestSales) { // if the salesman's sales doesn't match the highestSales
				System.out.println("Name: " + team[i].getName()); // print the salesman's name
				System.out.println("Sales: " + team[i].getSales()); // print the salesman's sales
			}
		}
	}
	
	public static void main(String[] args) { // declare static method
		// TODO Auto-generated method stub

		SalesReporter analyzer = new SalesReporter(); // set analyzer to the structure of SalesReporter class
		analyzer.getData(); // call getData in SalesReporter
		analyzer.computeAverage(); // call computeAverage in SalesReporter
		analyzer.computeTightestSales(); // call computeTighestSales in SalesReporter
		analyzer.printResults(); // call printResults in SalesReporter
		}

}
