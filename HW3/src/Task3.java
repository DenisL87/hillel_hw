public class Task3 {
	
	public static void main (String[] args) {
		int[] array = new int[20];
				
		for (int i = 0; i < array.length; i++) {
			if (i < 2){
                array[i] = 1;
			} else {
                array[i] = array[i - 1] + array[i - 2];
			}
                        
                System.out.print (array[i] + " ");
		}
	}
}