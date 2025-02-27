//package threads;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class ThreeSum {
//  public static void main(String[] args) {
//    // int nums[] = {1, 2, 3, -2, -3, 0};
//    int nums[] = {-1, 0, 1, 2, -1, -4};
//    List<List<Integer>> output = threeSum(nums);
//    output.stream().forEach(i -> System.out.println(i));
//    System.out.println("size" + output.size());
//  }
//
//  private static List<List<Integer>> threeSum(int[] nums) {
//    Set<List<Integer>> out = new HashSet<>();
//
//    Set<Integer> set = new HashSet<>();
//    for (int i = 0; i < nums.length; i++) {
//      for (int j = i + 1; j < nums.length; j++) {
//        int total = nums[i] + nums[j];
//        if (set.contains(-total)) {
//          Set<Integer> set1 = new HashSet<>();
//          //  Set<Integer> set1 = Set.of(nums[i], nums[j], -total);
//          set1.add(nums[i]);
//          set1.add(nums[j]);
//          set1.add(-total);
//          List<Integer> integerList = new ArrayList<>(set1);
//          if (set1.size() == 3) {
//            out.add(integerList);
//          }
//        } else {
//          set.add(nums[i]);
//          set.add(nums[j]);
//        }
//      }
//    }
//    return List<List<Integer>>;
//  }
//}
