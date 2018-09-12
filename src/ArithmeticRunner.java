import java.util.Scanner;
public class ArithmeticRunner 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int value = input.nextInt();
		System.out.println("Enter another number: ");
		int value2 = input.nextInt();
		Arithmetic num = new Arithmetic(value, value2);
		String arithmetic = num.arithmetic();
		System.out.println(arithmetic);
		int larger = num.larger();
		System.out.println(larger + " is the larger number");
		boolean isEven = num.isEven();
		System.out.println(isEven);
		boolean multiple = num.multiple();
		System.out.println(multiple);
	}
	
}
