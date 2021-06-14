
public class Employee extends Member { 

	protected String residence; 
	protected double payRate; 
	
	public Employee(String name, String position, String residence, double rate) 
	{ 
		super(name, position);
		this.residence = residence;
		this.payRate = rate;
		
	}
	
	public String getResidence()
	{
		return residence;
	}
	
	public void setResidence(String residence) 
	{
		this.residence = residence;
	}
	
	public double getPayRate() 
	{
		return payRate;
	}

	public void setPayRate(double payRate) 
	{
		this.payRate = payRate;
	}

	public String toString() 
	{ 
		return super.toString() + "\nResidence: " + residence;
	} 
	
	public double pay() 
	{ 
		return payRate;
	}


} 