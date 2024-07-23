public class findSumOfNaturalNumbers {

    public static int findSum(int n) {
        return n * (n + 1) / 2; 
    }

    public static void main(String[] args) {
        int sumOfFive = findSum(5);
        System.out.println(sumOfFive); // i.e. 15 (1 + 2 + 3 + 4 + 5)
    }
}
