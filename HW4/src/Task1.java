public class Task1 {
	
	public static void main (String[] args){
			int[] arrN = {12, 6, 8, 98, 71, 55, 56, 32, 8, 14};
			int[] arrK = {8, 52, 98, 47, 71, 8};
			int[] tempArr = new int[arrK.length];
			int arrCount = 0;
		
			for (int i = 0; i < arrK.length; i++) {
				for (int y = arrCount; y < arrN.length; y++) {
					if (arrK[i] != arrN[y]) {
						arrCount++;
					}else {
						tempArr[i] = arrN[arrCount];
						break;
					}
				}
			}
			
			int count = 0;
			for (int i = 0; i < arrK.length; i++) {
				if (arrK[i] == tempArr[i]) {
					count++;
				}else {
					break;
				}
			}
			
			if (count == arrK.length) {
				System.out.print ("Is a subsequence");
			}else {
				System.out.print ("Isn't a subsequence");
			}
    }
}