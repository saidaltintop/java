

public class altıislem {
	
	double toplasembol(double sayi1,double sayi2)
	{
		double toplam=0;
		if(sayi1<=sayi2)
		{
			while(sayi1<=sayi2)
			{
				toplam+=sayi1;
				sayi1++;
			}
		}
		else
		{
			while(sayi1>=sayi2)
			{
				toplam+=sayi2;
				sayi2++;
			}
		}
		return toplam;
	}
	double carpimsembol(double sayi1,double sayi2)
	{
		double carpim=1;
		if(sayi1<=sayi2)
		{
			while(sayi1<=sayi2)
			{
				carpim*=sayi1;
				sayi1++;
			}
		}//saidaltıntop
		else
		{
			while(sayi1>=sayi2)
			{
				carpim*=sayi2;
				sayi2++;
			}
		}
		return carpim;
	}
	double topla(double sayi1,double sayi2)
	{
		return sayi1+sayi2;
	}
	double cıkart(double sayi1,double sayi2)
	{
		return sayi1-sayi2;
	}
	double carp(double sayi1,double sayi2)
	{
		return sayi1*sayi2;
	}
	double bol(double sayi1,double sayi2)
	{
		return sayi1/sayi2;
	}
}
