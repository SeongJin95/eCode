package Practice;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int n = a.length+b.length;
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			if(i<a.length)
				array[i]=a[i];
			else
				array[i]=b[i-a.length];
		}		
		return array;				
	}
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}


public class StaticEx {

	public static void main(String[] args) {
		int array1[] = {1, 5, 7, 9};
		int array2[] = {3, 6, -1, 100, 77};
		int array3[] = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
