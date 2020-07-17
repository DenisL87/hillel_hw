public class Task2 {
	
	public static void main (String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 2, 13, 14, 15, 17, 19, 28, 29, 31, 32, 33, 34, 35, 36, 37, 38, 41, 43, 45};
		int count = 0;
		int number = 0;
					
			while (count < arr.length) {
				int countOne = 2;
				while (countOne < arr[count]) {
										
					number = arr[count] % countOne;

					if (number == 0) {
						countOne = arr[count];
					} 
					countOne++;
				}
				if (number != 0) {
					System.out.print (arr[count] + " ");
				}
				if (arr[count] == 2) {
					System.out.print (arr[count] + " ");
				}
				count++;
			}
	}
}