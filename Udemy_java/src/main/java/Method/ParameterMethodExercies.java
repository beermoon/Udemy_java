package Method;

public class ParameterMethodExercies {

    public static void sum(int firstNumber, int SecondNumber,int thirdNumber) {
        int sum = firstNumber + SecondNumber + thirdNumber;
        System.out.println(sum);
    }

    public static void printMultiplicatonTable(int n) {
        for (int i =1; i<=10; i++) {
            System.out.printf("%d * %d = %d", n,i,n * i).println();
        }
    }

    public static void printMultiplicatonTable() {
        for (int i =1; i<=10; i++) {
            System.out.printf("%d * %d = %d", 5,i,5 * i).println();
        }
    }


    public static void printNumbers(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }

    public static void printSquaresOfNumbers(int n ) {
        for (int i = 1; i <=n; i++) {
            System.out.println(i*i);
        }
    }

    public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    // 1번 연습문제
    public static int sumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int sum = firstNumber + secondNumber + thirdNumber;
        return sum;
    }

    // 2번 연습문제
    public static int calculatThirdAngle(int angle1, int angle2) {
        int angle3 = 180 - (angle1 + angle2);
        return angle3;
    }


    public static void main(String[] args) {
        printNumbers(4);
        printSquaresOfNumbers(10);
        printMultiplicatonTable(9);
        printMultiplicatonTable();

        sum(1,2,3);

        sumOfTwoNumbers(1,2);


        // 연습문제
        // 1. 세수의 합의 값을 리턴해라
        // 2. 삼각형 두각의 주어졌을때 삼각형 마지막 각을 리턴해라

        // 1번 문제
        int sum = sumOfThreeNumbers(3,4,5);
        System.out.println(sum);

        // 2번 문제
        int triangleSum = calculatThirdAngle(80,60);
        System.out.println(triangleSum);
    }
}
