package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffered, StringBuilder =>���ڿ��� ����ϰ� ����,����,�߰��� ��� ���
		
		String msg = "hello";
		System.out.println(msg);
		
		// String�� �Һ��� �Ӽ��� ������ �־ �޸𸮿� ���ο� ������ �����ؼ� ���θ����. hello java�� ���� ����Եȴ�.
		msg = msg + " java";
		System.out.println(msg);
		
		StringBuffer sb =new StringBuffer("welcome");
		System.out.println(sb);
		
		//StringBuffer�� ������ �Ӽ��� ������ ���� �������� ������ �߰��Ѵ�.
		//������ �߰��Ҷ� (append("���ڿ�");)
		sb.append("JAVA");
		System.out.println(sb.toString());
		
	}
}
