class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean found = false;
                    for (int x = 0; x < k; x++) {
                        if (nums3[x] == nums1[i]) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        nums3[k] = nums1[i];
                        k++;
                    }
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums3[i];
        }

        return result;
    }
}
