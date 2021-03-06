package Test1_Recursion;
import java.util.Scanner;
/**
 * Created by dangge on 2016/3/13.
 * Solve Fibonacci problem by using recursion.
 */
public class Fibonacci {
    public static int judge(int n){
        int result = 1;
        if(n == 0|n == 1){
            return result;
        }
        else {
            result = judge(n-1) + judge(n-2);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 N");
        int n = scanner.nextInt();
        int result = judge(n);
        System.out.println("斐波那契数列的第 N 项是" + result);
    }
}
