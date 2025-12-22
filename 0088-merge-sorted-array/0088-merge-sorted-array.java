import java.util.*;

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: merge nums2 into nums1
        for (int i = 0, j = m; i < n; i++, j++) {
            nums1[j] = nums2[i];
        }

        // Step 2: bubble sort full array
        for (int i = 0; i < (m + n) - 1; i++) {
            for (int j = 0; j < (m + n) - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }

        // Step 3: build a new array without zeros
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m + n; i++) {
            if (nums1[i] != 0) {
                list.add(nums1[i]);
            }
        }

        // Convert list back to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
