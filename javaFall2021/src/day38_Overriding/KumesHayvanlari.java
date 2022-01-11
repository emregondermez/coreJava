package day38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {

		KumesHayvanlari kms1 = new KumesHayvanlari();
		kms1.solunum();// Kuslar akciger solunumu yapar
		kms1.hareket();// Kumes hayvanlari yuruyerek hareket eder
		kms1.beslenme();// Hayavanlar beslenir

		System.out.println("---------");

		Kuslar kms2 = new KumesHayvanlari();
		kms2.solunum();// Kuslar akciger solunumu yapar
		kms2.hareket();// Kumes hayvanlari yuruyerek hareket eder
		kms2.beslenme();// Hayavanlar beslenir

		Animal kms3 = new KumesHayvanlari();
		kms3.beslenme();
		kms3.hareket();
		kms3.solunum();

	}
@Override
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
	}

}
