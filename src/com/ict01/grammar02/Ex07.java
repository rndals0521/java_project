package com.ict01.grammar02;
class Ex07 {
	public static void main(String[] args) {
	
		// �̸��� ȫ�浿�� ����� ����90,����80,����90�̴�.
		// ������ ����� ���Ͻÿ�.

		// ���ϴ� ������ �ޱ� : �Է�
		String name = "ȫ�浿";
		int hg = 90,he=80,hm=90;
		int total =0;
		double avr = 0;
		total = hg + he + hm;
		avr = (int)((total/3.0)*10) / 10.0;
		System.out.println("�̸�: "+name+" ����: "+total+", ���: "+avr);

				
	}
}