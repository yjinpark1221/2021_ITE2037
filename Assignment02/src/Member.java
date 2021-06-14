abstract public class Member implements Comparable {
	
	protected String name; 
	protected String position; 
	
	public Member(String name, String position) 
	{
		this.name = name;
		this.position = position;
	} 
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPosition() 
	{
		return position;
	}

	public void setPosition(String position) 
	{
		this.position = position;
	}

	public String toString() 
	{
		return "Name: " + name + "\nPosition: " + position;
	}
	
	public abstract double pay(); 
	
	public int compareTo(Object compareMember) 
	{
		if (compareMember == null)
			throw new NullPointerException("Object is null");
		if (!(compareMember instanceof Member))
			throw new ClassCastException("Object not of the same type");
		
		Member toCompare = (Member) compareMember;
		if (this.name.compareTo(toCompare.name) != 0) {
			return this.name.compareTo(toCompare.name);
		}
		return this.position.compareTo(toCompare.position);
	}
}
