class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies = 0;
        int n = candies.length;

        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = candies[i] + extraCandies;

            if (temp >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}