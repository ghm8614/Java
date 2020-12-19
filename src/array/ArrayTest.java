package array;

public class ArrayTest {
    public static void main(String[] args) {

        //배열을 이용한 1부터10까지의 합 출력
        int[] arr = new int[10];
        int total = 0;
        for (int i = 0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
    }
}
