public class twoSum {
    public static void main(String[] args) {
        //given an array of int (nums) and an int (target), return indicies of 2 numbers so they add up to target from nums. Assume there is 1 solution and same element cannot be used twice.
        int nums[] = {2,7,11,15};
        int target = 9;

        //solution
        int[] array = new int[2];
        for (int i =0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = nums[i];
                    array[1] = nums[j];
                    System.out.println(array[0]);
                    System.out.println(array[1]);
                }
            }
        }
    }
}