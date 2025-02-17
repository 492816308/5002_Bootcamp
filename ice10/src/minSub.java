import java.util.LinkedList;
import java.util.Queue;

// Given an array of positive integers nums and a positive integer target, return the minimal length of a
//        subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


public class minSub {
    public static int minSubArrayLenJCF(int target, int[] nums) {
       Queue<Integer> queue = new LinkedList<>();
        queue.add(nums[0]);
        int sum = nums[0];
        int size = Integer.MAX_VALUE;
        int i = 1;

        while (true) {
            if (sum >= target) {
                while (sum >= target) {
                    size = Math.min(size, queue.size());
                    sum -= queue.poll();
                }
            } else if (sum < target) {
                if (i >= nums.length) break;
                while (sum < target && i < nums.length) {
                    queue.add(nums[i]);
                    sum += nums[i];
                    i++;
                }
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        // TODO code it
        LinkedQueueInt queue = new LinkedQueueInt();
        queue.enqueue(nums[0]);
        int sum = nums[0];
        int size = Integer.MAX_VALUE;
        int i = 1;

        while (true) {
            if (sum >= target) {
                while (sum >= target) {
                    size = Math.min(size, queue.size());
                    sum -= queue.dequeue();
                }
            } else if (sum < target) {
                if (i >= nums.length) break;
                while (sum < target && i < nums.length) {
                    queue.enqueue(nums[i]);
                    sum += nums[i];
                    i++;
                }
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }



    public static void main(String[] args)
    {
        int target=8;
        int[]  nums={1,3,4,7};
        //System.out.println(minSubArrayLenJCF(target,nums));
        System.out.println(minSubArrayLen(target,nums));

    }
}
