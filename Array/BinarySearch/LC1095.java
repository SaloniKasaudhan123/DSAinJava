
public class LC1095 {

    public int findPeakIdx(int[] arr) {
        int st = 0 , en = arr.length-1 , peakIdx = -1;
        while(st <= en){
            int mid = st + (en - st)/2;
            if(st == en) {
                peakIdx = st;
                break;
            }
            else if(arr[mid] > arr[mid+1]) en = mid;
            else st = mid + 1;
        }
        return peakIdx;
    }

    public int OrderAgnostic(int target ,int st, int end , int[] arr){
        int targetIdx = -1;
        boolean isAscending = false;
        if(st < end) isAscending = true;
        else isAscending = false;
        if(isAscending){
            while(st <= end){
                int mid = st + (end - st)/2;
                if(arr[mid] == target) targetIdx = mid;
                else if(arr[mid] > target) end = mid - 1;
                else st = mid + 1;
            }
        }else{
            while(st >= end){
                int mid = end + (st - end)/2;
                if(arr[mid] == target) targetIdx = mid;
                else if(arr[mid] > target) end = mid + 1;
                else st = mid - 1;
            }
        }
        return targetIdx;
    }
    public static void main(String[] args) {
        LC1095 s = new LC1095();
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peakIdx = s.findPeakIdx(arr);
        System.out.println("peak : " + peakIdx);
        int res = s.OrderAgnostic(target,0 , peakIdx , arr);
        System.out.println("res1 : " + res);
        if(res == -1){
            res = s.OrderAgnostic(target,arr.length-1 , peakIdx , arr);
        }
        System.out.println("res2 : " + res);
    } 
}

    
