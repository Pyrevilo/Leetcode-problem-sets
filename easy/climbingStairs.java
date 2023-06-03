package easy;
import java.util.ArrayList;
//You are climbing a staircase. It takes n steps to reach the top. 
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class climbingStairs {
    public static void main(String[] args) {
    //test case
    int n = 45;

    //solution
    //fibonacci sequenece where n is the sum of the prior 2 numbers.
    ArrayList<Integer> combo = new ArrayList<Integer>();
    combo.add(1);
    combo.add(2);
    combo.add(3);
    for (int i = 3; i < n; i++) {
        combo.add(combo.get(i-1) + combo.get(i-2));
    }
    System.out.println(combo.get(n-1));
    }
}
