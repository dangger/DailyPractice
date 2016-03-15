package Test1_Recursion;
/**
 * Created by dangge on 2016/3/13.
 *  n的阶乘递归实现算法
 */
import java.util.Scanner;

public class Test1 {
	public static int judge(int n) {
		int result = 1;
		if (n == 1) {
			return result;
		} else {
			return n * judge(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input n");
		int n = scanner.nextInt();
		if (n < 0) {
			System.out.println("input error!");
		} else {
			int result = judge(n);
			System.out.println("the result is " + result);
		}
	}

}

