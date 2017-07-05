
public class loopProblem {
	public static void main(String[] args) {
		int j = 1;
		int k = 1;
		int i = 1;
		int limit = 5;
		// To be able to rewrite this code for the nth number instead of ending only
		// at 5, I made a "limit" variable which can be changed to change the size of the output.
		
		while(i <= limit){
		if (j <= (limit-i)){
			System.out.print(".");
			j++;
		}
		else if (k <= i){
			System.out.print(i);
			k++;
		}
		else{
			System.out.println();
			i++;
			j = 1;
			k = 1;
		}
		}
	}
}
