import java.util.*;

public class w3_tailop_25020197 {
    private static final Set<String> OPERATORS = Set.of("+", "-", "*", "/");

    private static boolean isOperator(String op) {
        return op != null && OPERATORS.contains(op);
    }

    private static int getPrecedence(String op) {
        if (op.equals("*") || op.equals("/")) {
            return 2;
        } else if (op.equals("+") || op.equals("-")) {
            return 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine().trim();
        String[] tokens = inp.split("\\s+");

        Stack<String> st = new Stack<>();
        List<String> output = new ArrayList<>();

        for(String token : tokens) {
            if(token.equals("(")) {
                st.push(token);
            }
            else if(token.equals(")")) {
                while (!st.isEmpty() && !st.peek().equals("(")) {
                    output.add(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else if(isOperator(token)) {
                while (!st.isEmpty() && isOperator(st.peek()) &&
                        getPrecedence(st.peek()) >= getPrecedence(token)) {
                    output.add(st.pop());
                }
                st.push(token);
            }
            else {
                output.add(token);
            }
        }

        while (!st.isEmpty()) {
            output.add(st.pop());
        }

        System.out.println(String.join(" ", output));

        scanner.close();
    }
}