public class Max_Sum_path_Two_Arrays {
    int maxPathSum(int ar1[], int ar2[]) {
        int ans = 0, sum1 = 0, sum2 = 0, i = 0, j = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
            else {
                ans += Math.max(sum1, sum2) + ar1[i];
                sum1 = sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < ar1.length)
            sum1 += ar1[i++];
        while (j < ar2.length)
            sum2 += ar2[j++];
        ans += Math.max(sum1, sum2);
        return ans;
    }

}
