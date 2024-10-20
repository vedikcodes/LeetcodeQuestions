package leetcode.question;

public class RemoveParantheses {
    public static void main(String[] args) {
        // Example input
       // String input = "(()())(())";
       String input = "(()())(())(()(()))";
        //String input = "()()";

        // Create an instance of the RemoveParantheses class
        RemoveParantheses solution = new RemoveParantheses();

        // Call the removeOuterParantheses method and print the result
        String result = solution.removeOuterParantheses(input);
        System.out.println("Output: " + result);
    }

    public String removeOuterParantheses(String s) {
        StringBuilder result = new StringBuilder(); // To store the final result
        int balance = 0; // To track the level of nested parentheses

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // If balance > 0, it means we are inside nested parentheses, so we append it
                if (balance > 0) {
                    result.append(c);
                }
                balance++; // Increase balance for '('
            } else if (c == ')') {
                balance--; // Decrease balance for ')'
                // If balance > 0, we are inside nested parentheses, so append it
                if (balance > 0) {
                    result.append(c);
                }
            }
        }

        // Return the final string
        return result.toString();
    }
}
