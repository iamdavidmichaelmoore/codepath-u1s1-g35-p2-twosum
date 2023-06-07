import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    /** 
    * 1. UNDERSTAND
    * Can we assume that all of the integers are positive?
    * Should I handle empty arrays?
    * Hypothetically: Is it safe to assume that the
    
    * 2. MATCH
    * Data Structures: Dictionary/HashMap
    * Pattern: Picking out the keys that add up to the target and selecting
    * the indices.
    * 
    * 3. PLAN
    *   i. Iterate through the array
    *   ii. Store elements in dictionary
    *   iii. Iterate through each key
    *   iv. Compute the complement 
    *   v. If found, then the target is found.
    *   vi Return the indices
    */

    List<Integer> test1 = new ArrayList<>(Arrays.asList(2,7,11,15));
    List<Integer> test2 = new ArrayList<>(Arrays.asList(3,2,4));
    List<Integer> test3 = new ArrayList<>(Arrays.asList(4,5,3));
    int[] result1 = Main.twoSum(9,test1);
    System.out.println("[" + result1[0] + "," + result1[1] + "]");
    int[] result2 = Main.twoSum(6,test2);
    System.out.println("[" + result2[0] + "," + result2[1] + "]");
    int[] result3 = Main.twoSum(8,test3);
    System.out.println("[" +result3[0] + "," + result3[1] + "]");
    
    
  }

  public static int[] twoSum(int target, List<Integer> nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.size(); i++) {
      int complement = target - nums.get(i);
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement),i};
      } else {
        // ERROR: Line 43 Formerly was map.put(complement,i);
        // I think Tolu was trying to tell us that just before the breakout ended.
        map.put(nums.get(i),i);
      }
    }
    return new int[0];
  }
}