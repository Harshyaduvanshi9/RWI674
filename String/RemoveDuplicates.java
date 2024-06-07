public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "example stringxxxxxx";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(result.indexOf(ch));
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

