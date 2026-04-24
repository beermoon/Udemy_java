package Method;
public class ParametertMethod {


    public static void sayHelloWorld(int noOfTimes) {
        for (int i = 1; i <= noOfTimes; i++) {
            System.out.println("Hello World");
        }
    }

    public static void sayHelloWorld2(int noOfTimes) {
        System.out.println(noOfTimes);
    }


    public static void main(String[] args) {

        sayHelloWorld(5);
        sayHelloWorld2(5);

    }
}
