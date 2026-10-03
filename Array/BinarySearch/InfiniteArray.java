public class InfiniteArray {
    static int[] rangeofTarget(int[] arr, int target) {
        int[] range = new int[2];
        int st = 0, en = 1;
        while (st <= en) {
            if (target <= arr[en]) {
                range[0] = st;
                range[1] = en;
                break;
            } else {
                st = en + 1;
                en = (2 * st) + 1;
            }
        }
        return range;
    }

    static int searchTarget(int[] arr, int target, int st, int en) {
        int idx = -1;
        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (arr[mid] == target) {
                idx = mid;
                break;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else
                en = mid - 1;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 12, 14, 15, 19, 26, 29, 38, 45 };
        int target = 12;
        int[] res = rangeofTarget(arr, target);
        System.out.println("Range of target : " + res[0] + " " + res[1]);
        int targetIdx = searchTarget(arr, target, res[0], res[1]);
        System.out.println("Target idx : " + targetIdx);
    }
}