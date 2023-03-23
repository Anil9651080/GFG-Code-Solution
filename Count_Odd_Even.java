class Count_Odd_Even {
    public void countOddEven(int[] arr, int n) {
        int countEven = 0;
        int countodd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countodd++;
            }
        }
        System.out.println(countodd + " " + countEven);
    }
}