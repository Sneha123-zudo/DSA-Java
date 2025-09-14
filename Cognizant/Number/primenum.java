public class primenum{
    public static boolean prime(int n){
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(prime(n));

    }
}