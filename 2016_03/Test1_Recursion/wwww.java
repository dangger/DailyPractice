import java.io.BufferedInputStream;
import java.util.Scanner;

public class wwww {

    public static void main(String[] args) {
        Scanner sr = new Scanner(new BufferedInputStream(System.in));
        int m,n;
        while (sr.hasNext()) {
            m = sr.nextInt();
            n = sr.nextInt();
            System.out.println(akm(m,n));
        }
    }

    public static int akm(int a,int b){
        if(a==0)
            return b+1;
        else if(b==0){
            return akm(a-1,1);
        }
        else{
            return akm(a-1,akm(a,b-1));
        }
    }
}
