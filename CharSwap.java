public class prog {

   
    static String swapPairs(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

       
        char[] chars = str.toCharArray();

     
        for (int i = 0; i + 1 < chars.length; i += 2) {

            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + swapPairs(str));
    }
}
