// Decoding Basic Base 64 encode text

import java.util.*; 
public class GFG { 
	public static void main(String[] args){ 
		
		// Input the encoded string
      	Scanner sc= new Scanner(System.in);
		String encoded = sc.nextLine();
		
		// decode into String from encoded format 
		byte[] actualByte = Base64.getDecoder().decode(encoded); 

		String decodedString = new String(actualByte); 

		// print decoded String 
		System.out.println(decodedString); 
	} 
} 
