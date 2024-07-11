package package1;

public class Stage2 {

        public static String replaceConsecutiveDuplicates(String s) {
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

                // Append the replacement character (one before alphabetically)
                sb.append((char) (currentChar - 1));

                // Move to the next character
                i++;
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            String inputString = "abcccbad";
            String result = replaceConsecutiveDuplicates(inputString);
            System.out.println("Original string: " + inputString);
            System.out.println("String after replacing consecutive duplicates: " + result);
        }


}
