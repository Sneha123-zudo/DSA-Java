public class vowels{
    public static void CountVowels(String str){
        
        int vowels = 0;
        int cons = 0;
        str = str.toUpperCase();
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c != ' '){
                if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    vowels++;
                }
                else{
                    cons++;
                }

            }
        }
        System.out.println("Vowels: " + vowels + " Consonanats: " + cons);

    }
    public static void main(String[] args) {
        String str = "Sneha Mishra";
        CountVowels(str);
    }
}