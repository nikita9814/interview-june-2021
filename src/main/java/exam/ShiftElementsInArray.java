package exam;

public class ShiftElementsInArray {

  public void shift(int sum,intvals[] ) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
  
        if (sum < 0) {
            return 0;
        }
        if (vals == null || vals.length == 0) {
            return 0;
        }

        int dp[] = new int[sum + 1];
        dp[0] = 1;
        for (int i = 0; i < vals.length; ++i) {
            for (int j = vals[i]; j <= sum; ++j) {
                dp[j] += dp[j - vals[i]];
            }
        }
        return dp[sum];
    }

  }

}
