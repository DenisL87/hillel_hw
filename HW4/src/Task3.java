public class Task3 {
	
	public static void main (String[] args) {

	int[] mainArr = {45, 987, 55, 646, 56, 6544, 29, 78, 222};
	int[] arr = new int[mainArr.length];
	int temp = 0;
	int count = 0;
		
	for (int i = 0; i < arr.length; i++) {
            arr[i] = mainArr[i];
	}
		
	for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 9) {
		count = 1;
		temp = arr[i];
		while (true) {
                    temp /= 10;
                    if (temp > 0) {
                        count++;
                    }else {
                        break;
                    }
                }

	int[] newArr = new int[count];
	for (int y = 0; y < newArr.length; y++) {
            newArr[y] = arr[i] % 10;
		arr[i] /= 10;
	}
			
	for (int z = 0; z < newArr.length; z++) {
            int loopCount = 1;
            for (int z1 = newArr.length - 1; z1 > - 1; z1--) {
		if (newArr[z] != newArr [z1]) {
                	loopCount++;
		}else {
                    break;
                }
            }

            if (loopCount == newArr.length) {
		System.out.println (mainArr[i]);
            }
	}
    }
}
}
}