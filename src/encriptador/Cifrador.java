package encriptador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Cifrador
{

   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in);
      System.out.println("Encripta un mensaje:");
      MessageDigest md = null;
      
      try{ 
	String text = entrada.nextLine();
	
	//SHA-512
	md = MessageDigest.getInstance("SHA-512"); 
	md.update(text.getBytes());
	byte Byte[] = md.digest();
	System.out.println("SHA-512 \nByte: " + Byte);
	System.out.println("Hexadecimal: " + OperacionesHex.convertirHexadecimal(Byte)+"\n");
	
	//SHA-1
	md = MessageDigest.getInstance("SHA-1"); 
	md.update(text.getBytes());
	Byte = md.digest();
	System.out.println("SHA-1\nByte: " + Byte);
	System.out.println("Hexadecimal: " + OperacionesHex.convertirHexadecimal(Byte)+"\n");
	
	//SHA-1
	md = MessageDigest.getInstance("MD5"); 
	md.update(text.getBytes());
	Byte = md.digest();
	System.out.println("MD5 \nByte: " + Byte);
	System.out.println("Hexadecimal: " + OperacionesHex.convertirHexadecimal(Byte)+"\n");
	
      }catch (NoSuchAlgorithmException ns) {
	 ns.printStackTrace();
      }
      
      

   }

}