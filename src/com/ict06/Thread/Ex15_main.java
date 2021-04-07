package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		new Thread(t1).start();
		new Thread(t1).start();
		
		//객체를 t1,t2 두개 만들어서 하면 같은 임계영역이 아니기때문에 틀린 코딩
		
	}
}
