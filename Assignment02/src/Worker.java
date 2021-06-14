import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.io.*;

public class Worker {
	
	ArrayList<Member> MemberList = new ArrayList<Member> ();
	
	public Worker() 
	{
		MemberList.add(new Director("Sam", "director", "Busan", 3650.50));
		MemberList.add(new Director("Cliff", "full-time", "Seoul", 2453.15));
		MemberList.add(new Employee("Kim", "intern", "America", 1548.15));
		MemberList.add(new PartTime("Takuya", "temporary", "China", 12.50));
		MemberList.add(new PartTime("Mike", "temporary", "Japan", 12.50));
		MemberList.add(new Helper("Hong", "volunteer"));
		for (Member m : MemberList) {
			if (m instanceof Director) {
				Director d = (Director)m;
				d.awardBonus(300);
			}
			else if (m instanceof PartTime) {
				PartTime p = (PartTime) m;
				p.addHours(35);
			}
		}
	 } 
	
	public void fireSam()
	{
		for (Member m : MemberList) {
			if (m.getName().equals("Sam")) {
				MemberList.remove(m);
				System.out.println("Bye Sam");
				return;
			}
		}
	}
	
	 public void payoff() {
		 PrintWriter outputStream = null;
		 try {
			 outputStream = new PrintWriter(new FileOutputStream("MemberList.txt"));
		 }
		 catch (FileNotFoundException e) {
			 System.out.println("Error openning the file MemberList.txt");
			 System.exit(0);
		 }
		 for (Member m : MemberList) {
			 System.out.println(m);
			 outputStream.println(m);
			 double p = m.pay();
			 if (p != 0) {
				 System.out.println("Paid: " + p);
				 outputStream.println("Paid: " + p);
			 }
			 else {
				 System.out.println("Thank you!");
				 outputStream.println("Thank you!");
			 }
			 System.out.println("-----------------------------------");
			 outputStream.println("-----------------------------------");
		 }
		 outputStream.close();
	 }
	 
	 public void memberSort() 
	 {
		 Collections.sort(MemberList);
		 System.out.println("\nSorted Name:");
		 for (Member m : MemberList) {
			 System.out.println(m.getName());
		 }
	 }
}

