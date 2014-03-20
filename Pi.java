
public class Pi {

	double pi = 0;
	public Pi()
	{
		int j=0;
		int say=0;
		for(int i=1;i<200000;i+=2)// for da i'yi 800.000 yaparsak. 3.14159 'i 376850 Adım sonra buluruz. soruyu tam anlayamadıgım için bu şekilde yaptım.
		{
			j++;
			if(j%2==0)
			{
				pi=pi-(4.0/i);
			}
			else
			{
				pi=pi+(4.0/i);
			}
			if(pi<3.141591 && pi>=3.14159 && say==0)
			{
				System.out.println("3.14159 'i "+j+" Adım sonra buluruz!!");
				say++;
			}
		}
	}
}
