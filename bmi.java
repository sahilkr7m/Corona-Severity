
package project;

import java.util.Scanner;
interface In1
{
   //implementing interface
   
  
    // public and abstract 
    void display();
}

public class bmi implements In1 {

	public float points;
	float BMI;
	float weight;
	float height;

	bmi() {
		BMI = 0;
		height=0;
		weight=0;

		points = 0; // default constructor.
	}

	public void calculate_bmi() {
		
		
		
		try {
		System.out.println("Enter the Following details:-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input weight in kilogram: ");  //Exception Handling
		 weight = sc.nextFloat();
		System.out.println("\nInput height in meters: ");
		 height = sc.nextFloat();

		
			
		 BMI =  (weight / (height*height));
		 
		 System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
		 
		 
			
		} 
		catch (Exception e) {
			System.out.println("Reached into exception block" + e);
			
		}

	    
	    
	}
	public void display() {
		System.out.println("The height is-------------> "+ height);
		System.out.println("The weight is--------------> "+ weight );
		System.out.println("The BMI is------------------> "+ BMI);
		System.out.println("The points are "+ points);
	   }
	

	public int bmi_points() {
		if (BMI >= 25 && BMI < 30) {
			points = 2;
			System.out.println(points);
		} else if (BMI >= 30) {
			points = 3;
			System.out.println(points);
		} else {
			points = 0;
			System.out.println(points);

		}
		return (int) points;
	}

	
}
