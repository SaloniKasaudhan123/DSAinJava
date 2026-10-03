package BinarySearch2D;

public class Search2D {

    public static void main(String[] args) {
        int[][] arr = {{18 , 19 , 20 , 21} , {36 , 37 , 38 , 40},{45 , 50 , 51 , 56},{60 , 65 , 70 , 75}};
        int target = 55 , row = 0 , col = arr[0].length-1 , targetRow = -1 , targetCol = -1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target) {
                targetRow = row;
                targetCol = col;
                break;
            }else if(arr[row][col] < target) row++;
            else col--;
        }
        System.out.println("target idx : " + targetRow + " " + targetCol);
    }
}