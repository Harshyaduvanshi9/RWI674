public class CountCase {
    public static void main(String[] args) {
        String str = "Example String";
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
        }

        System.out.println("Lowercase count: " + lowerCaseCount);
        System.out.println("Uppercase count: " + upperCaseCount);
    }
}
