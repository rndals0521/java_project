package com.ict03.class02;

public class Ex01 {
	public static void main(String[] args) {
		// String Ŭ����
		String str1 = "abc";

		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("======�ֿ� �޼ҵ�======");

		String msg = "�ѱ� ICT ���� ���߿� 1������";
		// 1.charAt(int index) : char
		// ��ġ���� �޾Ƽ� �� ��ġ�������ϴ� ���ڸ� ��ȯ�Ѵ�.
		char c1 = msg.charAt(7);
		System.out.println(c1);

		// ����) ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�.
		// ��Ʈ) a=97 , A=65�̴�.
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ������. length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if (c2 > 'a' && c2 < 'z')
				c2 = (char) (c2 - 32);
			System.out.print(c2);
		}
		System.out.println(msg);

		// 2.concat(String str) : String
		// ������ ���ڿ��� �� ���ڿ� ���� �����մϴ�.
		String msg1 = "���ѹα�";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);

		// 3.contains(CharSequence s) : boolean
		// ���ڿ��� ������ ���� ���� �������� ���Ե� ��쿡�� true�� ��ȯ�մϴ�.
		// ���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true, �������� ������ false
		String msg4 = "���� I Love You 123";
		// boolean b1 = msg5.contains("You");
		boolean b1 = msg4.contains("YOU");
		if (b1)
			System.out.println("����");
		else
			System.out.println("������");

		// 4.equals(Object anObject) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true , �ٸ��� false (��ҹ��� ����)
		// 5.equalsIgnoreCase(String anotherString) : boolean
		// ���� ���ڿ��� ���� ���ڿ��� ������ true , �ٸ��� false (��ҹ��� ��������)
		// **����) ���ڿ��̳� ��ü�� ���� �� == �� ����ϸ� ������ �ƴ� �ּҰ� ����? ��� �ǹ��̴�.
		// ���ڿ����� == ����ϸ� �ȵǰ� , equals �Ǵ� equalsIgnoreCase�� ���
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("KOREA");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4); // 3�� ���� false �ּҰ��� ���ϱ� ����
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println();

		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2); // �ּҰ�����?
		System.out.println(s1.equalsIgnoreCase(s2)); // ������ ����?

		// 6.format(String format, Object... args) : static String
		// ������ �����ϰ� ���Ŀ� �°� ����
		// %s �� ���ڿ� , %d�� ���� , %f �Ǽ�(�ݿø��ȴ�.)
		String msg5 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 89.167;
		String msg6 = msg5.format("%s�� ���۳⵵�� %d���̰� ��������� %.1f�̴�", msg5, s5, s6);
		System.out.println(msg6);

		// 7.getBytes() : byte[]
		// �ش� ���ڿ��� byte�迭�� �����Ų��.
		// ���� ��/��� ��Ʈ���Ҷ� ����Ѵ�. (������ ��ҹ��ڿ� ���ڸ� ����)
		String msg7 = "java";
		byte[] b = msg7.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) b[i]);
		}

		// �ݴ�� �ش� byte �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
		String msg8 = new String(b);
		System.out.println(msg8);

		// 8.toCharArray() : char[]
		// �ش� ���ڿ��� char[] �� �����Ų��.
		// ���� ��/��� ��Ʈ���Ҷ� ����Ѵ�. (�� ���� ��� ���� ����)
		String msg9 = "�ڹ�8 java8 �������� 123 ";
		char[] c = msg9.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		// �ݴ�� �ش� Char �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
		String msg10 = new String(c);
		System.out.println(msg10);

		// 9. indexOf(int ch) : int
		// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ������ġ�� ó������ ã�� ���ڰ� ������ -1�̴�.
		// 10. indexOf(int ch, int fromIndex) : int
		// ���ڿ� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.
		// 11. indexOf(String str) : int
		// ���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ������ġ�� ó����Ÿ, ã�� ���ڰ� ������ -1�̴�.
		// 12. indexOf(String str, int fromIndex) : int
		// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.

		String msg11 = "BufferedReader";
		// 'e'�� ã�ƶ�
		int k1 = msg11.indexOf('e');
		System.out.println(k1); // 4
		// �ι�° 'e'�� ã�ƶ� -> ù e�� 4�̹Ƿ� 5���� ã�´�.
		k1 = msg11.indexOf('e', msg11.indexOf('e') + 1);
		System.out.println(k1);

		// ����° 'e'�� ã�ƶ� -> ��° e�� 6�̹Ƿ� 7���� ã�´�.
		k1 = msg11.indexOf('e', msg11.indexOf('e', msg11.indexOf('e') + 1)+1);
		System.out.println(k1);
		
		// ���� ���� ã��('A')
		k1 = msg11.indexOf('A');
		System.out.println(k1);  //-1
		
		b1 = msg11.contains("e");
		System.out.println(b1);  // false
		
		// char ���� string���� ã��
		k1 = msg11.indexOf("er");
		System.out.println(k1);
		
		// �ι�° "er"ã��
		k1 = msg11.indexOf("er",msg11.indexOf("er")+1);
		System.out.println(k1);
		
		// 11. lastIndexOf(int ch) : int
		//     lastIndexOf(String str) : int
		//     ã�� ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
		
		k1 = msg11.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg11.lastIndexOf("er");
		System.out.println(k1);
		
		// 12. isEmpty() : boolean
		//     ���ڿ��� ���̰� 0�̸� ture, �ƴϸ� false  -> null�� ����°� �ƴ� ���� ���Ұ�
		//     ��������� true, �ƴϸ� false
		// 13. length() : int
		//     ���ڿ��� ���̸� ���ڷ� ǥ��
		String msg12 = "";
		String msg13 = "java";
		
		System.out.println(msg12.isEmpty()); //true
		System.out.println(msg13.isEmpty()); //false
		
		System.out.println(msg12.length()); //0
		System.out.println(msg12.length()); //4
		System.out.println();
		
		// 14.replace(char oldChar, char newChar) : String
		//    replace(String target, String replacement) : String
		String msg14 = "���ѹα�";
		String msg15 = msg14.replace("���ѹα�","korea");
		String msg16 = msg14.replace('��', '��');
		String msg17 = msg14.replace(msg14, "korea");
		System.out.println(msg15);
		System.out.println(msg16);
		System.out.println(msg17);
		
		// 15. split(String regex) : String[]
		//     �����ڸ� �޾Ƽ� �迭�� ������. (�迭ũ��� �˾Ƽ� �ڵ�����)
		//     split(String regex, int limit) : String[]
		//     �����ڸ� �޾Ƽ� �迭�� ������.(limit�� �迭�� ũ��)
		String msg18 = "���,����,����,������,���ξ���";
		String[] res2 = msg18.split(",");
		System.out.println(res2[0]);
		String[] res3 = msg18.split(",",10);
		for (int i = 0; i < res3.length; i++) {
			System.out.println("i =" +i+",res=" + res3[i]);
		}
		
		// 16. substring(int beginIndex) : String
		//     ������ġ�� �޾Ƽ� �ش� ���ڿ� ������ ���ڿ�����
		//     substring(int beginIndex, int endIndex) : String
		//     ������ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ� ����(����ġ�� ���Ծȵ�)
		
		String msg19 = "010-7979-9999";
		String res4 = msg19.substring(4);
		String res5 = msg19.substring(4,8);
		String res6 = msg19.substring(msg19.indexOf('-')+1,msg19.lastIndexOf('-'));
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		
		String msg20 = "770707";
		//�¾ �⵵ ����
		String res7 = msg20.substring(0,2);
		//�¾ �� ����
		String res8 = msg20.substring(2,4);
		System.out.println("�⵵:"+ res7 + "��:"+res8);
		
		// ����) 010-7777-9999 => 010-xxxx-9999 , 010-7777-xxxx
		String msg20_1 = "010-7777-9999";
		String res8_1 = msg20_1.substring(msg20_1.indexOf('-')+1,msg20_1.lastIndexOf('-'));
		System.out.println(res8_1);
		String res8_2 = msg20_1.replace(res8_1, "xxxx");
		System.out.println(res8_2);
		
		// ����) ������ ver
		String quiz = "010-1234-9999";
		String[] anser = quiz.split("-");
		anser[1] = anser[1].replace(anser[1], "-XXXX-");
		for (int i = 0; i < anser.length; i++) {
			System.out.println(anser[i]);
		}
		System.out.println();
		// 17. toLowlerCase() : String
		//     �ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
		// 18. toUpperCase() : String
		//     �ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
		String msg21 = "�ڹ�8 java8 JAVA8";
		String res9 = msg21.toLowerCase();
		String res10 = msg21.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		
		
		// 19. toString() : String
		//     String�� toString() : ���ڿ� ��ü�� ��ȯ
		//     Object�� toString() : ��� ��ü���� ��밡�� 
		//                           ��ü�� ������ �ִ� ������ ������ ���ڿ��� ������ �� ���(�������̵� �Ҷ� �ٽù��).
		String msg22 = "java8 Java8 �ڹ�8";
		String res11 = msg22.toString();
		System.out.println(msg22);
		System.out.println(res11);
		
		
		// 20. trim() : String
		//     �ش� ���ڿ��� ��,�� �ִ� ���� ����, �߰������� ���� ����.
		String msg23 = "    java �ڹ�    JAVA    ";
		System.out.println(msg23);
		System.out.println(msg23.trim());
		System.out.println(msg23.length());
		System.out.println(msg23.trim().length());
		
		// 21. valueOf(�����ڷ���) : static String
		//     � �ڷ����̵��� String���� �����Ų��.
		boolean p1 = true;
		char p2 = 'd';
		int p3 =100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// ���� �ڷ����� + 1;
		//System.out.println(p1+1); ���� �߻� boolean���� + ������ �Ҽ� ����.)
		System.out.println(p2+1);  //char + ���� �� ������ ���´�.
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		
		// String ���� ���� ���Ѽ� + 1
		System.out.println(String.valueOf(p1)+1);  
		System.out.println(String.valueOf(p2)+1);  
		System.out.println(String.valueOf(p3)+1);  
		System.out.println(String.valueOf(p4)+1);  
		System.out.println(String.valueOf(p5)+1);  
		System.out.println(String.valueOf(p6)+1);  
		System.out.println();
		
		// �̰� �ǰ��������� �޸� ��ƸԾ�
		System.out.println(p1+"1");  
		System.out.println(p2+"1");  
		System.out.println(p3+"1");
		System.out.println(p4+"1");
		System.out.println(p5+"1");
		System.out.println(p6+"1");
		
		// 21�� �ݴ� ���� (���� �ڷ��� ����� ���ڿ��� ���� �ڷ������� ����)
		// Wrapper Class  (Boolean, Byte,short, Integer , Long,Float, Double , Character)
		//                parseXXXX(String s) �޼ҵ带 �̿��ؼ� ���� (Character ���� -> String.charAt() �� �����ϱ�~) 
		//  -�� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� ���� ��Ű�� Ŭ������
		//  -���� �ǹ̴� �⺻�ڷ����� ��ü������ ���� �� ����ϴ� Ŭ����
		//   �⺻�ڷ��� => ��ü��  �ڵ����� ���� (����ڽ�)
		//   ��ü�� => �⺻�ڷ��� �ڵ����� ���� (�����ڽ�)
		
		// 1. boolean ������ ���ڿ��� Boolean ������ ����
		//    Boolean.parseBoolean("true"); Boolean.parseBoolean("����������")=> false;  
		msg = "0";
		/* boolean���� �ƴ϶� �����߻�
		if(msg) {
			break;
		};
		*/
		//Boolean a1 = new Boolean("true");
		// ���ٱ׾����� ���� �������� �ʴ´� �ǵ��� ��������
		boolean a1 = Boolean.parseBoolean(msg);  
		if(a1) {
			System.out.println("���漺��1");
		}else {
			System.out.println("���漺��2");
		}
		
		// 2. int ������ ���ڿ��� int������ ���� : Integer.parseInt(String s);
		msg ="100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg+10);
		System.out.println(a2+10);
		
		// 3. double ������ ���ڿ��� double������ ���� : Double.parseDouble(String s);
		msg = "3.145";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg+10);
		System.out.println(a3+10);
		
		// 4. Char ������ ���ڿ��� char������ ������ �޼ҵ�� ���� (��, CharacterŬ������ �����Ѵ�.)
		//    ���ڿ����� charAt(��ġ��) �̿��ϸ� �ȴ�.
		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(msg+10);
		System.out.println(a4+10);
		System.out.println((char)(a4+10));
		
		
		// �ֹι�ȣ ���ڸ��� �޾Ҵ�? ���̸� ������
		String jumin = "941210";
		String gender = "1";
		
		//���ڸ� ���ڸ�
		String year = jumin .substring(0,2);
		int y_year = Integer.parseInt(year);
		
		//���ڸ� ���ڸ��� 19�� 20�� �ٿ���
		// (gender�� 1�Ǵ� 2�� 19, 3�Ǵ� 4�� 20)
		if(gender.equals("1") || gender.equals("2")) {
			y_year = y_year + 1900;
		}else if (gender.equals("3") || gender.equals("4")) {
			y_year += 2000;
		}
		//(���س⵵ - ���ѳ⵵)+1
		int age = 2021 -y_year + 1;
		System.out.println("���̴�" + age + "�Դϴ�.");
	}

}
