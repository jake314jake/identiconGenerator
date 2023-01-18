package Hash.Algorithms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Hash implements Hashable {
	@Override
	public String getHash(String input) {
		 String generated = null;
		    try 
		    {
		      // Create MessageDigest instance for MD5
		      MessageDigest md = MessageDigest.getInstance("MD5");

		      // Add password bytes to digest
		      md.update(input.getBytes());

		      // Get the hash's bytes
		      byte[] bytes = md.digest();

		      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
		      StringBuilder sb = new StringBuilder();
		      for (int i = 0; i < bytes.length; i++) {
		    	 
		        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		       // System.out.println(sb);
		      }

		      // Get complete hashed password in hex format
		      generated = sb.toString();
		    } catch (NoSuchAlgorithmException e) {
		      e.printStackTrace();
		    }
		  
		    return generated;
	}

	

}
