public class StringFrequency {
    public static void main(String[] args) {
        String str = "example string";
        int[] freq = new int[256]; // Assuming ASCII character set

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}

