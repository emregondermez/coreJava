package day34_inheritance;

public class Encapsulation01 {

	private  String okulIsmi="Yildiz Koleji";
	private int okulHesapNo =12345;
	private boolean isAcikMi=true;
	
	
	public String getOkulIsmi() {
		return okulIsmi;
		
	}
	public  int getOkulHesapNo() {
		return okulHesapNo;
		
	}
	public boolean isAcikMi() {
		return isAcikMi;
	}
	public  void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
		
	}
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
		
	}
	public void setAcikMi(boolean isAcikMi) {
		this.isAcikMi=isAcikMi;
	}
}
