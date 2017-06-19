import java.util.Arrays;

/**
 * Created by yangy on 2017/5/17.
 */
public class ArrayPartitionI {
    public static void main(String[] args) {

    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
