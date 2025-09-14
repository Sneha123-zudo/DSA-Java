public class count{
    public static void main(String[] args) {
        int count=1;
        String str = "Hello how are you";
        for(int i = 0; i<str.length()-1;i++){
            char c = str.charAt(i);
            char d = str.charAt(i+1);
            if(c == ' ' && d !=' '){
                count++;
            }
        }
           System.out.println(count);
    }
}