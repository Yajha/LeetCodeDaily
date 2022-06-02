package yajha.solution;

public class P50 {
    public double myPow(double x, int n) {
        long m=n;
        if (n>=0){
            return pow_helper(x,m);
        }else{
            return 1/pow_helper(x,-m);
        }
    }

    public double pow_helper(double x,long m){
        if (m==0){
            return 1.0;
        }else if (m%2==0){
            double t=pow_helper(x,m/2);
            return t*t;
        }else{
            double t=pow_helper(x,m/2);
            return x*t*t;
        }
    }
}
