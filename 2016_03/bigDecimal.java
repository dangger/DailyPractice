/**
 * Created by dangge on 2016/3/22.
 * 高精度减法的正确写法(雾
 */
import java.math.BigDecimal;
public class bigDecimal {
    public static double sub(double a,double b){
        BigDecimal v1 = new BigDecimal(Double.toString(a));
        BigDecimal v2 = new BigDecimal(Double.toString(b));
        return v1.subtract(v2).doubleValue();
    }

    public static void main(String args[]){

        System.out.println(sub(3.2,2.1));
    }
}
