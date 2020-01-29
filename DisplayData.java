import java.sql.*;
public class DisplayData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/ncit","root","");
   String sql="select * from employee";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getString("salary"));
			}
			con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
