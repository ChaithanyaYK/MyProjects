package ProgramsJava;

public class maxdifferenceadjacentarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,20,8,10,7,31};//3,4,2,7
		int diff=0;
		int length=a.length;
		System.out.println("Length of array declared --> "+length); //i-0,length 4 , i=1			
		for(int i=0;i<a.length-1;i++) { // to stop at index 3 length -1 
			if(a[i+1]-a[i]>diff) { 
				diff=a[i+1]-a[i];//3, 
			}
		}
		System.out.println("Max difference value in array is ----> "+diff);
	}
	//3 > 0

}
