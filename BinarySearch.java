/* 
 *  Given an array of integers nums which is sorted in ascending order, and an integer target
 *  write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * 
 *  O(log n) run time complexity
 * 
 *  I: nums = [-1, 0, 3, 5, 9, 12] & target = 9
 *  O: 4
 * 
 *  I: [-1, 0, 3, 5, 9, 12] & target = 2
 *  O: -1   (2 does not exist)
 * 
 *  Summarize: Arr of nums, already sorted, find the target integer index. If it doesn't exist, return -1.
 * 
 *  Example: arr = [1, 2, 3,]  tar = 3
 *  expected output: 2
 *      
 *  arr = [0, 1, 2] tar = 3
 *  expected output: -1
 * 
 *  Approach: Two variables to track the indices of the array. 
 *  Loop to split the Arr in half. Check if mid point is =, < or > target. (Loop until left <= right)
 *          if = return mid
 *          if mid < tar, we know the answer, if present, would be on the right half of the Array.
 *          if mid > tar, we know the answer, if present, would be on the left half of the Array.
 */

public class BinarySearch {

    public static void main(String args[]) {
        int[] testArr1 = new int[]{1, 2, 3, 4, 5};
        int target1 = 3;
        System.out.println(findIndex(testArr1, target1)); // 2
        
        int[] testArr2 = new int[]{1, 2, 3};
        int target2 = 4;
        System.out.println(findIndex(testArr2, target2)); // -1 (not found)
    }

    public static int findIndex(int[] arr, int target) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while (leftPointer <= rightPointer) {
            int mid = (leftPointer + rightPointer)/2; 
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                leftPointer = mid+1;
            } else {
                rightPointer = mid-1;
            }
        }
        return -1;
    }
 }
