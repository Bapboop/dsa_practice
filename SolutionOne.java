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

class SolutionOne {
    
}