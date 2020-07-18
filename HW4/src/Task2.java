public class Task2 {
	
	public static void main (String[] args) {
		int[] arr = {556, 999, 21, 45, 79, 31000, 49, 5};
		int temp = 0;
        int longest = 0;
        int longestNumDigits = 0;
        int shortest = 0;
        int shortestNumDigits = 1;
                                		
			for (int i = 0; i < arr.length; i++) {
                int count = 1;
                temp = arr[i];
				
                while (true) {
                    temp /= 10;
                    if (temp > 0) {
                        count++;
                    }else {
                        break;
                    }
                }
                   
                if (count > longestNumDigits) {
                    longestNumDigits = count;
                    longest = arr[i];
                }

            }
			
		shortestNumDigits = longestNumDigits;
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                temp = arr[i];
                    
                while (true) {
                    temp /= 10;
                    if (temp > 0) {
                        count++;
                    }else {
                        break;
                    }
                }
                    
                if (count < shortestNumDigits) {
                    shortestNumDigits = count;
                    shortest = arr[i];
                }
            }
		System.out.println("The longest number is " + longest + ", consists of " + longestNumDigits + " digit(s).");
		System.out.println("The shortest number is " + shortest + ", consists of " + shortestNumDigits + " digit(s).");
    }
}