package _interface;

import other.USB;


public class Ex02 {
	public static void main(String[] args) {
		// �͸� ��ø Ŭ����
		// - �̸� ���� Ŭ����. ��ȸ��
		// - ���� ����� �����Ǿ� ���� ���� 
		//   �߻� Ŭ������, �������̽��� ��ü�� ��� ���� �����ϰ� ������ ���
		
		USB usb = new USB() {
			@Override
			public void run() {
				System.out.println("32GB ����~");
			}
		};
		
		
		PC pc = new PC();
		
		pc.connect(usb);
		
		
		// �� Java 1.8 ���� ���� �Լ��� �������̽���
		// ���ٽ��̶�� ���¸� ���ؼ� �� �� ���� ��ü�� ������ �� �ִ�
		USB usb2 = () -> {
			System.out.println("64GB ����");
		};
		
		
		pc.connect(usb2);
		
	}
}
