package com.elysia.market.stock.core.common;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @BelongsProject: Elysia
 * @BelongsPackage: com.elysia.market.stock.core.common
 * @Author: ElysiaKafka
 * @CreateTime: 2024-01-04  21:23:49
 * @Description: TODO
 * @Version: 1.0
 */
public class DemoTest extends UnitTestBase {
    @Test
    public void test() {
        int[] nums = {1,2,3,1};
        int target = 3;
        int[] ints = twoSum4(nums, target);
        System.out.println("[" + ints[0] + "," + ints[1] + "]");
    }

    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2 + 1;
        for(int i = 0, j = nums.length - 1; i < n; i++, j--) {
            if(i != j && nums[i] + nums[j] == target){
                return new int[] {i, j};
            }
            if(map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
            if(map.containsKey(target - nums[j])) {
                return new int[] {j, map.get(target - nums[j])};
            }
            map.put(nums[j], j);
        }
        return null;
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
            boolean containsValue = map.containsValue(target - nums[i]);
            if (containsValue && i!= 0) {
                Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
                for (Map.Entry<Integer, Integer> entry : entries) {
//                    if (entry.getKey().intValue() == i) {
//                        continue;
//                    }
                    if (entry.getValue().intValue() == (target - nums[i])){
                        result[0] = entry.getKey().intValue();
                        result[1] = i;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
            int j = target - nums[i];
            boolean containsValue = map.containsValue(j);
            if (containsValue && i != 0) {
                final int temp = i;
                map.forEach((key, value) -> {
                    if (value == j) {
                        return;
                    }
                    if (key < temp) {
                        result[0] = key.intValue();
                        result[1] = temp;
                    } else {
                        result[0] = temp;
                        result[1] = key.intValue();
                    }
                });
                return result;
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
