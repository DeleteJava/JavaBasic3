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
		System.out.println("휴대폰 연결. 77% 충전중 ...");
	}
}

class Memory implements USB {
	@Override
	public void run() {
		System.out.println("USB 메모리 연결. E:\\ 에 연결됨");
	}
}

class Keyboard implements USB {
	@Override
	public void run() {
		System.out.println("키보드 연결. 드라이버를 설치합니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		PC pc = new PC();
		
		Phone ph = new Phone();
		Memory me = new Memory();
		Keyboard key = new Keyboard();
		
		
		pc.connect(ph);		// pc에 휴대폰을 연결
		pc.connect(me);
		pc.connect(key);
		
		
		
	}
}
