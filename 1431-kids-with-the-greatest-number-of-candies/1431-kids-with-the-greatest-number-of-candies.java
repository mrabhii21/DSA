
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies
        int max = 0;

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        // Check each child
        for (int candy : candies) {

            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
