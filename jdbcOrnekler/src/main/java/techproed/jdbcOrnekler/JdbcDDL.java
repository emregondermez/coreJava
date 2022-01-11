package techproed.jdbcOrnekler;

import java.sql.*;

public class JdbcDDL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "1234");

		Statement st= con.createStatement();
		 
		 /*=======================================================================
		  ORNEK1: Bolumler tablosuna yeni bir kayit (80, 'ARGE', 'ISTANBUL') 
		  ekleyelim 
		========================================================================*/
//		int s1= st.executeUpdate("insert into bolumler values (80, 'ARGE', 'ISTANBUL')");
//		 System.out.println(s1+" satir eklendi");
		 
//		 int s2= st.executeUpdate("insert into bolumler values (91, 'ARGE2', 'corlu')");
//		 System.out.println(s2+" satir eklendi");
		 
		 
		 /*=======================================================================
	      ORNEK2: Bolumler tablosuna birden fazla yeni kayıt ekleyelim.
	     ========================================================================*/ 
	    
	    // 1.YONTEM
	 	// -----------------------------------------------
	 	// Ayri ayri sorgular ile veritabanina tekrar tekrar ulasmak islemlerin 
	 	// yavas yapilmasina yol acar. 10000 tane veri kaydi yapildigi dusunuldugunde
	    // bu kotu bir yaklasimdir.

	
		 String [] sorgular ={"INSERT INTO bolumler VALUES(95, 'YEMEKHANE', 'ISTANBUL')",
    	  "INSERT INTO bolumler VALUES(85, 'OFIS','ANKARA')",
    	  "INSERT INTO bolumler VALUES(75, 'OFIS2', 'VAN')"};
		
		
		 for (String each : sorgular) {
		st.executeUpdate(each);
		}
		 System.out.println("eklendi");
		 
		 
	}

}
