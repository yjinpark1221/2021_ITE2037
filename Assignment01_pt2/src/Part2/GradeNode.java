package Part2;

public class GradeNode { 
	
	Assignment assignment; // 과제
	Answer answer; // 과제에 대한 답
	private String score; // 점수
	GradeNode nextNode; // 연결리스트로 연결된 다음 노드
	
	public GradeNode() // 모든 변수를 null로 초기화하는 기본 생성자
	{ 
		assignment = null;
		answer = null;
		score = null;
		nextNode = null;
	}

	public GradeNode(Assignment assignment, Answer answer, String score) // nextNode를 제외한 모든 변수를 인자로 받은 값으로 생성하는 생성자 (단, 인자로 객체를 받으면 각 객체의 모든 변수를 전달)
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

	public boolean equals(GradeNode gradeNode) // 인자로 받은 객체의 변수값과 같은지 확인하는 메소드
	{
		return assignment.equals(gradeNode.assignment) && answer.equals(gradeNode.answer) && score.equals(gradeNode.score) && ((nextNode == null && gradeNode.nextNode == null) || ((nextNode != null && gradeNode.nextNode != null) && nextNode.equals(gradeNode.nextNode))); 
	}
	
	public String toString() // nextNode를 제외한 모든 변수의 값을 출력하는 toString() 메소드를 오버라이딩 (변수가 객체일 경우 해당 객체의 toString() 메소드 호출)
	{
		return assignment.toString() + "\n" + answer.toString() + "\nGrade: " + score;
	}
}
