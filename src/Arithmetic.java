
public class Arithmetic 
{
	public int num1;
	public int num2;
	
	public Arithmetic()
	{
		num1 = 0;
		num2 = 0;
	}
	public Arithmetic(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	
	public String arithmetic()
	{
		int sum = num1 + num2;
		int difference = num1 - num2;
		int quotient = num1 / num2;
		int product = num1 * num2;
		return num1 + " + " + num2 + " = " + sum + " " +
				num1 + " - " + num2 + " = " + difference + " " +
				num1 + " / " + num2 + " = " + quotient + " " +
				num1 + " * " + num2 + " = " + product; 
		//next lines are a method with if statements
	}
	public int larger()
	{
		if(num1 > num2)
		{
			return num1;
		}
		else if(num2 > num1)
		{
			return num2;
		}
		else
		{
			return num1;
		}
	}
	public boolean isEven()
	{
		int sum = num1 + num2;
		if(sum % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiple()
	{
		// % is the sign for remainder
		if(num2 % num1 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
