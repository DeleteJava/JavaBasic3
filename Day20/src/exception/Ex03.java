package exception;

// throws : ���ܸ� �����ϴ� ����. ȣ���� ��ġ�� ���ܰ� ���Ѱ���
// - �ش� ��ġ���� ���ܸ� ó���ϰų� Ȥ�� �� ������ �� �� �ִ�
// - �� main�������� ���ܰ� �����Ǹ� JVM�� �޾Ƽ� ó���ϰ� ���� �߻��� ���α׷��� �����

public class Ex03 {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "��");
			
			Thread.sleep(1000);
		}
		System.out.println();
		
	}
}
