package ProgramsJava;

import java.util.ArrayList;

public class printmatcharrayvaluestwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,7,9};
		int b[]= {2,6,1,9};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				al.add(a[i]);
			}
		}
		
		/*for (Integer integer : al) {
			System.out.println(integer);
		} */
		
		Object c[]=al.toArray();
		for(Object ob:c) {
			System.out.println(ob);
		}
	}

}
