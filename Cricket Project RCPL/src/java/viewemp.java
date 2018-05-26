
 

import java.sql.*;
public class viewemp {
     public static void main(String [] ar)throws Exception {
    	 String DRIVER_NAME = "org.apache.hive.jdbc.HiveDriver";
    	 String URL = "jdbc:hive2://192.168.237.128:10000/stp18";
    	 Class.forName(DRIVER_NAME);
    	 Connection con = DriverManager.getConnection(URL,"","");
    	 Statement st = con.createStatement();
    	 String query = "select * from emp";
    	 ResultSet rs = st.executeQuery(query);
    	 while(rs.next()){
    		 
    	 String eid = rs.getString(1);
    	 String name = rs.getString(2);
    	 System.out.println(eid+"\t"+name);
    	 }
    	 }
}
