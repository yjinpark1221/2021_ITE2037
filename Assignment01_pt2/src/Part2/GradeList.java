package Part2;

public class GradeList { // GradeNode ��ü�� ���Ḯ��Ʈ�� ������ Ŭ����

	GradeNode head; // ���Ḯ��Ʈ�� ù ���
	
	public GradeList() // �⺻ �����ڴ� head ��带 null�� �ʱ�ȭ
	{ 
		head = null;
	}
	
	public GradeList(GradeList gradeList) // ���ڷ� ���� gradeList ���Ḯ��Ʈ�� �����ϴ� Copy Constructor ������
	{
		
		if (gradeList == null) // ���ڷ� ���� ���Ḯ��Ʈ�� �������� ���� ���
		{ 
			System.out.println("Nothing to copy");
			return;
		}
		
		/* ���� GradeList�� head ��ü�� ���� ��� head�� ���ڷ� ���� gradeList�� head�� ���� */
		if (head == null) {
			head = new GradeNode(gradeList.head.assignment, gradeList.head.answer, gradeList.head.getScore());
		}
		GradeNode to = head, from = gradeList.head.nextNode;
		for (; from != null; to = to.nextNode, from = from.nextNode) {
			to.nextNode = new GradeNode(from.assignment, from.answer, from.getScore());
		}
	}
	
	public void addNode(Assignment assignment, Answer answer, String score) // ���ڷ� ���� ���� �� ��ü��� ������ ��带 ���Ḯ��Ʈ�� �߰��ϴ� �޼ҵ�
	{ 
		GradeNode ngn = new GradeNode(assignment, answer, score);
		/* ���� GradeList�� head ��ü�� ���� ��� ���ڷ� ���� ���� �� ��ü��� ��� ���� */
		if (head == null) {
			head = ngn;
		}
		/* ���� ����� ���� ��尡 null�� �ƴ� ������ ���� ��带 �ű� �� ������ ����� ���� ��忡 ��� ���� �� ��ü ���� */
		else {
			GradeNode cur;
			for (cur = head; cur.nextNode != null; cur = cur.nextNode);
			cur.nextNode = ngn;
		}
	}
	
	public void printList() // ���Ḯ��Ʈ ��� �޼ҵ�
	{ 
		/* ����Ʈ�� ù ������ toString �޼ҵ带 ȣ���Ͽ� ��� */
		for (GradeNode cur = head; cur != null; cur = cur.nextNode) {
			System.out.println(cur.toString());
		}
		System.out.println();
	}
}
