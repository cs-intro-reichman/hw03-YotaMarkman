/** String processing exercise 1. */
public class LowerCase 
{
    public static void main(String[] args) 
	{  
        String given = args[0];
		System.out.println(returnLower ( given ));
    }
	public static String lowerCase(String word) 
	{
       String result = "";
		for ( int i = 0; i < word.length(); i++ )
		{
			char letter = word.charAt(i);
			if ( letter >= 65  &&  letter <= 90 )
			{
				result = result + (char)(letter + 32);	
			}
			else
			{
				result = result + (char)(letter);
			}
		}
		return result;
    }
}
