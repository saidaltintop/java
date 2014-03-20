import java.util.Scanner;


public class Guessing{
	private int steps=0;
	
	public Guessing()
	{
		
	}
	public int calculate(int HigherNumber,int LowerNumber)
	{
		Scanner scan=new Scanner(System.in);
		int MiddleNumber=(HigherNumber+LowerNumber)/2;
		for(;;)
		{
			steps++;
			System.out.print("Guessing: "+MiddleNumber+" (0:right guess 1:my number is lower 2:my number is higher) : ");
			int choice=scan.nextInt();
			if(1==choice)//saidaltıntop
			{
				HigherNumber=MiddleNumber;
				MiddleNumber=(LowerNumber+MiddleNumber)/2;
			}
			else if(2==choice)
			{
				LowerNumber=MiddleNumber;
				MiddleNumber=(HigherNumber+MiddleNumber)/2;
			}
			else
			{
				break;
			}
		}
		return MiddleNumber;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
}
