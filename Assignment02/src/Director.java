
public class Director extends Employee { 
	
	private double bonus; 
 
	public Director(String name, String position, String residence, double rate) 
	{ 
		super(name, position, residence, rate);
		bonus = 0;
	}

	public void awardBonus(double execBonus) 
	{ 
		bonus = execBonus;
	} 
	
	public double pay() 
	{ 
		double res = super.pay() + bonus;
		bonus = 0;
		return res;
	} 
} 