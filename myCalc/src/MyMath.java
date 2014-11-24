
public class MyMath
{
	public static int add(int oper1,int oper2)
	{
		return oper1 + oper2;
	}
	public static int subt(int oper1, int oper2)
	{
		return oper1 - oper2;
	}
	public static int multiply(int oper1, int oper2)
	{
		
		int result = 0;
		boolean op2IsNegative = false;
		if(oper2 < 0)
		{
			oper2= oper2 - oper2 - oper2;
			op2IsNegative = true;
			
		}
		for(int i = 1; i <= oper2; i++)
		{
			result += oper1;
		}
		if(((oper1 < 0) && (op2IsNegative == true)) || ((oper1 > 0) && (op2IsNegative== true))) 
		{
			return result - result - result;
		}
		else
		{
		return result;
		}
	}
	
	public static int fat(int n)
	{
		if (n > 0)
		{
			return multiply(n, fat(subt(n,1)));
			//return n * fat(n -1);
		}
		else
		{
			return 1;
		}
	}
}
