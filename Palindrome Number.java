class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int n,num=0;
        while (x>0){
        n = x%10;
        num = (num*10)+n;
        x /= 10;
        }
        if (ori==num) return true;
        else return false;
    }
}
