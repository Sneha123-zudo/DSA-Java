
import java.util.Arrays;

public class Anagram{
    public static void anagramcheck(String s1, String s2){
        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char [] a = s1.toCharArray();
        char [] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
             System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
       

    }
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "rare";
        anagramcheck(s1, s2);
    }
}