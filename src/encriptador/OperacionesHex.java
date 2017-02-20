package encriptador;

public class OperacionesHex
{
   public static String convertirHexadecimal(byte[] arrayBytes){
      StringBuffer sb = new StringBuffer();
      for(int i = 0 ; i < arrayBytes.length; i++){
	 sb.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));    
      }
      return sb.toString();
   }
}

