package classpart;

public class FunctionTest2 {
    //함수(사칙연산)
    public static int subtractNum(int num1, int num2) {
        int result;
        result = num1 - num2;
        return result;
    }

    public static int multiNum(int n1, int n2) {
        int result;
        result = n1 * n2;
        return result;
    }

    public static int divideNum(int number1, int number2) {
        int result;
        result = number1 / number2;
        return result;
    }

    public static void main(String[] args) {

        int a = subtractNum(372, 72);
        System.out.println(a);

        int num1 = 10;
        int num2 = 20;
        int b = subtractNum(num1, num2);
        System.out.println(b);

        int c = multiNum(3, 5);
        System.out.println(c);

        int number1 = 10;
        int number2 = 3;
        int d = multiNum(number1, number2);
        System.out.println(d);

        int e = divideNum(10, 5);
        System.out.println(e);

        int s1 = 30;
        int s2 = 3;
        int f = divideNum(s1, s2);
        System.out.println(f);
    }
}
