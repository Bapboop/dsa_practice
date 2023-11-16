//  SEAT METHOD:
/* Summarize:
*  We are given an array that has values. Every element will appear twice except one value.
*  Requires O(n) runtime and O(1) space complexity.
*/

/* Examples
*  Inputs: [1, 1, 2, 3, 3, 4, 4]
*  Output: 2
*
* (If there is only one item in the array)
* Inputs: [1]
* Outputs: 1
*/ 

/* Approach:
*  Iterate through the list.
*  Store the key (nums[i]) and the value (count of appearances).
*  At the end, return int that only has appeared once.  (Iterate through hashmap and find value = 1)
*  If length = 1, return nums[0].
*/

/* Test:
 * 
 */
import java.util.HashMap;
import java.util.Map;

class SolutionOne {
    public static void main(String[] args) {
        int[] test1 = new int[]{2, 2, 1, 1, 5};
        int[] test2 = new int[]{4}; 
        System.out.println(singleNum(test1)); //5
        System.out.println(singleNum(test2)); //4
    }

    public static int singleNum(int []  nums) {
        int solution = 0;
        if (nums.length == 1 ) {
            return nums[0];
        }
        // HashMap to store all K (nums[i]) : V (appearance count)
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0)+1);
        }

        // Get all of the K:V pairs, Check if value = 1
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                solution = entry.getKey();
            }
        }
        return solution;
    }
}