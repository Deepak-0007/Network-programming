import java.net.*;
import java.io.*;
public class server{

public static void main(String [] args)throws IOException{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataInputStream dis = new DataInputStream(s.getInputStream());
String str = (String)dis.readUTF();
System.out.println("Message from Client: "+str);
int a=Integer.parseInt(str);

int i,f=1;     
for(i=1;i<=a;i++){    
f=f*i;    
}     
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
dout.writeUTF("Factorial of "+a+" is: "+f);

ss.close();
}
}

