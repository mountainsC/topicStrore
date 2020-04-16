package com.geek.test;

import android.util.Log;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @Author: chl
 * @Email: maplelucy1991@163.com
 * @CreateTime:2020/4/14
 * @Description:
 * @Modifier:
 * @ModifyContent:
 */
public class Solution {
    public static void main(String[] args) {
        reverse(1534236469);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        Log.e("666666666","6666666666");
        return (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) ? 0 : (int) n;
    }
}
