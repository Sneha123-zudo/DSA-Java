public class even{
    public static void main(String[] args) {
        String str = "Sneha Mishra";
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)%2==0){
                System.out.print(str.charAt(i)+" ".trim());
            }
        }
    }
}