
public class Merge_2_sorted_arrays {
	
	static void merge(int a1[], int a2[]) {
		int len1 = a1.length;
		int len2 = a2.length;
		
		int a3[] = new int[len1+len2];
		
		for(int i=0 ; i<len1 ; i++) {
			for(int j=0 ; j<len2 ; j++) {
				a3[j+len1] = a2[j];
			}
			a3[i] = a1[i];
		//	a3[i+len1] = a2[i];
		}
		
		for(int k=0; k<len1+len2; k++) {
			System.out.print(a3[k]+" ");
		}
				
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,6,9};
		int arr2[] = {4,5,6,7};
		merge(arr1,arr2);

	}

}
