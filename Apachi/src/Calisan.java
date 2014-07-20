import java.util.Calendar;


public class Calisan {
	
	private String ad;
	private Calendar tarih;
	
	
	
	public Calisan(String ad, Calendar tarih) {
		super();
		this.ad = ad;
		this.tarih = tarih;
	}


	public Calisan() {
		super();
	}

	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Calendar getTarih() {
		return tarih;
	}

	public void setTarih(Calendar tarih) {
		this.tarih = tarih;
	}
	
	
	

}
