public class countvowcons{
    public static void main(String[] args) {
        String str = "hello";
        int vows=0,cons=0;
        str.toLowerCase();
        char ch;
        for(int i = 0; i<str.length();i++){
            ch = str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                vows++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowels: " + vows + " Consonants: " + cons);
        }
}