package Test1_Recursion;
/**
 * Created by dangge on 2016/3/13.
 *  n的阶乘递归实现算法
 */
import java.util.Scanner;
public class Factorial {
    public static int judge(int n){
        int result = 1;
        if(n == 0|n == 1){
            return result; //不知道这么写好不好
        }
        else {
            result = n * judge(n-1);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入 N ");
        int n = scanner.nextInt();
        int result = judge(n);

        System.out.println("n的阶乘为" +result);
    }
}
