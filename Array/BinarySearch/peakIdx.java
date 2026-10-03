
public class peakIdx{
    public static int peakIndexInMountainArray(int[] arr) {

        // int st = 0 , en = arr.length-1 , peakIdx = -1;
        // while(st <= en){
        //     int mid = st + (en - st)/2;
        //     System.out.println("mid : " + mid);
        //     if(arr[mid] > arr[mid+1]){
        //          System.out.println("en : " + en);
        //          en = mid;
        //          peakIdx = mid;
        //          System.out.println("en : " + en);
        //          break;
        //         }else{
        //          System.out.println("st : " + st);
        //          st = mid+1;
        //          System.out.println("st : " + st);
        //         peakIdx = mid+1;
        //      }
        // }
        // return peakIdx;



        int st = 0, en = arr.length - 1 , peakIdx = -1;
        if(arr.length > 1){
        while (st <= en) {
            int mid = st + (en - st) / 2;
                if (arr[mid] > arr[mid + 1]) {
                en = mid;
            } else {
                st = mid + 1;
            }
            if (st == en) {
                peakIdx = st;
                break;
            }
        }
    }else peakIdx = 0; 
        return peakIdx;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int res = peakIndexInMountainArray(arr);
        System.out.println("res : " + res);
    }
}