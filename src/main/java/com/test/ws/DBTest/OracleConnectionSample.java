package com.test.ws.DBTest;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 

public class OracleConnectionSample {
 public static void main(String args[]) {
//	public ResultSet TestDBQuery () {
		ResultSet rs = null;
 try {
 // load the driver class
 Class.forName("oracle.jdbc.driver.OracleDriver");
 
 // create the connection
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ec2-34-229-85-85.compute-1.amazonaws.com:1521:tadevops1", "fdarev",
 "fdarev");
 
 // create the statement
 Statement stmt = con.createStatement();
 
 // execute query

 
 String queryString ="select a.case_id case_id, nvl(b.category_desc,' ') category,nvl(c.name,' ') name,nvl(d.channel_name,' ') channel\n" + 
 		"      ,e.company_name submitter,nvl(f.status_description,' ') status,a.received_date r_date\n" + 
 		"      ,nvl(a.assigned_date,' ') a_date,a.drug_name drug_name,a.drug_description drug_desc,nvl(a.reviewer_comments,' ') rev_comments\n" + 
 		"      ,nvl(a.case_documents,' ') case_docs,nvl(a.approved_date,' ') ap_date,nvl(a.detailed_description,' ') detailed_desc\n" + 
 		" from CASE_INFORMATION a,CASE_CATEGORIES b, CASE_PEOPLE c, CASE_CHANNELS d, CASE_COMPANIES e, CASE_STATUS f\n" + 
 		"where a.category_id=b.category_id(+)\n" + 
 		"  and a.person_id=c.person_id(+)\n" + 
 		"  and a.channel_id=d.channel_id(+)\n" + 
 		"  and a.company_id=e.company_id(+)\n" + 
 		"  and a.status_id=f.status_id(+)\n" + 
 		"  and c.name is null\n" + 
 		"order by a.case_id";
  rs = stmt.executeQuery(queryString);
// while (rs.next())
// System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
 
// ResultSetMetaData metadata = rs.getMetaData();
// int columnCount = metadata.getColumnCount();    
// for (int i = 1; i <= columnCount; i++) {
//	 System.out.print("--"+metadata.getColumnName(i) + ", ");      
// }
 System.out.println();
 System.out.println("--------------------------");
 while (rs.next()) {
     String row = "";
     for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
         row += "--"+rs.getString(i) + ", ";          
     }
     System.out.println(row);

 }
 
 // close the connection
 con.close();
 
 } catch (Exception e) {
 System.out.println(e);
 }
//return rs;
 
}
}