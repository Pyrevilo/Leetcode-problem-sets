package easy;

import java.util.*;

class Solution {
    public static void main(String[] args) {

        int N = -12345;

        // Implement your solution here
        String temp = Integer.toString(N);
        int[] nums = new int[temp.length()];
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int k = 0; k < temp.length(); k++) {
            nums[k] = Character.getNumericValue(temp.charAt(k));
        }
        int counter = 0;
        if (N > 0) {
            for (int i=0; i<nums.length;i++) {
                if (nums[i] == 5) {
                    continue;
                }
                output.add(nums[i]);
            }
        }
        if (N < 0) {
            nums[0] = Math.abs(nums[0]);
            for (int j = nums.length -1; j > 0; j--) {
                if (nums[j] == 5 && counter == 0) {
                    counter++;
                    continue;
                }
                output.add(nums[j]);
                System.out.println(nums[j]);
            }
            Collections.reverse(output);
            System.out.println(output);
        }
        /* 
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : output) {
            stringBuilder.append(number);
        }
        String finalOutput = stringBuilder.toString();
        int finalvalue = Integer.parseInt(finalOutput);
        System.out.println(finalvalue);

        */
    }
}