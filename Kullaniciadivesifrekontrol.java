
public class Kullaniciadivesifrekontrol {
	private String kullaniciadi="said";
	private String sifre="1234";
	Silgi sil =new Silgi();
	public boolean kullaniciadikontrol(String girilenkullaniciadi,String girilensifre)
	{
		if(girilenkullaniciadi.equalsIgnoreCase(kullaniciadi))//burda girilenkullaniciadi ile kullaniciadinin aynı olup olmadıgını kontrol eder ve aynıysa if içine girer
			{/*saidaltıntop*/
			if(girilensifre.equalsIgnoreCase(sifre))//burda girilensifre ile sifrenin aynı olup olmadıgını kontrol eder ve aynıysa if içine girer
				{
				sil.sil();
				return true;
				}
			else
				System.out.println("sifre yanlıs");return false;
			}
		else
				System.out.println("kullanıcı adi yanlıs");return false;
	}
}
