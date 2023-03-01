import java.net.*;
import java.io.*;
public class server{

public static void main(String [] args)throws IOException{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataInputStream dis = new DataInputStream(s.getInputStream());
String str = (String)dis.readUTF();
System.out.println("Message from Client: "+str);
DataInputStream dis1 = new DataInputStream(s.getInputStream());
String str1 = (String)dis.readUTF();
System.out.println("Message from Client: "+str1);
DataInputStream dis2 = new DataInputStream(s.getInputStream());
String str2 = (String)dis.readUTF();
System.out.println("Message from Client: "+str2);
int a=Integer.parseInt(str);
int b=Integer.parseInt(str1);
int c=Integer.parseInt(str2);

if(a>b && a>c){
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
dout.writeUTF(a+" is greater");
}
else if(b>a && b>c){
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
dout.writeUTF(b+" is greater");
}
else if(c>a && c>b){
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
dout.writeUTF(c+" is greater");
}
ss.close();
}
}

