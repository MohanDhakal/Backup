//Program to insert data into database table
import java.sql.*;
public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/ncit","root","");
   String sql="delete from employee where id=4";
			Statement st=con.createStatement();
			st.execute(sql);
			con.close();
			System.out.println("Record Saved");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
