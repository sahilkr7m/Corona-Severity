package project;

public class Mainclass extends Thread{  //multi-threading

	//private static final String String = null;

	public static void main( String args[] ) throws InterruptedException, invalid_input_Exception
    {
      
	float sum_points;	
	System.out.println("<----------------Welcome to Corona-Severity portal-------------------->");
	System.out.println("This portal will tell based on your medical reports and patient details if you need hospitalization or not");
	System.out.println("The details taken by this portal will assign points according to the medical data ");
	System.out.println("According to the overall points");
	System.out.println("≤6 points: low risk  	Outpatient management may be possible.a \r\n"
			+ ">6 and ≤14 points: intermediate risk 	Consider hospitalization.a \r\n"
			+ " 	Outpatient management may be possible with close monitoring. \r\n"
			+ ">14 points: high risk 	Hospitalization required. Consider specific therapies (eg, dexamethasone, remdesivir). \r\n"
			+ " ");
	bmi a= new bmi(); //Declaring Objects
	patient_details b= new patient_details();
	medical_parameteres c= new medical_parameteres();
	
	System.out.println("We will first be Calculating the Bmi of Patient");
	a.calculate_bmi();
	a.bmi_points();
	
	a.display();
	Thread.sleep(3000);                   //Threading
	
	System.out.println("Now we will input patient details:- ");
	b.Details_input();
	//System.out.println();

	//b.display();


	float ans=b.details_points(b.age,b.gender);
	System.out.println(ans);
	b.display();
	Thread.sleep(3000);
	c.Inflammatory_Details_input();
	float ans2=c.inflammatory_points(c.Dyspnea,c.N_count,c.L_count,c.CRP);
	System.out.println("The Inflammatory points are"+ ans2);
	c.display();
	Thread.sleep(5000);
	System.out.println("--------Wait while the results are loading--------");
	Thread.sleep(10000);
	sum_points=a.bmi_points()+b.details_points(b.age, b.gender)+c.inflammatory_points(c.Dyspnea, c.N_count, c.L_count, c.CRP); //objects as parameter
	System.out.println("The total points are------------>"+ sum_points);
	final_points(sum_points);
    }
	
	public static void final_points(float sum_points) throws invalid_input_Exception{
	
		if(sum_points<=6)
		{
			System.out.println("Low Risk _________--------No need to consider Hospitalization ");
		}
		else if(sum_points>6 && sum_points<=14)
		{
			System.out.println("Consider hospitalization.a \r\n"
				+ " 	Outpatient management may be possible with close monitoring. ");
		}
		else if(sum_points>14)
		{
			System.out.println("High Risk ____________--------Hospitalization required. Consider specific therapies (eg, dexamethasone, remdesivir). \r\n"
				+ "");
		}
		else
		{
			throw new invalid_input_Exception("Something went Wrong");
		}
	
	
    }
    
	
	
	
}
