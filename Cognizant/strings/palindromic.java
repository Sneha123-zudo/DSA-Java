public class palindromic{
    public static void main(String[] args) {
        String str = "madamee";
        int flag = 0;
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = 1;
            }
            i++;
            j--;
        }
        if(flag==0){
            System.out.println("Palindromic");
        }
        else{
            System.out.println("Not Plaindromic");
        }
    }
}