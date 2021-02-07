package classpart;

public class FunctionTest {
    //    1. 반환값이 int인 함수, 함수이름은 addNum
    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    //    2. 반환값이 없는 함수이며, 함수이름은 sayHello,
    //       매개변수로 인사말이 들어오면 그 인사말을 출력할 것
    public static void sayHello(String greeting) {

        System.out.println(greeting);
    }


    //    3. 1~100까지의 합을 구하는 함수. 매개변수는 필요없이 리턴만 있음
    public static int calcSum() {

        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        //1
        int number1 = 10;
        int number2 = 9;

        int a = addNum(number1, number2);
        System.out.println(a);

        //2
        sayHello("하이!");

        //3
        int b = calcSum();
        System.out.println(b);

    }
}
