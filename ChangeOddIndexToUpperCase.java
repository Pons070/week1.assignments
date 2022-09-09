package week1Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]%2!= 0) {
				char oddIndex = charArray[i];
				
				oddIndex=Character.toUpperCase(oddIndex);
				
				System.out.println("The odd index is: "+oddIndex);
				
			}
			
		}
		
		
	}

}
