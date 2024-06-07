public class CountOccurrences {
    public static void main(String[] args) {
        String str = "example string";
        char ch = 'e';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' occurs " + count + " times.");
    }
}

