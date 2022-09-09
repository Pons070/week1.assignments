package week1Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="madam";
		String Rev="";
		
		for (int i = A.length()-1; i>=0; --i) {
			
		Rev=Rev+A.charAt(i);
			
		if(A.equalsIgnoreCase(Rev))
		{
		System.out.println("The given string is a PALLINDROME");
		
		}
		else {
			System.out.println("The given string is NOT a PALINDROME");
			break;
		}
			
			
		}
		
}}
