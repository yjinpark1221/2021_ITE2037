package Part2;

public class GradeNode { 
	
	Assignment assignment; // ����
	Answer answer; // ������ ���� ��
	private String score; // ����
	GradeNode nextNode; // ���Ḯ��Ʈ�� ����� ���� ���
	
	public GradeNode() // ��� ������ null�� �ʱ�ȭ�ϴ� �⺻ ������
	{ 
		assignment = null;
		answer = null;
		score = null;
		nextNode = null;
	}

	public GradeNode(Assignment assignment, Answer answer, String score) // nextNode�� ������ ��� ������ ���ڷ� ���� ������ �����ϴ� ������ (��, ���ڷ� ��ü�� ������ �� ��ü�� ��� ������ ����)
	{ 
		this.assignment = new Assignment(assignment.getSubject(), assignment.getQuestion());
		this.answer = new Answer(answer.getSolution());
		this.score = score;
		nextNode = null;
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
		return assignment.equals(gradeNode.assignment) && answer.equals(gradeNode.answer) && score.equals(gradeNode.score) && ((nextNode == null && gradeNode.nextNode == null) || ((nextNode != null && gradeNode.nextNode != null) && nextNode.equals(gradeNode.nextNode))); 
	}
	
	public String toString() // nextNode�� ������ ��� ������ ���� ����ϴ� toString() �޼ҵ带 �������̵� (������ ��ü�� ��� �ش� ��ü�� toString() �޼ҵ� ȣ��)
	{
		return assignment.toString() + "\n" + answer.toString() + "\nGrade: " + score;
	}
}
