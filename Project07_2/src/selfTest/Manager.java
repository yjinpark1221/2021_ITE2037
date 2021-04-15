package selfTest;

public class Manager extends Employee{

	private int officeNum;
	private String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public String toString() {
		return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + officeNum);
	}
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (this.getClass() != obj.getClass()) return false;
		Manager tmp = (Manager)obj;
		return super.equals(tmp) && this.officeNum == tmp.officeNum && this.team.equals(tmp.team);
	}
}
