package OkulProje;



public class OgrenciFields {

	private String ogrenciAdi;
	private int ogrenciNo;
	private double notOrtalamasi;
	
	
	public OgrenciFields() {
		
	}
	public OgrenciFields(int ogrenciNo,String ogrenciAdi, double notOrtalamasi) {
		this.ogrenciNo=ogrenciNo;
		this.ogrenciAdi = ogrenciAdi;
		this.notOrtalamasi = notOrtalamasi;
		
	}
	public String getOgrenciAdi() {
		return ogrenciAdi;
	}
	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public double getNotOrtalamasi() {
		return notOrtalamasi;
	}
	public void setNotOrtalamasi(double notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}
	@Override
	public String toString() {
		
		return  ogrenciNo + "     \t      " +ogrenciAdi+"   \t     "+notOrtalamasi;
	}
	
	
	
}
