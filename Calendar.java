public class Calendar
{
    
	static int dayOfMonth = 1;  
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	public static void main(String args[])
	{ 
		String str = "";
		int pickedY = Integer.parseInt(args[0]);
		while (year < pickedY + 1)
		{
			advance();
			while(year == pickedY)
			{
				str = "";
				if(dayOfWeek == 1) str = " Sunday";
				System.out.println(dayOfMonth + "/" + month + "/" + year + str);
				advance();
			}
		}       
	}
	private static void advance()
	{
		if(dayOfWeek == 7) dayOfWeek = 1;
		else dayOfWeek++;
		if(dayOfMonth == nDaysInMonth)
		{
			if(month == 12)
			{
				month = 0;
				year++;
			}
			dayOfMonth = 1;
			month++;
			nDaysInMonth = nDaysInMonth(month, year);
		}
		else dayOfMonth++;
	}
	private static boolean isLeapYear(int year) 
	{
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	private static int nDaysInMonth(int month, int year)
	{
		if (((month == 4) || (month == 6) || (month == 9) || (month == 11)))
		{
			return 30;
		} 	
		else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) return 31;
		else if(isLeapYear(year)) return 29;
		else return 28;
	}
}