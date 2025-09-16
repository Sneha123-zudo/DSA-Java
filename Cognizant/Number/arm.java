public class arm{
    public static void main(String[] args) {
        int n = 371;
        int on = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10; 
        }
        if(on==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}