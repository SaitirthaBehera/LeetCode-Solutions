class Solution {
    public int reverse(int x) {
        boolean isNegative = x<0;
        long absX=Math.abs((long)x);

        String num=String.valueOf(absX);
        String rev=new StringBuilder(num).reverse().toString();
        long nm=Long.valueOf(rev);
        if (isNegative){
            nm=-nm;
        }
        if (nm< Integer.MIN_VALUE || nm>Integer.MAX_VALUE){
            return 0;
        }
        return (int)nm;
    }
}