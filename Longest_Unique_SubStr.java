
public class Longest_Unique_SubStr {
	static final int LEN = 256; 
	
	int  nonRepeatingString(String s) {
		int n = s.length();
		int current = 1;
		int max = 1;
		int previous, i;
		int visited[] = new int[LEN];
		
		for(i=0; i<LEN; i++) {
			visited[i] = -1;
		}
		
		visited[s.charAt(0)] = 0;
		
		for(i=1; i<n; i++) {
			previous = visited[s.charAt(i)];
			if(previous == -1 || i - current > previous) {
				current++;
			}
			
			else {
				if(current > max) {
					max = current;
				}
				current = i - previous;
			}
			
			visited[s.charAt(i)] = i;
		}
		
		if(current > max) {
			max = current;
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		Longest_Unique_SubStr luss = new Longest_Unique_SubStr();
		String str = "annkkitssouarabbbh";
		System.out.println("The string is : "+str);
		System.out.println("Length of longest non repetative sub string = " + luss.nonRepeatingString(str));
	}

}
