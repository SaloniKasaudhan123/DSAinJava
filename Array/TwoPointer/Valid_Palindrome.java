package TwoPointer;

public class Valid_Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        String newStr = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = newStr.length() - 1;
        boolean res = true;
        if (newStr.isEmpty()) {
            res = true;
        } else {
            while (i <= j) {
                if (newStr.charAt(i) != newStr.charAt(j)) {
                    res = false;
                    break;
                }
                i++;
                j--;
            }
        }


        System.out.println(res);
    }
}