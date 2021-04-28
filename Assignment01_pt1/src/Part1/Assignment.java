package Part1;

public class Assignment { 
	
	private String subject; // �����
	private String question; // ���� ����
	
	public Assignment() // ��� ������ ��None������ �ʱ�ȭ�ϴ� �⺻ ������
	{
		subject = "None";
		question = "None";
	}
	
	public Assignment(String subject, String question) // ��� ������ ���ڷ� ���� ������ �ʱ�ȭ�ϴ� ������
	{ 
		this.subject = subject;
		this.question = question;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	public String getSubject() 
	{
		return subject;
	}
	
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	
	public String getQuestion() 
	{
		return question;
	}
	
	public boolean equals(Assignment assignment) // ���ڷ� ���� ��ü�� �������� ������ Ȯ���ϴ� �޼ҵ�
	{
		return subject.equals(assignment.question) && question.equals(assignment.question);
	}
	
	public String toString() // subject, question�� ���� ����ϴ� toString() �޼ҵ带 �������̵�
	{
		return "Subject: " + subject + ", Question: " + question + "\n";
	}
	
}
