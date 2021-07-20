package project;
import java.util.Scanner;
public class medical_parameteres extends bmi { //inheritence
	String Dyspnea;
	int N_count;   //Neutrophil count
	int L_count;	//lymphocyte count
	int CRP;
	  //C-reactive protein.
	

	
	medical_parameteres()
	{
		Dyspnea=null;
		N_count=0;                   //default Constructor
		L_count=0;
		CRP=0;
	}
	
	
	
	void Intitialize(String Dyspnea,int N_count,int L_count,float points)
	{
		this.Dyspnea=Dyspnea;
		this.N_count=N_count;
		this.L_count=L_count;
		this.points=points;
	}
	
	public void Inflammatory_Details_input () {
		Scanner sc = new Scanner(System.in);      //inputting the inflammatory details.
	    System.out.println("If you are facing shortness of breath at time of admission , Type -YES: ");
	     Dyspnea = sc.next();
	    System.out.println("Enter Neutrophil Count (per UL): ");
	     N_count =sc.nextInt();
	    System.out.println("Enter Lymphocyte Count (per UL)  ");
	     L_count = sc.nextInt();
	    System.out.println("Enter C- Reactive Protein. (CRP) (mg/L)  ");
	     CRP = sc.nextInt();
	   
	   
		}
	
	public void display() {                  //method overriding
		System.out.println("Patient has dyspnea ------------------>"+ Dyspnea );
		System.out.println("The Neutrophil Count is-----------------> "+ N_count);
		System.out.println("The lymphocyte Count is------------------> "+ L_count);
		System.out.println("The C-Reactive Protein Count is-----------> "+ CRP);
		System.out.println("The Inflammatory Points are-----------------------------> "+ points);
	   }
	

	public float isDyspnea(String str)
	{
		if(str.equals("yes"))
			return (float) 3.5;
		else
		 return (float)0;
		
	}
	
	public float isN(int n)
	{
		if(n>=8000)
			return (float) 3.0;
	
		 return (float)0;
		
	}
	
	public float isL(int l)
	{
		if(l<1000)
			return (float) 1.5;
	
		 return (float)0;
		
	}
	
	public float isCrp(int c)
	{
		if(c>=100 && c<200)
			return (float) 2.0;
		else if(c>=200)
		 return (float)5.5;
		
		return (float)0;
		
	}
	
	
	
	public float inflammatory_points(String Dyspnea,int N_count,int L_count,int CRP)
	{
	
		
			points=(float)(isDyspnea(Dyspnea)+isN(N_count)+isL(L_count)+isCrp(CRP));
			//System.out.println(points);
		
		
		
		return points;
	}
	
	
}
