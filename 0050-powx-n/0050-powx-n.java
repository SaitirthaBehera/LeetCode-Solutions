class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        
        return power(x,n);
    }
    private double power(double x,int n){
        if(n==0){
            return 1.0;
        }
        if(n%2==0){
            return power(x*x,n/2);
        }else{
            return x*power(x*x,n/2);
        }
    }
}