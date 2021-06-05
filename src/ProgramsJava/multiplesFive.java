package ProgramsJava;

public class multiplesFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=multiply(6,10);
		System.out.println(result);

	}
	
	public static int multiply(int i,int j) {
		
		int k=1;
		int sum=0;
		while(k<=j) {
			sum=sum+i;
			k++;
		}
		
		return sum;
	}

}
/*public static int multiply(int i, int j) {
	int k=1;// counter variable
	int sum=0;
	
	if(k<=j) { //k will be increasing where j=10
		sum=sum+i;    // i=5 and sum will change
		k++; // k is counter variable helps to iterate elements
	}
	return sum;*/