package Part2;

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
		GradeList gradeList[] = new GradeList[studentNum];
		GradeList copyList[] = new GradeList[studentNum];
		
		String question[] = { "1 + 1 = ?", "What is Velocity?", "What is this?" };
		String subject[] = { "Mathematics", "Physics", "Philosophy" };
		String solution[][] = {{ "1" , "Speed", "Computer" } , { "2" , "m/s" , "Apple" }, { "3", "I have no idea", "Iphone" }, { "4", "Running", "Nothing" }};
		
		student[0] = new Student("Kevin", 2021104233);
		student[1] = new Student("Judy", 2002548215);
		student[2] = new Student("Charlie", 1997487865);
		student[3] = new Student("Puth", 15048655);
		
		for (int i = 0; i < studentNum; ++i) {
			System.out.println(student[i].toString()); // �л��� ���� ���
			System.out.println("============================================");
			
			/* �л� ����ŭ ���Ҹ� ������ gradeList ��ü �迭 ���� */
			gradeList[i] = new GradeList();
			
			for (int j = 0; j < assignmentNum; ++j) {
				assignment[j] = professor.makeAssignment(subject[j], question[j]);
				/* (Part1) makeAssignment �޼ҵ� ȣ��� ������ Assignment ��ü�� assignment �迭�� ���� */
				answer[j][i] = student[i].makeAnswer(assignment[j], solution[i][j]);
				/* (Part1) makeAnswer �޼ҵ� ȣ��� ������ Answer ��ü�� answer �迭�� ���� */
				score[j][i] = professor.grading(assignment[j], answer[j][i]);
				/* (Part1) grading �޼ҵ� ȣ��� ������ solution ���ڿ��� score �迭�� ���� */
				gradeList[i].addNode(assignment[j], answer[j][i], score[j][i]);
				/* addNode �޼ҵ� ȣ��� ������ GradeNode ��ü�� gradeList Ŭ������ ���Ḯ��Ʈ�� ���� */
			}
			
			gradeList[i].printList(); // ������ ���Ḯ��Ʈ�� ù ������ ������ ������ ��� ������ ���
		}
	
		System.out.println("=============Copied GradeList===============");
		for (int k = 0; k < gradeList.length; k++) {
			copyList[k] = new GradeList(gradeList[k]); // Copy Constructor�� ���� ������ ������ gradeList ���� ����
			copyList[k].printList(); 
		}	
		
		System.out.println("Are the head nodes properly copied?");
		boolean val[] = new boolean[4];
		for (int n = 0; n < gradeList.length; n++) {
			val[n] = gradeList[n].head.equals(copyList[n].head);
		}
		System.out.println(val[0] && val[1] && val[2] && val[3]);
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
