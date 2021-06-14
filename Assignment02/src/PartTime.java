
public class PartTime extends Employee { 
 
	private int hoursWorked; 
	
	public PartTime (String name, String position, String residence, double rate) 
	{ 
		super(name, position, residence, rate);
		hoursWorked = 0;
	}
	
	public int getHoursWorked() 
	{
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}

	public void addHours (int moreHours) 
	{ 
		hoursWorked += moreHours;
	}
	public double pay() 
	{ 
		double res = payRate * hoursWorked;
		hoursWorked = 0;
		return res;
	} 
	
	public String toString() 
	{ 
		return super.toString() + "\nCurrent hours: " + hoursWorked;
	} 
} 