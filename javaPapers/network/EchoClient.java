import java.net.*;
import java.io.*;

public class EchoClient 
{
  public static void main(String args[])throws IOException
  {
    Socket sock=null;
    PrintStream output=null;
    BufferedReader input=null;
    try
     {
       sock=new Socket("nd",10007);
       output=new PrintStream(sock.getOutputStream());
       input=new BufferedReader(new InputStreamReader(sock.getInputStream()));
     }
     catch(UnknownHostException e)
     {
 System.out.println("Unknown Host");
 System.exit(0);
     }
     catch(IOException e)
     {
 System.out.println("cannot connect to host");
        System.exit(0);
     }
     BufferedReader stdIn=new BufferedReader(new InputStreamReader(System.in));
     String userInput;
     while((userInput=stdIn.readLine())!=null)
     {
       output.println(userInput);
       System.out.println("echo: "+input.readLine());
     }
     output.close();
     input.close();
     stdIn.close();
     sock.close();
   }
}