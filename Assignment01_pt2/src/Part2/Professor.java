package Part2;

import Part1.Professor.SCORE;

public class Professor { 
	
	private enum SCORE // ���� ����
	{ 
		AA, A, A0, B, B0, C, C0, D, D0, F
	}
	
	public Assignment makeAssignment(String subject, String question) // subject, question�� ���� ���ڷ� �޾Ƽ� Assignment Ŭ������ ��ü�� �����ϴ� �޼ҵ� 
	{
		return new Assignment(subject, question);
	}
	
	public String grading(Assignment assignment, Answer answer) // 0�� 10������ ������ ���� �޾ƿ� ���� SCORE ���� ���� �����ϴ� �޼ҵ� (���ڷ� Assignment ��ü�� Answer ��ü�� ������ ����� ���� ����)
	{ 
		return SCORE.values()[(int)(Math.random() * 10)].toString();
	}
	
}
