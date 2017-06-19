/**
 * Created by yangy on 2017/5/17.
 */
public class ReshapetheMatrix01 {
    public static void main(String[] args) {

    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (r * c != m * n)
            return nums;
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++)
            reshaped[i/c][i%c] = nums[i/n][i%n];
        return reshaped;
    }
}
