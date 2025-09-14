public class reverse{
    public static void main(String[] args) {
        String str = "Sneha Mishra";
        char ch;
        String nstr = "";
        for(int i = 0; i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch+nstr;

        }
        System.out.println(nstr.toLowerCase());

    }
}