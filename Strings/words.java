public class words {
    public static void main(String[] args) {
        String str = "Hello I am learning JAVA";
        int count = 1;
        for(int i = 0; i<str.length()-1; i++){
            char c = str.charAt(i);
            char d = str.charAt(i+1);
            if(c==' ' && d !=' '){
                count++;
            }

        }
        System.out.println("Count: " + count);
    }
}
