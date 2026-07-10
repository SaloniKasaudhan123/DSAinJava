package TwoPointer;

public class TwoSumSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,9};
        int idx1 = -1 ,idx2 = -1,k = 9, i = 0 , j = arr.length-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == k) {
                idx1 = i;
                idx2 = j;
                break;
            }
            else if(sum < k) i++;
            else j--;
            System.out.println("Index : " + idx1 + " " + idx2);
        }
        System.out.println("Index : " + idx1 + " " + idx2);
    }
}
