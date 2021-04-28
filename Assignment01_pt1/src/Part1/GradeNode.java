package Part1;

public class GradeNode { 
	
	Assignment assignment; // ����
	Answer answer; // ������ ���� ��
	private String score; // ����
	
	public GradeNode() // ��� ������ null�� �ʱ�ȭ�ϴ� �⺻ ������
	{ 
		assignment = null;
		answer = null;
		score = null;
	}
	
	public GradeNode(Assignment assignment, Answer answer, String score) // nextNode�� ������ ��� ������ ���ڷ� ���� ������ �����ϴ� ������ (��, ���ڷ� ��ü�� ������ �� ��ü�� ��� ������ ����)
	{ 
		this.assignment = assignment;
		this.answer = answer;
		this.score = score;
	}
	
	public void setScore(String score)
	{ 
		this.score = score;
	}
	
	public String getScore() 
	{
		return score;
	}

	public boolean equals(GradeNode gradeNode) // ���ڷ� ���� ��ü�� �������� ������ Ȯ���ϴ� �޼ҵ�
	{
		return assignment.equals(gradeNode.assignment) && answer.equals(gradeNode.answer) && score.equals(gradeNode.score);
	}
	
	public String toString() // nextNode�� ������ ��� ������ ���� ����ϴ� toString() �޼ҵ带 �������̵� (������ ��ü�� ��� �ش� ��ü�� toString() �޼ҵ� ȣ��)
	{
		return assignment.toString() + answer.toString() + "Grade: " + score + "\n";
	}
}
