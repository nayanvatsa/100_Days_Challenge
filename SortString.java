public class GFG {

   
    static void merge(char[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] l = new char[n1];
        char[] r = new char[n2];

        for (int i = 0; i < n1; i++)
            l[i] = arr[left + i];

        for (int i = 0; i < n2; i++)
            r[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (l[i] <= r[j])
                arr[k++] = l[i++];
            else
                arr[k++] = r[j++];
        }

        while (i < n1)
            arr[k++] = l[i++];

        while (j < n2)
            arr[k++] = r[j++];
    }

   
    static void mergeSort(char[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        String str = "GrandHero;

        char[] chars = str.toCharArray();

        mergeSort(chars, 0, chars.length - 1);

        String sortedString = new String(chars);

        System.out.println("Input String : " + str);
        System.out.println("Sorted String : " + sortedString);
    }
}
