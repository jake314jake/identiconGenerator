package test;

import Hash.Algorithms.MD5Hash;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashAlgorithmsMD5test("this is test");
	}
    static void HashAlgorithmsMD5test(String input) {
    	MD5Hash hashObj=new MD5Hash();
    	String resault=hashObj.getHash(input);
    	System.out.println(resault);
    	System.out.println(resault.length());
    }
}
