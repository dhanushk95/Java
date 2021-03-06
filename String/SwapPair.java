package String;

public class SwapPair {

	static String swap(String str)
	{
		if(str == null || str.isEmpty()) 		//Checking if String is null or empty
			return str;
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length - 1; i = i + 2)
		{
			char temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
		}
		return new String(ch); 			   	//Converting result into String and return
	}
	
	public static void main(String args[])
	{
		String str = "Checking";
		
		System.out.println(swap(str));
	}
}
