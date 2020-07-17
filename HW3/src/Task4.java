public class Task4 {
	
	public static void main (String[] args) {
		int[] arr = {4, 889, 54, 63, 41, 11, 3, 17};
		int max = 0, min;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println ("max = " + max);
		
		min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println ("min = " + min);
	}
}