import java.util.Scanner;
/*Silgi ve Kullaniciadivesifrekontrol class ları diger dosyalarda.*/
public class banka {

	/**
	 * @param args
	 */
	static int hesabimdakipara = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner isimoku = new Scanner(System.in);/*Scanner(InputStream source) kurucusunu kullanıyor. InputStream tipinden 
		olan source olarak System.in değişkeni kullanılıyor. Bu değişken standart giriş akımıdır*/
		Scanner siferoku = new Scanner(System.in);/*kısacası klavyeden bir deger alabilmemiz burda scan2 nesnesi olusturduk */
		for (int i = 4; i >= 0; i--) {/*deneme hakkı verdigimiz için for  kullandık yani kullanıcının 4 kez deneme hakkı olacak*/
			String isim, sifre;
			boolean dogrumu;

			System.out.print("\nKullanici Adi = ");
			isim = isimoku.nextLine();/*isimoku nesnesini yukarda olusturmustuk.simdiyse klavyeden girilen degeri isimoku.nextLine() ile okuyup isim e aktardık. nextline dememizin nedeni string değer girmemiz  */
			System.out.print("sifre = ");
			sifre = siferoku.nextLine();
			Kullaniciadivesifrekontrol kontrol = new Kullaniciadivesifrekontrol();/*başka bir class olusturup şifre ve isim kontrolunu orda yaptım.boyle yapmamamın nededin daha sonra baska bi programda bu class i tekrar cagırıp kolayca kullanabilmem*/
			dogrumu = kontrol.kullaniciadikontrol(isim, sifre);/*kullanıcıadıkontrol sınıfının içinde return olan deger true yada false bu yuzden donen degeri dogrumu ya atadım*/
			if (dogrumu == true) {/*returnden dogrumu ya atanan deger true ise bu if içine girecek*/
				System.out.print("Giris Yapildi.\n");/*saidaltıntop*/
				System.out.print("Hosgeldiniz " + isim);
				menuyazdir();/*menu yazdır fonksiyonuna gider*/

			} else {
				if (i != 0)/*i 0 olmadıgı surece bu if içine girer*/
					System.out.print(i + " tane deneme hakkınız kaldı\n");
				else
					System.out.print("deneme hakkınız bitmiştir..\n");
			}

		}
	}

