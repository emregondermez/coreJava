package techproed.jdbcOrnekler;

import java.sql.*;

public class Jdbc2DDL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");

		 Statement st= con.createStatement();
		 
		 	/*
			 * A) CREATE TABLE, DROP TABLE, ALTER TABLE gibi DDL ifadeleri icin sonuc kümesi
			 * (ResultSet) dondurmeyen metotlar kullanilmalidir. Bunun icin JDBC'de 2
			 * alternatif bulunmaktadir. 1) execute() metodu 2) excuteUpdate() metodu.
			 * 
			 * B) - execute() metodu hertur SQL ifadesiyle kullanibilen genel bir komuttur.
			 * - execute(), Boolean bir deger dondurur. DDL islemlerinde false dondururken,
			 * DML islemlerinde true deger dondurur. - Ozellikle, hangi tip SQL ifadesinin
			 * kullanilmasinin gerektiginin belli olmadigi durumlarda tercih edilmektedir.
			 * 
			 * C) - executeUpdate() metodu ise INSERT, Update gibi DML islemlerinde yaygin
			 * kullanilir. - bu islemlerde islemden etkilenen satir sayisini dondurur. -
			 * Ayrıca, DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.
			 */		
		 
	 /*=======================================================================
	  ORNEK1:isciler adinda bir tablo olusturunuz id int, 
	birim VARCHAR(10), maas int
	========================================================================*/ 
//	   
//		 String sorgu = "CREATE TABLE isciler"
//				 + " (id int primary key,"
//		         + " birim VARCHAR(10),"
//		         + " maas int)";
//	    
//
//	    
//	    st.execute(sorgu);
//	    System.out.println("isciler tablosu oluşturuldu"); 
		 
	    
	    // Ornek 2: isciler table sil
//		String sorgu2="drop table isciler";
//		st.execute(sorgu2);
//		System.out.println("silindi");
		 
		 /*=======================================================================
		  ORNEK3:isciler tablosuna yeni bir sutun {isim Varchar(20)} ekleyiniz.   
	      ========================================================================*/
	
//	    st.execute("alter table isciler add isim varchar(20)");
//	    System.out.println("ekledi");
	    
	    
	    
	    
	    /*=======================================================================
//		  ORNEK4:isciler tablosuna soyisim VARCHAR(20) ve sehir VARCHAR(10)) 
//		  adinda 2 yeni sutun ekleyiniz.  
//		========================================================================*/
		 
		 st.execute("alter table isciler add (soyisim varchar(20), sehir varchar(10))");
		 System.out.println("eklendi");
	}

}
