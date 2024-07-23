public class averageOfThreeNumbers {

    public static void threeNumberAverage(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum/3; //double so we get exact decimal average
        System.out.println(avg);
    }


    public static void main(String[] args) {
        threeNumberAverage(90, 95, 100);

    }
}
