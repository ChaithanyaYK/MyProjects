package ProgramsJava;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mam";
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println("Reversed String is ---> "+t);
		//check if palindrome
		if(s.equals(t)) {
			System.out.println(t+" is a Palindrome");
		}

	}

}
