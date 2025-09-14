public class reversewords{
    public static void reversestring(String input){
        String [] words = input.split(" ");
        String reversedString = "";
        for(int i = 0; i <words.length; i++){
            String word = words[i];
            char ch;
            String nstr = "";
            for(int j = 0; j<word.length();j++){
                ch = word.charAt(j);
                nstr = ch + nstr;
            }

            reversedString = reversedString + nstr + " ";
        }
        System.out.println(reversedString);


    }
    public static void main(String[] args) {
        String str = "hello I am sneha";
        reversestring(str);
    }
}