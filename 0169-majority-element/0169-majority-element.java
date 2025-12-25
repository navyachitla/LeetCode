class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;   // choose new candidate
            }
            if (num == candidate)
                count++;           // same as candidate → increase confidence
            else
                count--;           // different → decrease confidence
        }

        return candidate;          // final majority element
    }
}
