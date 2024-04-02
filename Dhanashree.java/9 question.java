class special
{
	
	
	static void removeSpecialCharacter(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{

			// Finding the character whose 
			// ASCII value fall under this
			// range
			if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
					s.charAt(i) < 'a' || s.charAt(i) > 'z') 
			{ 
				
		
		
				s = s.substring(0, i) + s.substring(i + 1);
				i--;
			}
		}
		System.out.print(s);
	}
	
	public static void main(String[] args)
	{
		String s = "&Alphab3et)and++==v:ow1els"; 
		removeSpecialCharacter(s);
	} 
} 

