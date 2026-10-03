package LinearSearch;



public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {18,12,-7,3,14,28};
        int idx = -1, startIdx = 1 , endIdx = 4 , target = 4;
        for(int i = startIdx ; i <= endIdx ; i++){
            if(arr[i] == target) idx = i;
        }
        System.out.println(idx);
    }
}
