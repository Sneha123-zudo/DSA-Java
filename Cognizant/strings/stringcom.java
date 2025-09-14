

public class stringcom{
    public static void compress(String str){
        StringBuilder input = new StringBuilder();
        int count = 1;
        for(int i = 0; i<str.length();i++){
            if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                input.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(input.toString());
    }
    public static void main(String[] args) {
        String str = "aabbccddeffg";
        compress(str);
    }
}