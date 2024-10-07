import java.util.Stack;

public class MinimumStringLength {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println("Do dai chuoi la" + minLength(s));
    }

    private static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(!stack.isEmpty() && ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C'))){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
