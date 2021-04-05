package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		int i =2;
		while(i<10)
		{
			System.out.println(i+"´Ü");
			int j=1;
			while(j<10)
			{
				System.out.println(i + "*" + j + "=" + (i*j)+" ");
				j++;
			}
			i++;
		}

	}
}
