package String;

public class ReverseString {
	
	static void reverse(String str)
	/*{									  //Method 1 - Convert String to char array
		char[] ch = str.toCharArray();
	
		for(int i =ch.length -1; i>=0; i--)
			System.out.print(ch[i]);
		
			
	}*/
	{
		StringBuffer sb = new StringBuffer(str); 	                  //Method 2 - Use StringBuffer
		
		sb.reverse(); 							  //Built-in function reverse
		System.out.println(sb);
	}
	public static void main(String args[])
	{
		String str = "Amazing!!";
		System.out.println(str);
		
		reverse(str);
		
	}

}
