import java.io.IOException;
import java.util.Scanner;


public class endeks {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		String cinsiyet,tekrar;
		float kilo,boy,indeks;
		do
		{
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		
		System.out.print("Lütfen cinsiyetinizi giriniz => ");
		cinsiyet=scan1.nextLine();

		if(cinsiyet.equalsIgnoreCase("kız") || cinsiyet.equalsIgnoreCase("bayan"))
		{
			System.out.print("kilo(kg) => ");
			kilo=scan2.nextFloat();
			System.out.print("boy(metre) => ");
			boy=scan3.nextFloat();
			indeks=kilo/(boy*boy);
			System.out.println("indeks sonucu => " + indeks);
			
			if(indeks<=7)
				System.out.println("indeksiniz cok düsük! saglık riski olabilir kilo almalisiniz\n");

				else if(indeks>7 && indeks<=10)
					System.out.println("indeksiniz düsük! kilo almalisiniz\n");

				else if(indeks>10 && indeks<=20)
					System.out.println("indeksiniz normal! ideal kilodasınız\n");

				else if(indeks>20 && indeks<=24)
					System.out.println("indeksiniz yuksek! kilo vermelisiniz\n");

				else if(indeks>=25)
					System.out.println("indeksiniz cok yuksek! saglık riski olabilir kilo vermelisiniz\n");
			
		}
		else if(cinsiyet.equalsIgnoreCase("erkek") || cinsiyet.equalsIgnoreCase("bay"))
		{
			System.out.print("kilo(kg) => ");
			kilo=scan2.nextFloat();
			System.out.print("boy(metre) => ");
			boy=scan3.nextFloat();
			indeks=kilo/(boy*boy);
			System.out.println("indeks sonucu => " + indeks);
			
			if(indeks<=10)
				System.out.println("indeksiniz cok düsük! saglık riski olabilir kilo almalisiniz\n");

				else if(indeks>10 && indeks<=18)
					System.out.println("indeksiniz düsük! kilo almalisiniz\n");

				else if(indeks>18 && indeks<=26)
					System.out.println("indeksiniz normal! ideal kilodasınız\n");

				else if(indeks>26 && indeks<=30)
					System.out.println("indeksiniz yuksek! kilo vermelisiniz\n");

				else if(indeks>=31)
					System.out.println("indeksiniz cok yuksek! saglık riski olabilir kilo vermelisiniz\n");
			
		}
		else
			System.out.print("yanlıs giriş yaptınız\n");
		System.out.print("kilo endeksi hesaplamak için bir 't' ile giris yapınız cikis icin farklı bir tusala giris yapınız => ");
		tekrar=scan4.nextLine();
		System.out.print("========================================================\n");
		}while(tekrar.equalsIgnoreCase("t"));
	}

}
