public class primerange{
    public static void main(String[] args) {
        int n = 2;
        int m = 15;
        for(int i = n; i<=m; i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int n){
        if(n<2) return false;
        int j = 2;
        while(j*j<=n){
            if(n%j==0){
                return false;
            }
            j++;
        }

        
        return true;
    }
}