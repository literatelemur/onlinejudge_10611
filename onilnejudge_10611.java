import java.util.*;
public class onilnejudge_10611 {
	public static void main(String[] args) {
		
		// Collecting input data.
		Scanner input = new Scanner(System.in);
		while (input.hasNext()){
			int numVes = input.nextInt();
			int numCon = input.nextInt();
			
			int[] vesSizes = new int[numVes];
			int[] conIndices = new int[numCon - 1];
			
			for (int i = 0; i < numVes; i++){
				String num = input.next();
				if (num.length() - 2 > -1) {
					if (num.substring(num.length() - 2, num.length()) != "\n"){
						vesSizes[i] = Integer.parseInt(num);
					}else {
						vesSizes[i] = Integer.parseInt(num.substring(num.length() - 2, num.length()));
					}
				}
			}
		}
		
	}
}