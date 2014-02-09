import java.util.Random;
import java.util.Scanner;


public class tahminoyunu {

	/**
	 * @param args
	 */
	public static void main(String[] args){	
			Random rastgelesayi=new Random();//rastgele sayı atayabilmek için Random ı kullanacagız.
			Scanner sayioku=new Scanner(System.in);//klavyeden girilen degeri okutabilmek için Scanner ı kullanacagız
			int rastsayi=rastgelesayi.nextInt(200);//0 dan 200 e kadar rastgele bir sayi alır ve bunu rastsayi ya atar 
			int i=0,sayi;//i yi kac defa sayiyi bulmak için deneme yapıldıgını bulmak için yazdık
			
			do
			{
				System.out.print("0 dan 200 e kadar bir sayi giriniz => ");//ekrana yazıyı yazdırmaya yarar.err kırmızı renkde yazıdırır(err hata mesajları ıcındır ama ben suan farklı bir renk olsun diye kullandım)
			    sayi=sayioku.nextInt();//girdigimiz sayiyi sayi ya atar.
				i++;
				if(sayi<rastsayi)//eger random sayi bizim sayımızdan buyukse bu if içine girer
				{
					System.out.println(i+". denemeniz "+"\nSayiyi buyutunuz\n");
				}
				else if(sayi>rastsayi)//eger random sayi bizim sayimizdan kucukse bu else if içine girer
				{
					System.out.println(i+". denemeniz "+"\nSayiyi küçültunuz\n");
				}
				
			}while(sayi!=rastsayi);//döngu random sayi bizim sayımıza eşit olasıya kadar devam eder
			System.err.print("Tebrikler "+i+". denemede buldunuz..");
	}
}
