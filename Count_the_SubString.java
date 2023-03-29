class Count_the_SubString {
    int countSubstring(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        int ct = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i] = Character.isUpperCase(s.charAt(i)) ? 1 : -1;
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + (Character.isUpperCase(s.charAt(j)) ? 1 : -1);
                if (dp[i][j] == 0)
                    ct++;
            }
        }
        return ct;
    }
}