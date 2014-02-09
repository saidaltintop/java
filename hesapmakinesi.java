import java.util.Scanner;
//içinde kulladıgım altıislem class ı da diger paylasımlarımın arasındadır

public class Sayitahminoyunu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sayi1oku =new Scanner(System.in);//klavyeden deger alabilmemiz için.
		Scanner sayi2oku =new Scanner(System.in);
		altıislem islem=new altıislem();//altıislem sınıfını cagırıdık.
		Scanner secenekoku =new Scanner(System.in);
		System.out.print("\n1-toplama||2-cıkarma||3-carpma||4-bölme||5-toplam sembolu||6-carpım sembolu =>> ");
		int secenek=secenekoku.nextInt();//klavyeden aldıgımız degeri secenege atadık
		do//tekrardan istersek islem yapabilmemiz için.(sonunda while vardır. while içindekine göre dongu deavm eder)
		{
			System.out.print("ilk sayiyi giriniz => ");
			double sayi1=sayi1oku.nextDouble();//klavyeden aldıgımız degeri sayi1 e atadık.
			System.out.print("son sayiyi giriniz => ");
			double sayi2=sayi2oku.nextDouble();
			switch (secenek)
			{
				case 1:
					System.out.println(sayi1+"+"+sayi2+" = "+islem.topla(sayi1, sayi2));//altıislem sınıfından topla metotunu cagırdık
					break;//saidaltıntop
				case 2:
					System.out.println(sayi1+"-"+sayi2+" = "+islem.cıkart(sayi1, sayi2));//altıislem sınıfından cıkart metotunu cagırdık
					break;
				case 3:
					System.out.println(sayi1+"*"+sayi2+" = "+islem.carp(sayi1, sayi2));//altıislem sınıfından carp metotunu cagırdık
					break;
				case 4:
					System.out.println(sayi1+"/"+sayi2+" = "+islem.bol(sayi1, sayi2));//altıislem sınıfından bol metotunu cagırdık
					break;
				case 5:
					System.out.println(sayi1+" ve "+sayi2+" dahil arasındaki sayıların toplam = "+islem.toplasembol(sayi1, sayi2));//altıislem sınıfından toplamsembolu metotunu cagırdık		
					break;
				case 6:
					System.out.println(sayi1+" ve "+sayi2+" dahil arasındaki sayıların carpımı = "+islem.carpimsembol(sayi1, sayi2));//altıislem sınıfından carpımsembolu metotunu cagırdık
					break;
				default:
					System.out.println("Lütfen 1,2,3,4,5,6 dan birini seciniz..");
					break;
			}
			System.out.print("\n1-toplama||2-cıkarma||3-carpma||4-bölme||5-toplam sembolu||6-carpım sembolu||7-cıkıs =>> ");
			secenek=secenekoku.nextInt();
		}while(secenek!=7);//eger secenek 7 e esitse döngu biter
	}
}
