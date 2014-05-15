import java.io.IOException;  
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;  
import java.net.Socket;  

import com.zpartal.commpackets.*;
public class Java2Sever 
{	
	public Java2Sever() throws IOException 
	{  
		try
		 {
			 ServerSocket server = new ServerSocket(5555);
			 System.out.println("Server established...\nPort number: 5555");

			 while(true){
				 //waiting for connection
				 Socket connection = server.accept();
				 System.out.println("New socket established...");

				 
				 //manage I/O streams
				 OutputStream os = connection.getOutputStream();
				 ObjectOutputStream dos = new ObjectOutputStream(os);
				 InputStream is = connection.getInputStream();
				 ObjectInputStream dis = new ObjectInputStream(is);
				 
				 //perform processing
				 ClientPacket packet = (ClientPacket) dis.readObject();
				 int sum = packet.getNum1() + packet.getNum2();
				 
				 System.out.println("Server: a = "+ packet.getNum1()+" b = "+ packet.getNum2() + "sum=" + sum);
				 ServerPacket response = new ServerPacket("billlipeng", sum);
				 dos.flush();
				 
				 //write back to data output stream
				 dos.writeObject(response);
				 
				 //close connection
				 connection.close();
			 }
			 
		 }catch(Exception e)
		 {
			 System.out.println("Error in Java2Server()");
			 e.printStackTrace();
		 }
	}  
	  
	public static void main(String[] args) 
	{  
	try {  
	    	new Java2Sever();  
	    }catch (IOException e) 
	    {  
	    	e.printStackTrace();  
	    }  
	}  
	 
}
