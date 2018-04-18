package edu.handong.csee.java.lab09;

import java.util.ArrayList;
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
	private  ArrayList<SalesAssociate> team; // set team as Arraylist containing SalesAssociate 
	
	/**
	 * getData method which tells the user to input the number of salesmen, then for that amount of salesmen,
	 * makes the user to input the name and sales of each salesman and store them.
	 */
	public void getData() { // declare method
		System.out.println("Enter the number of salesmen: "); // tell the user to input number of salesmen
		Scanner myKeyboard = new Scanner(System.in); // to get input from user keyboard
		
		team = new  ArrayList<SalesAssociate>(); // create a new arraylist named team which contains structure group SalesAssociate
		
		boolean done = false; // define done which checks when the while loop will be finished
		
		while(done != true) { // make a loop which repeats until the wants to finish putting data
			int n = 0; // decleare i as int and set the value as 0
			n++; // increase value of i by 1
			System.out.println("Enter data for associate number" + n + ":"); // tell user to input data for nth salesman
			System.out.print("Name? "); // tell user to input name
			myKeyboard.nextLine(); // eats enter
			String name = myKeyboard.nextLine(); // get user input for name as string
			System.out.print("Sales? "); // tell user to input sales
			double sales = myKeyboard.nextDouble(); // get user input for sales as double
			SalesAssociate member = new SalesAssociate(); // create a new member with name and sales
			member.setName(name); // put input name into member
			member.setSales(sales); // put input sales into member
			team.add(member); // add a new member to the team
			System.out.println("Do you want to add new salesman?(Y/N)"); // ask the user if they want to add a new member or not
			myKeyboard.nextLine(); // get user input for Yes(Y) or No(N)
			if(myKeyboard.nextLine() == "N") // if the user input is N, which means no
				done = true; // the process is done and is ready to end the loop
			
		}
	}
	/**
	 * computeAverage method which computes the average sales of salesmen as a whole team.
	 */
	public void computeAverage() { //declare method
		double sum = 0; // declare sum as double and set it as 0;
		
		for(SalesAssociate member:team) { // make a loop which repeats until reaching the last member of team
			sum = sum + member.getSales(); // equation for sum of entire sales from all salesmen
		}
		averageSales = sum / team.size(); // equation for average sale of all salesmen, stored as averageSales
	}
	/**
	 * computeHightestSales method which compute to find the salesman with highest sales.
	 */
	public void computeHightestSales() { // declare method
		
		double highestSales = 0; // declare local highestSales as double and set it as 0;
		
		for(SalesAssociate member:team) { // make a loop which repeats until reaching the last member of team
			if(highestSales < member.getSales()) // if the sales of the current salesman is higher than higestSales
				highestSales = member.getSales(); // the salesman's sales is the new highestSales
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
		for(SalesAssociate member:team) { // loop which checks every member of team to find the person with highest sales
			if(member.getSales() == highestSales) { // if the salesman's sales matches the highestSales
				System.out.println("Name: " + member.getName()); // print the salesman's name
				System.out.println("Sales: " + member.getSales()); // print the salesman's sales
			}
		}
		
		System.out.println("The rest performed as followed:"); // print for the rest of the salesmen
		for(SalesAssociate member:team) { // loop which checks every member of team for the rest of the salesmen
			if(member.getSales() != highestSales) { // if the salesman's sales doesn't match the highestSales
				System.out.println("Name: " + member.getName()); // print the salesman's name
				System.out.println("Sales: " + member.getSales()); // print the salesman's sales
			}
		}
	}
	
	public static void main(String[] args) { // declare static method
		// TODO Auto-generated method stub

		SalesReporter analyzer = new SalesReporter(); // set analyzer to the structure of SalesReporter class
		analyzer.getData(); // call getData in SalesReporter
		analyzer.computeAverage(); // call computeAverage in SalesReporter
		analyzer.computeHightestSales(); // call computeTighestSales in SalesReporter
		analyzer.printResults(); // call printResults in SalesReporter
		}

}
