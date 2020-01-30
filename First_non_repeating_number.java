
public class First_non_repeating_number {
	
	static void nonRep(int arr[]) {
		
		int len = arr.length;
		int count[] = new int[len];
		
		for(int i=0; i<len; i++) {
			count[i] = 0;
		}
		
		for(int i=0; i<len ; i++) {
	         for(int j=0; j<len ; j++) {
	            if(i!=j && arr[i]==arr[j]) {
	               count[i]++;
	            }
	         }
		}
		
		for(int i=0; i<len ; i++) {
	         if(count[i]==0) {
	            System.out.println(arr[i]);
	            break;
	         }
	      }
	}

	public static void main(String[] args) {
		int arr[] = {1,2,1,32,24,24,1,457,558,0};
		nonRep(arr);

	}

}
