import java.util.Scanner;


public class PİveEtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Pi pi=new Pi();
		E e=new E();
		System.out.println("200000 adım sonra ki değer "+pi.pi);
		System.out.print("e üzeri x'i hesaplamak için lütfen x değerini giriniz => ");
		double adimSayisi=scan.nextInt();
		e.setAdimSayisi(adimSayisi);
		System.out.println("sonuc => "+e.islem());
	}

}
