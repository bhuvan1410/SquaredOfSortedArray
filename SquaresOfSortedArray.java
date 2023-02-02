import java.util.Arrays;

public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int squaredNums[] = new int[size];

        for (int i = 0; i < size; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }

        Arrays.sort(squaredNums);

        return squaredNums;
    }

    public static void main(String[] args) {

        int[] firstArray = new int[5];
        firstArray[0] = -4;
        firstArray[1] = -1;
        firstArray[2] = 0;
        firstArray[3] = 3;
        firstArray[4] = 10;

        int[] secondArray = new int[5];
        secondArray[0] = -7;
        secondArray[1] = -3;
        secondArray[2] = 2;

        System.out.print("The array before sorting and squaring the elements: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + ",");
        }

        int[] newArray = sortedSquares(firstArray);
        System.out.println();

        System.out.print("The array after sorting and squaring the elements: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(newArray[i] + ",");
        }

        // [-7,-3,2,3,11]

    }
}
