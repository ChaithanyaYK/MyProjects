package ProgramsJava;

public class stringReverse {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String str="Chaithanya";
		int length=str.length();
		char[] strchar=str.toCharArray();
		String reverseString="";
		
		for(int i=strchar.length-1;i>=0;i--) {
			reverseString=reverseString+strchar[i];
		}
		System.out.println("Reversed String is --------> "+reverseString);
	}

}
