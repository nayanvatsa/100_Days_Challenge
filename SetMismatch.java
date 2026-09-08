class Solution {
    public int[] findErrorNums(int[] arr) {
        int i=0, n=arr.length;
        while (i<n){
            int rightidx = arr[i]-1;
            if (arr[i] == i+1 || arr[rightidx] == arr[i]) i++;
            else {
                swap (arr,i,rightidx);
            }
        }
          for ( i=0; i<n; i++){
                if (arr[i]!= i+1)
                return new int[]{arr[i], i + 1};
            }
            return new int[]{-1, -1};
    }
    private void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
