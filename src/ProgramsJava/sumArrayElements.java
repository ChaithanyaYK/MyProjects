package ProgramsJava;

public class sumArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum=sumArray(a);
		System.out.println("Sum of array is --> "+sum);
	}
	
	public static int sumArray(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

}
