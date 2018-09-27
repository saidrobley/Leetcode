import java.util.HashSet;
import java.util.Set;
/*
	Given an array of integers, fin if the array contains any duplicates
 */
public class ContainsDuplicates {
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(getDuplicates(nums));
	}
	
	public static boolean getDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num: nums) {
			if(set.contains(num)) {
				return true;
			} else {
				set.add(num);
			}
		}
		return false;
	}
	
}
