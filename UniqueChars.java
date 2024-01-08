/** String processing exercise 2. */
public class UniqueChars 
{
    public static void main(String[] args) 
	{  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }
    public static String uniqueChars(String word) 
	{
        String newWord = "";
		for ( int i = 0; i < word.length(); i++ )
		{
			boolean check = false;
			char letter = word.charAt(i);
			for ( int j = 0; j <newWord.length(); j++ )
			{
				char letter2 = newWord.charAt(j);
				if ( letter == letter2 )
				{
					check = true;
				}
			}
			if ( check == false || letter == 32  )
			{
				newWord = newWord + letter;
			}
		}
		return newWord;
	}
}
			
