
public class E {
	
	private double adimSayisi;
	private double e=0;
	public E()
	{
		
	}
	public E(double adimSayisi)
	{
		this.adimSayisi=adimSayisi;
	}
	public double islem()
	{
		for(double i=0;i<adimSayisi;i++)
		{
			e+=(Math.pow(adimSayisi,i))/(faktoriyel(i));
		}
		return e;
	}
	private double faktoriyel(double i)
	{
		double sonuc=1;
		for(double j=1;j<=i;j++)
		{
			sonuc*=j;
		}
		return sonuc;//saidaltıntop
	}
	public double getAdimSayisi() {
		return adimSayisi;
	}
	public void setAdimSayisi(double adimSayisi) {
		this.adimSayisi = adimSayisi;
	}
}
