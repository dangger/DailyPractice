/**
 * Created by dangge on 2016/3/15.
 */
import java.util.*;
public class Akm {
    int Ack(int n,int m) {
        if (n == 1 && m == 0) return 2;
        if (n == 0 && m >= 0) return 1;
        if (n >= 2 && m == 0) return n + 2;
        if (n >= 1 && m >= 1) return Ack(Ack(n - 1, m), m - 1);
         return -1;
    }
    public static void main(String args[])
    {
        Akm akm=new Akm();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        System.out.println(akm.Ack(n,m));
    }
}
