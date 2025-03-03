class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum;
        int i = 0;
        int j = numbers.length - 1;
        do {
            sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        } while (sum != target);
        return new int[]{i + 1, j + 1};
    }
}
