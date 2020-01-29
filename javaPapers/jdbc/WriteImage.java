import java.sql.*;
import java.io.*;
import javax.imageio.*;

class WriteImage
{
  public static void main(String args[])
  {
    try
    {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      Connection con=DriverManager.getConnection("jdbc:odbc:mydatasource","sa","orchid");
      Blob img=con.createBlob();
      int offset=0;
      OutputStream out=img.setBinaryStream(offset);
      ImageIO.write(img,"png",out);
      String sql="insert into tblimage (id,photo)values(?,?)";
      int id=1;
      PreparedStatement pst=con.prepareStatement(sql);
      pst.setInt(1,id);
      pst.setBlob(2,img);
      pst.executeUpdate();
      System.out.println("record inserted");
      con.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
