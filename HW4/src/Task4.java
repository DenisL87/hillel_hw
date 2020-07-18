public class Task4 {
	
	public static void main (String[] args) {

	int[] arr = {8, 6, 1, 8, 0, 6, 7, 2, 9};
	int count = 0;
		
		for (int i = 0; i < Math.sqrt(arr.length); i++) {
			if (count == arr.length) {
					break;
				}
			for (int y = 0; y < Math.sqrt(arr.length); y++) {
				if (count == arr.length) {
					break;
				}
				System.out.print (arr[count] + " ");
				count++;
			}
				System.out.println();
		}
	}
}