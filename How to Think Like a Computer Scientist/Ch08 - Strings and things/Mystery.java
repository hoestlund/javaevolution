public class Mystery {
    public static String mystery(String s) {
        int i = s.length() - 1;
        String total = "";
        while (i >= 0) {
            char ch = s.charAt(i);
            System.out.println(i + "    " + ch);
            total = total + ch;
            i--;
        }
        return total;
    }
}
