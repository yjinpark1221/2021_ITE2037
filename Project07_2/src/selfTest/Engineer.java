package selfTest;

public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name, employeeNum);
		this.workZone = workZone;
		this.project = project;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) return false;
		else if (this.getClass() != obj.getClass()) return false;
		Engineer tmp = (Engineer) obj;
		return super.equals(tmp) && this.workZone.equals(tmp.workZone);
		
	}
	
	public String toString() {
		return "Name : " + getName() + "\nEmp# : " + getEmployeeNum() + "\nLocation : " + getDepartment() + ", " + workZone;
	}
}
