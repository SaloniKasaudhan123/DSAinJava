 
// Find Smallest Letter Greater Than Target


class Solution {
    public static void main(String[] args){
      char[]  letters = {'c','f','j','m' , 'x' , 'y'};
      char target = 'y' , ans = letters[0];
      int st = 0 , en = letters.length-1;
    
      while(st <= en){
        int mid = st + (en - st)/2;
        if(letters[mid] == target){
            st = mid + 1;
        }else if(letters[mid] > target) {
            ans = letters[mid];
            en = mid - 1;
        }
        else st = mid + 1;
      }
      System.out.println("ans : " + ans);
    }
}
