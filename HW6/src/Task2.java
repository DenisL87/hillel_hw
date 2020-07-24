class Task2 {
    static int num = 7;
    static int count = 1;
    public static void main(String[] args){
        printNumbers(num);
        }
    public static void printNumbers(int a){
        if (count > a) {
            return;
        } else {
            System.out.println(count);
            count++;
            printNumbers(num);
        }
    }
}