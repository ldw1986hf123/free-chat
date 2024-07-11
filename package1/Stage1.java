package package1;

public class Stage1 {

        public static String removeConsecutiveDuplicates(String s) {
            StringBuilder sb = new StringBuilder();

            int i = 0;
            while (i < s.length()) {
                char currentChar = s.charAt(i);
                int count = 1;

                // Count consecutive identical characters
                while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                    count++;
                    i++;
                }

                // If there are 3 or more consecutive identical characters, skip them
                if (count >= 3) {
                    i++; // Skip all consecutive identical characters
                } else {
                    // Otherwise, add the characters to the StringBuilder
                    for (int j = 0; j < count; j++) {
                        sb.append(currentChar);
                    }
                    i++; // Move to the next character
                }
            }

            // Convert StringBuilder to final result string
            String result = sb.toString();

            // If the result is different from the original string, recurse to process it further
            if (!result.equals(s)) {
                return removeConsecutiveDuplicates(result);
            } else {
                return result;
            }
        }

        public static void main(String[] args) {
            String inputString = "aabcccbbad";
            String result = removeConsecutiveDuplicates(inputString);
            System.out.println("Original string: " + inputString);
            System.out.println("String after removing consecutive duplicates: " + result);
        }

}
