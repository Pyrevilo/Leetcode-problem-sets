package easy;

public class addBinary {
    //given 2 strings return their sum as a binary string
    public static void main(String[] args) {
        //test case
        String a = "11", b = "1";

        //solution
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int total = first + second;
        String result = Integer.toBinaryString(total);
        System.out.println(result);
    }
}


//if binary number is too large import big integer and use same algorithm