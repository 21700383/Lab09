package edu.handong.csee.java.lab09;

import java.util.Scanner; // import scanner utility to get user input

/**
 * SalesReporter class. Contains main method and input method getData,
 * calculating method computeAverage, computeTightestSales, printResults
 * @author Admin
 *
 */
public class SalesReporter {
	
	private double highestSales = 0;
	private double averageSales = 0;
	private  SalesAssociate[] team;
	
	public void getData() {
		System.out.println("Enter the number of salesmen: ");
		Scanner myKeyboard = new Scanner(System.in);

		int numOfSalesmen = myKeyboard.nextInt();
		
		team = new SalesAssociate[numOfSalesmen];
		
		for(int i = 0; i < numOfSalesmen; i++) {
			System.out.println("Enter data for associate number" + (i+1) + ":");
			System.out.print("Name? ");
			myKeyboard.nextLine(); // eats enter
			String name = myKeyboard.nextLine();
			System.out.print("Sales? ");
			double sales = myKeyboard.nextDouble();
			team[i] = new SalesAssociate();
			team[i].setName(name);
			team[i].setSales(sales);
			
		}
	}
	
	public void computeAverage() {
		double sum = 0;
		
		for(int i = 0; i < team.length; i++) {
			sum = sum + team[i].getSales();
		}
		averageSales = sum / team.length;
	}
	
	public void computeTightestSales() {
		
		double highestSales = 0;
		
		for(int i = 0; i < team.length; i++) {
			if(highestSales < team[i].getSales())
				highestSales = team[i].getSales();
		}
		
		this.highestSales = highestSales;
	}	
	
	public void printResults() {
		
		System.out.println("Average sales per associate is $" + averageSales);
		System.out.println("The highest sales figure is $" + highestSales);
		
		System.out.println("Salesman who has the highest sales:");
		for(int i = 0; i < team.length; i++) {
			if(team[i].getSales() == highestSales) {
				System.out.println("Name: " + team[i].getName());
				System.out.println("Sales: " + team[i].getSales());
			}
		}
		
		System.out.println("The rest performed as followed:");
		for(int i = 0; i < team.length; i++) {
			if(team[i].getSales() != highestSales) {
				System.out.println("Name: " + team[i].getName());
				System.out.println("Sales: " + team[i].getSales());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalesReporter analyzer = new SalesReporter();
		analyzer.getData();
		analyzer.computeAverage();
		analyzer.computeTightestSales();
		analyzer.printResults();
		}

}
