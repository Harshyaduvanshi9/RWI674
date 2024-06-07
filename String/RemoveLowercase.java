public class RemoveLowercase {
    public static void main(String[] args) {
        String str = "Example String";
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isLowerCase(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("String after removing lowercase characters: " + sb.toString());
    }
}

