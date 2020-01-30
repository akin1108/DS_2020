import java.util.*;
public class Two_sum {
	
	public void find_numbers(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					System.out.println(i+" , "+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[5];
		Two_sum ts = new Two_sum();
		System.out.println("Enter target element");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		System.out.println("Enter elements");
		for(int k=0; k<arr.length; k++) {
			arr[k]=sc.nextInt();
		}
		ts.find_numbers(arr, target);

	}

}
