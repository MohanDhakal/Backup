import java.io.*;
class ReadChar
{
  public static void main(String args[])throws IOException
  {
    FileReader fw=new FileReader("hellooo");
    BufferedReader br=new BufferedReader(fw);
    String str;
    while((str=br.readLine())!=null)
      System.out.println(str);
    fw.close();
  }
}
      