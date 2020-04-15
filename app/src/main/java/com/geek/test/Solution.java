package com.geek.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chl
 * @Email: maplelucy1991@163.com
 * @CreateTime:2020/4/14
 * @Description:
 * @Modifier:
 * @ModifyContent:
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
