import jdk.dynalink.beans.StaticClass;

public class Fibonacci {
    public static String FibO(int n){
        String res = "";
        int f1 = 1,f2 = 1,temp;
        res = f1+","+f2;
        for(int i=3;i<n;i++){
            temp = f2;
            f2 = f1+f2;
            f1 = temp;
            res = res+","+f2;
        }
        return res;
    }
}
