package Part1;

// repository 2���� �迭�� ���Ḯ��Ʈ�� �����ϴ� ���� �޼��带 �����ϴ� Ŭ����
public class Git { 
	
	private static int assignmentNum = 3; // ���� ��
	private static int studentNum = 4; // �л� ��
	private static GradeNode repository[][]; // GradeNode ��ü�� ��� 2���� �迭
	
	public Git() // ����� repository �迭 ���ҿ� GradeNode ��ü�� �����ϴ� ������ 
	{
		repository = new GradeNode[assignmentNum][studentNum];
		for (int i = 0; i < assignmentNum; ++i) {
			for (int j = 0; j < studentNum; ++j) {
				repository[i][j] = new GradeNode();
			}
		}
	}
	
	public GradeNode pushGradeNode(Assignment assignment, Answer answer, String score) // ���ڷ� ���� Ŭ������ ������ GradeNode ��ü�� �����ؼ� �����ϴ� �޼ҵ�
	{
		return new GradeNode(assignment, answer, score);
	}
	
	public static void main(String[] args) {
		
		Git git = new Git();
		Professor professor = new Professor();
		Student student[] = new Student[studentNum];
		Assignment assignment[] = new Assignment[assignmentNum];
		Answer answer[][] = new Answer[assignmentNum][studentNum];
		String score[][] = new String[assignmentNum][studentNum];
		
		String question[] = { "1 + 1 = ?", "What is Velocity?", "What is this?" };
		String subject[] = { "Mathematics", "Physics", "Philosophy" };
		String solution[][] = {{ "1" , "Speed", "Computer" } , { "2" , "m/s" , "Apple" }, { "3", "I have no idea", "Iphone" }, { "4", "Running", "Nothing" }};

		student[0] = new Student("Kevin", 2021104233);
		student[1] = new Student("Judy", 2002548215);
		student[2] = new Student("Charlie", 1997487865);
		student[3] = new Student("Puth", 15048655);
		
		for (int i = 0; i < studentNum; ++i) {
			for (int j = 0; j < assignmentNum; ++j) {
				assignment[j] = professor.makeAssignment(subject[j], question[j]);
				/* makeAssignment �޼ҵ� ȣ��� ������ Assignment ��ü�� assignment �迭�� ���� */
				answer[j][i] = student[j].makeAnswer(assignment[j], solution[i][j]);
				/* makeAnswer �޼ҵ� ȣ��� ������ Answer ��ü�� answer �迭�� ���� */
				score[j][i] = professor.grading(assignment[j], answer[j][i]);
				/* grading �޼ҵ� ȣ��� ������ solution ���ڿ��� score �迭�� ���� */
				repository[j][i] = git.pushGradeNode(assignment[j], answer[j][i], score[j][i]);
				/* pushGradeNode �޼ҵ� ȣ��� ������ GradeNode ��ü�� repository 2���� �迭�� ���� */
			}
		}
		
		System.out.println(git.showRepository()); // repository 2���� �迭 ���
	}		
	public String showRepository() { // repository 2���� �迭 ��� �޼ҵ�
		String string = "\n";
		for (int i = 0; i < repository.length; i++) {
			string += "Solution: ";
			for (int j = 0; j < repository[i].length; j ++)
				string += String.format("%20s", repository[i][j].answer.getSolution());
			string += "\nScore:    ";
			for (int j = 0; j < repository[i].length; j++)
				string += String.format("%20s", repository[i][j].getScore());
			string += "\n\n";
		}
		return string;
	}
}
