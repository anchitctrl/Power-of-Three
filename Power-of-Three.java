class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n==0) return false;
        while(n>=1){
            int r=n%3;
            if(r!=0) return false;
            n=n/3;
            if(r==0 && n==1) return true;
        }
        return false;
    }
}
