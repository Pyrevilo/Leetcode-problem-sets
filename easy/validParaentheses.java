package easy;
import java.util.ArrayList;

public class validParaentheses {
    //Given string "s" contianing parentheses determin if valid. Open brackets must be closed by same type.
    public static void main(String[] args) {
        //test case
        String s = "()[]{}";

        //solution
        if (s.length()%2 != 0) {
            System.out.println("false");
        }
        ArrayList<Character> str = new ArrayList<Character>();
        ArrayList<Character> close = new ArrayList<Character>();
        for (int i =0; i < s.length(); i++) {
            str.add(s.charAt(i));
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                close.add(s.charAt(i));
            }
        }
        for (int j = 0; j < s.length(); j++) {
            if (str.get(j) == '(' && close.get())
        }
    }
}