public static void menuyazdir() {
		Scanner secenekoku = new Scanner(System.in);
		Scanner menuyegitoku = new Scanner(System.in);
		Scanner yatırılanparaoku = new Scanner(System.in);
		Scanner cekilenparaoku = new Scanner(System.in);
		Scanner gonderilenparaoku = new Scanner(System.in);
		Scanner kisioku = new Scanner(System.in);
		int secenek, menuyegit, yatırılanpara, cekilenpara, gonderilenpara;
		String kisi;

		System.out.print("\n1.HESABIMDAKI PARA\n");
		System.out.print("2.KENDI HESABIMA PARA YATIRMA\n");
		System.out.print("3.PARA CEKME\n");
		System.out.print("4.BASKA BIR HESABA PARA AKTARMA\n");
		System.out.print("5.CIKIS\n\n");
		secenek = secenekoku.nextInt();
		Silgi sil = new Silgi();
		switch (secenek) // (1,2,3,4,5) den hangisini secersek o işleme girmesi için switch i kullandık
		{
		case 1:
			sil.sil();/*burda ekranda her satıra bir bosluk koyup bir alta geçiyor ve bunu 100 kere yapıyor*/
            System.out.print("\nHesabimdaki Para = " + hesabimdakipara+ " TL\n\n(menu = 0 cikis = 5)\n\n");// hesabımdaki parayı görmek için
			menuyegit = menuyegitoku.nextInt();/*menuyegitoku ile okuttugumuz 0 veya 5 i menuyegit e atıyoruz */
			fonksiyonmenuyegit(menuyegit);/*fonksiyonmenuyegit fonsiyonuna gider ve parametre olarak menuyegit i alır*/
			break;/*saidaltıntop*/
		case 2:
			sil.sil();
			System.out.print("\nHesabimdaki Para = " + hesabimdakipara+ " TL\n");
			System.out.print("\nYatirmak istediginiz para miktarini giriniz = ");
			yatırılanpara = yatırılanparaoku.nextInt();// yatırmak istegimiz parayı yatırılanpara ya aktarıyoruz
			hesabimdakipara += yatırılanpara;// yatırılan parayı hesapdakine ekliyoruz
			System.out.print("\nISLEM BASARILI!!\n\nIslemdenden Sonra Hesabimdaki Para = "+ hesabimdakipara+ " TL\n\n(menu = 0 cikis = 5)\n\n");
			menuyegit = menuyegitoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 3:
			sil.sil();
			System.out.print("\nHesabimdaki Para = " + hesabimdakipara+ " TL\n");
			System.out.print("\nCekmek istediginiz para miktarini giriniz = ");
			cekilenpara = cekilenparaoku.nextInt();// cekmek istedigimz parayı cekilenparaya atıyoruz
			if (hesabimdakipara < cekilenpara)
				System.out.print("\nYETERLİ PARA YOK!!");
			else {
				hesabimdakipara -= cekilenpara;// cekilen parayı hesapdan cıkartıyoruz
				System.out.print("\nISLEM BASARILI!!\n\nIslemdenden Sonra Hesabimdaki Para = "+ hesabimdakipara + " TL");
			      }
			System.out.print("\n\n(menu = 0 cikis = 5)\n\n");
			menuyegit = menuyegitoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 4:
			sil.sil();
			System.out.print("\nPara Gonderilecek kisinin adi = ");
			kisi = kisioku.nextLine();
			if (kisi.equalsIgnoreCase("pau")) {/*equalsIgnoreCase parantz içindeki yazıyı hem buyuk hemde kucuk olarak algılar ve kisi parantez içindeki ile aynıysa if içine girer*/
				System.out.print("\nHesabimdaki Para = " + hesabimdakipara+ " TL\n");
				System.out.print("\nGondermek istediginiz para miktarini giriniz = ");
				gonderilenpara = gonderilenparaoku.nextInt();
				if (hesabimdakipara < gonderilenpara)
					System.out.print("\nYETERLİ PARA YOK!!");
				else {
					hesabimdakipara -= gonderilenpara;
					System.out.print("\nISLEM BASARILI!!\n\nIslemdenden Sonra Hesabimdaki Para = "+ hesabimdakipara + " TL");
					System.out.print("\n\nPamukkale Universtesine "+ gonderilenpara + " TL gonderildi..");
				}/*saidaltıntop*/
			} else
			System.out.print("\nBoyle bir hesap bulunamamaktadir!!!");
			System.out.print("\n\n(menu = 0 cikis = 5)\n\n");
			menuyegit = menuyegitoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 5:
			sil.sil();/*silgi class ının metotu.class da yaptıgı seyse 100 satırlık bosluk bırakma ekranın temiz gözukmesi için */
			System.out.print("\ncıkıs yapıldı..");
			System.exit(1);/*programı sonlandırmaya yarar*/
			break;
		default:
			System.out.print("1,2,3,4,5 sayilarindan birini giriniz\n");
			menuyazdir();
			break;
		}
	}
public static void fonksiyonmenuyegit(int menuyegit) {
		Silgi sil = new Silgi();/*silgi class ını cagırıyoruz*/
		Scanner menuyegitokuburda=new Scanner(System.in);
		if (menuyegit == 0) {
			sil.sil();
			menuyazdir();
		}
		else if (menuyegit == 5) {
			sil.sil();/*saidaltıntop*/
			System.out.print("\ncıkıs yapıldı..");
			System.exit(1);// programı kapatmak için kullanıyoruz
		}
		else 
			{
			System.out.print("\nyanlıs giris yaptınız");
			System.out.print("\n\n(menu = 0 cikis = 5)\n\n");
			menuyegit = menuyegitokuburda.nextInt();
			fonksiyonmenuyegit(menuyegit);
			}
	}
}
