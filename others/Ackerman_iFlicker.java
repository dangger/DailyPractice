import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sr = new Scanner(new BufferedInputStream(System.in));
        int m,n;
        while (sr.hasNext()) {
            n = sr.nextInt();
            m = sr.nextInt();
            System.out.println(akm(n,m));
        }
    }

    public static int akm(int n,int m){
        if(n==0)
            return m+1;
        else if(m==0){
            return akm(1,n-1);
        }
        else{
            return akm(akm(n,m-1),n-1);
        }
    }
}
