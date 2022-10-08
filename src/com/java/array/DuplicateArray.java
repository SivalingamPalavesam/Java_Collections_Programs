package com.java.array;

public class DuplicateArray
{
	public static void main(String[] args) {
		
		String str = "programminginJava";
		
		char[] arr= str.toCharArray();
		
		int val   ;
		
		for(int i = 0; i<arr.length; i++)
		{
			val=1;
			for(int j =i+1; j<arr.length;j++)
			{
				
				if(arr[i] == arr[j] && arr[i] !='0' )
				{
					val++;
					arr[j]='0';
				}
			}
			if(val>1 && arr[i] !='0' )
			{
				System.out.println(arr[i] + "  " +val);
			}
		}
		
	}

}
