public class Task1 {
	
	public static void main (String[] args) {
		int[] array = {45, 89, 44, 63, 74, 56, 7, 98};
		
		System.out.println ("Even numbers:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print (array[i] + " ");
			}
		}
		
		System.out.println ("\nOdd numbers:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print (array[i] + " ");
			}
		}
	}
}