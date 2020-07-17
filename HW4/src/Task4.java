public class Task4 {
	
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int y = 0; y < 3; y++) {
				System.out.print (arr[count] + " ");
				count++;
			}
				System.out.println();
		}
	}
}