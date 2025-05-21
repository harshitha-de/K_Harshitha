package com.sample;


	import java.util.Scanner;

	public class Program1 {
	    double a, b;
	    String operation;

	    // Constructor
	    public Program1(double a, double b, String operation) {
	        this.a = a;
	        this.b = b;
	        this.operation = operation;
	    }

	    // Method to perform calculation
	    public void calculate() {
	        switch (operation.toLowerCase()) {
	            case "add":
	                System.out.println("Result: " + (a + b));
	                break;
	            case "subtract":
	                System.out.println("Result: " + (a - b));
	                break;
	            case "multiply":
	                System.out.println("Result: " + (a * b));
	                break;
	            case "divide":
	                if (b != 0) {
	                    System.out.println("Result: " + (a / b));
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	        }
	    }

	    // Main method to run the program
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input values
	        System.out.print("Enter value for a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Enter value for b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Enter operation (add, subtract, multiply, divide): ");
	        String operation = scanner.next();

	        // Create Calculator object and perform calculation
	        Program1 calc = new Program1(a, b, operation);
	        calc.calculate();

	        scanner.close();
	    }
	}



