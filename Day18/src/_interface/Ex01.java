package _interface;

import other.USB;

class PC {
	void connect(USB tar) {
		tar.run();
	}
}

class Phone implements USB {
	@Override
	public void run() {
		System.out.println("�޴��� ����. 77% ������ ...");
	}
}

class Memory implements USB {
	@Override
	public void run() {
		System.out.println("USB �޸� ����. E:\\ �� �����");
	}
}

class Keyboard implements USB {
	@Override
	public void run() {
		System.out.println("Ű���� ����. ����̹��� ��ġ�մϴ�");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Phone ph = new Phone();
		Memory me = new Memory();
		Keyboard key = new Keyboard();
		
		
		pc.connect(ph);		// pc�� �޴����� ����
		pc.connect(me);
		pc.connect(key);
		
		
		
	}
}
