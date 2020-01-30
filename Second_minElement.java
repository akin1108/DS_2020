
public class Second_minElement {
	
	void second_min(int a[]) {
		int len = a.length;
		int first, second;
		if(len < 2) {
			System.out.println("Need atleast 2 elements ");
		}
		first = second = Integer.MAX_VALUE;
		
		for(int i=0;i<len;i++) {
			if(a[i] < first) {
				second = first;
				first = a[i];
			}
			
			else if(a[i] < second && a[i] != first ) {
				second = a[i];
			}
		}
		
		System.out.println("Seccond Minimum element is : "+second);
	}

	public static void main(String[] args) {
		Second_minElement sme = new Second_minElement();
		int arr[] = {23,4,32,65,21,9,0,64,25,2};
		sme.second_min(arr);

	}

}
