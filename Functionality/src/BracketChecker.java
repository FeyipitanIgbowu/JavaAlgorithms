public class BracketChecker {
    public static boolean isClosed(String input) {
        int round = 0;
        int curly = 0;
        int square = 0;

        for (int count = 0; count < input.length(); count++) {
            char character = input.charAt(count);

            if (character == '(') round++;
            if (character == ')') round--;
            if (character == '{') curly++;
            if (character == '}') curly--;
            if (character == '[') square++;
            if (character == ']') square--;

            if (round < 0 || curly < 0 || square < 0) {
                return false;
            }
        }
        return (round == 0 && curly == 0 && square == 0);
    }
}
