class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0, n=arr.length;
       
        while (i<n){
             int rightidx = arr[i]-1;
            if (arr[i]<=0 || arr[i]==i+1 || arr[i]>n || arr[i]==arr[rightidx]) {
                i++;
            }
            else swap(arr,i,arr[i]-1);
        }
        for (i=0; i<n; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
    private void swap (int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
