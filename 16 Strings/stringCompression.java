public class stringCompression {
    public static void compressString(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 1;

            while (i < str.length()-1 && ch == str.charAt(i + 1)   ) {
                count++;
                i++;
            }

            if (count > 1) {
                sb.append(ch);
                sb.append(count);
            } else {
                sb.append(ch);
            }
        }

        System.out.println("The compressed String is " + sb.toString() );
    }

    public static void main(String args[]) {
        String str = "abbbccddd";
        compressString(str);
    }
}
