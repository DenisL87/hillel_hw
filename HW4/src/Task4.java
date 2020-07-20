public class Task4 {

    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int matrix = 1;
        int count = 0;
        
        while (arr.length > matrix * matrix) {
            matrix++;
        }
        
        for (int i = 0; i < matrix; i++) {
            for (int y = 0; y < matrix; y++) {
                if (count > arr.length - 1) {
                    System.out.print (0 + " ");
                }else {
                    System.out.print (arr[count] + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}