package easy;

public class palidrome {
    //given integer X, retyrn true if X is a palidrome
    public static void main(String[] args) {
        //testcase
        int x = 131;

        //solution
        int length = String.valueOf(x).length();
        int[] array = new int[length];
        int digit = 0;
        if (x > 0) {
            System.out.println("false");
        }
        while (x>0) {
            for (int i =0; i < length; i++) {
                digit = x%10;
                x = x/10;
                array[i] = digit;
            }
        }
        for (int j = 1; j < length; j++) {
            if (array[j-1] == array[length - j]) {
                continue;
            }
            else {
                System.out.println("false");
            }
        }
        System.out.println("True");
    }
}
