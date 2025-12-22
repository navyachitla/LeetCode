class Solution {
    public int removeDuplicates(int[] nums) {
     if (nums.length == 0) return 0;

        int[] arr = new int[nums.length];
        int j = 0;
        int count=0;

        arr[j] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i -1] && count==0) {
                count=count+1;
                j++;
                arr[j] = nums[i];
            }
            else if (nums[i] != nums[i -1]) {
                count=0;
                j++;
                arr[j] = nums[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            nums[i] = arr[i];
        }

        return j + 1; 
    }
}