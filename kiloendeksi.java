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
		Scanner scan1 = new Scanner(System.in);/*Scanner(InputStream source) kurucusunu kullanıyor. InputStream tipinden 
olan source olarak System.in değişkeni kullanılıyor. Bu değişken standart giriş akımıdır*/
		Scanner scan2 = new Scanner(System.in);/*kısacası klavyeden bir deger alabilmemiz burda scan2 nesnesi olusturduk */
		Scanner scan3 = new Scanner(System.in);/*bunları nerde kullanacagımızı asagıda görecegiz*/
		Scanner scan4 = new Scanner(System.in);
		
		for(int i=0;i<100;i++)
			System.out.println();/*burda ekranda her satıra bir bosluk koyup bir alta geçiyor ve bunu 100 kere yapıyor*/
		
		System.out.print("Lütfen cinsiyetinizi giriniz => ");
		cinsiyet=scan1.nextLine();/*scan1 nesnesini yukarda olusturmustuk.simdiyse klavyeden girilen degeri scan1.nextLine() ile okuyup cinsiyet e aktardık. nextline dememizin nedeni string değer girmemiz  */

		if(cinsiyet.equalsIgnoreCase("kız") || cinsiyet.equalsIgnoreCase("bayan"))/*cinsiyetin kız yada bayan olması durumunda bunun içine girer*/
		{
			System.out.print("kilo(kg) => ");
			kilo=scan2.nextFloat();
			System.out.print("boy(metre) => ");
			boy=scan3.nextFloat();
			indeks=kilo/(boy*boy);/*burda indeksimizin sonucunu bulduk*/
			System.out.println("indeks sonucu => " + indeks);
			
			if(indeks<=7)/*indeks eger 7 ye esit veya 7 kucukse bunun içine girsin*/
				System.out.println("indeksiniz cok düsük! saglık riski olabilir kilo almalisiniz\n");

				else if(indeks>7 && indeks<=10)/*indeks eger 7 den buyuk veya 10 a esit ve 10 dan kucukse bunun içine girsin*/
					System.out.println("indeksiniz düsük! kilo almalisiniz\n");

				else if(indeks>10 && indeks<=20)
					System.out.println("indeksiniz normal! ideal kilodasınız\n");

				else if(indeks>20 && indeks<=24)
					System.out.println("indeksiniz yuksek! kilo vermelisiniz\n");

				else if(indeks>=25)
					System.out.println("indeksiniz cok yuksek! saglık riski olabilir kilo vermelisiniz\n");
			
		}
		else if(cinsiyet.equalsIgnoreCase("erkek") || cinsiyet.equalsIgnoreCase("bay"))/*equalsIgnoreCase => bu içine yazdıgımız kelimenin hem buyuk hem kucuk harf olarak geceli olmasını saglıyor.yani buyuk harflerle erkek kelimesi girilsede kabul olacak*/
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
		}while(tekrar.equalsIgnoreCase("t"));/*eger tekrar t olursa do dan itibaren tum işlemleri tekrar yapacak*/
	}

}
